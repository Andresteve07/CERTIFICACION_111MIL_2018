/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administraciondecampos;

import administraciondecampos.entidades.Campo;
import javax.swing.JPanel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import registrocampo.VistaRegistro;
import registrocampo.VistaRegistroImpl;
import resumenregistro.VistaResumen;
import resumenregistro.VistaResumenImpl;

/**
 *
 * @author andresteve07
 */
public class AdministracionDeCampos implements ControladorVistas{
    private VentanaPrincipal ventanaPrincipal;
    private VistaRegistro vistaRegistro;
    private VistaResumen vistaResumen;
    
    private final SessionFactory fabricaSesiones;
    private Session sesionaActual;

    public AdministracionDeCampos() {
        this.fabricaSesiones = HibernateUtil.getSessionFactory();
        this.sesionaActual = this.fabricaSesiones.getCurrentSession();       
        
        Campo campo = new Campo();
        campo.setNombre("ascascs");
        campo.setSuperficie(123L);
        campo.setLotes(null);
        Transaction tx = this.sesionaActual.beginTransaction();
        this.sesionaActual.save(campo);
        tx.commit();
        
    }

    public void iniciarPrograma(){
        this.ventanaPrincipal = new VentanaPrincipal();
        this.lanzarVistaRegistro();
        this.ventanaPrincipal.setVisible(true);
    }
    
    public void cambiarPanel(JPanel panel){
        this.ventanaPrincipal.setContentPane(panel);
        this.ventanaPrincipal.repaint();
        this.ventanaPrincipal.revalidate();
    }
    
    public static void main(String[] args) {
        AdministracionDeCampos administrador = new AdministracionDeCampos();
        
        java.awt.EventQueue.invokeLater(() -> {
            administrador.iniciarPrograma();
        });
    }

    @Override
    public void lanzarVistaRegistro() {
        if (this.vistaRegistro == null) {
            this.vistaRegistro = new VistaRegistroImpl(this,this.fabricaSesiones);
        }
        this.ventanaPrincipal.setTitle("Registrar Campo");
        this.cambiarPanel(this.vistaRegistro.getPanel());
    }

    @Override
    public void lanzarVistaResumen(Long idCampo) {
        if (this.vistaResumen == null){
            this.vistaResumen = new VistaResumenImpl(idCampo, this, fabricaSesiones);
        }
        this.ventanaPrincipal.setTitle("Campo registrado con Éxito");
        this.cambiarPanel(this.vistaResumen.getPanel());
    }
    
}
