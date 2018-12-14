/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocampo;

import administraciondecampos.entidades.Campo;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author andresteve07
 */
public class ProveedorRegistroImpl implements ProveedorRegistro{

    private SessionFactory fabricaSesiones;
    
    public ProveedorRegistroImpl(SessionFactory fabricaSesiones) {
        this.fabricaSesiones = fabricaSesiones;
    }
    
    
    @Override
    public List<Campo> buscarPorNombre(String nombre) {
        Session sesion = this.fabricaSesiones.getCurrentSession();
        Transaction tx = sesion.beginTransaction();
        List<Campo> campos = sesion.createCriteria(Campo.class).list();
        Iterator<Campo> iterador = campos.iterator();
        while(iterador.hasNext()){
            Campo campo = iterador.next();
            System.out.println(campo.getNombre());
            if(!campo.getNombre().equals(nombre)){
                iterador.remove();
            }
        }
        tx.commit();        
        return campos;
    }

    @Override
    public void guardarCampo(Campo campo) {
        Session sesion = this.fabricaSesiones.getCurrentSession();
        Transaction tx = sesion.beginTransaction();
        sesion.save(campo);
        tx.commit();
    }
    
}
