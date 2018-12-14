/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumenregistro;

import administraciondecampos.entidades.Campo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author andresteve07
 */
public class ProveedorResumenImpl implements ProveedorResumen{
     private SessionFactory fabricaSesiones;

    public ProveedorResumenImpl(SessionFactory fabricaSesiones) {
        this.fabricaSesiones = fabricaSesiones;
    }
     
    @Override
    public Campo buscarCampoPorId(Long id) {
        Session sesion = this.fabricaSesiones.getCurrentSession();
        Transaction tx = sesion.beginTransaction();
        Campo campo = (Campo) sesion.get(Campo.class, id);
        tx.commit();
        System.out.println("LOTES_SIZE: " + campo.getLotes().size());
        return campo;        
    }
    
}
