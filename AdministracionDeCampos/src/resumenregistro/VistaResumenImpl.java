/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumenregistro;

import administraciondecampos.ControladorVistas;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.hibernate.SessionFactory;
import registrocampo.ItemLote;

/**
 *
 * @author andresteve07
 */
public class VistaResumenImpl extends javax.swing.JPanel implements VistaResumen{
    private PresentadorResumen presentador;
    private ControladorVistas controlador;
    private DefaultTableModel modeloTablaLotes;
    
    public VistaResumenImpl(Long idCampo, ControladorVistas controlador, SessionFactory fabricaSesiones) {
        this.controlador = controlador;
        this.modeloTablaLotes = new DefaultTableModel();
        this.modeloTablaLotes.addColumn("Número");
        this.modeloTablaLotes.addColumn("Superficie");
        this.modeloTablaLotes.addColumn("Tipo de Suelo");
        initComponents();
        this.presentador = new PresentadorResumenImpl(idCampo,this,fabricaSesiones);
        this.presentador.iniciar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textoNombreCampo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoSuperficieCampo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLotes = new javax.swing.JTable();
        botonAceptar = new javax.swing.JButton();

        jLabel1.setText("El Campo");

        textoNombreCampo.setText("__");

        jLabel3.setText("de");

        textoSuperficieCampo.setText("50");

        jLabel5.setText("ha. fue exitosamente agregado");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel6.setText("Lotes");

        tablaLotes.setModel(modeloTablaLotes);
        jScrollPane1.setViewportView(tablaLotes);

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoNombreCampo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textoSuperficieCampo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textoNombreCampo)
                    .addComponent(jLabel3)
                    .addComponent(textoSuperficieCampo)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonAceptar)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        this.lanzarRegistro();
    }//GEN-LAST:event_botonAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaLotes;
    private javax.swing.JLabel textoNombreCampo;
    private javax.swing.JLabel textoSuperficieCampo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarItemsLote(List<ItemLote> items) {
       for(ItemLote item : items){
           this.modeloTablaLotes.addRow(new Object[]{item.getNumero().toString(), item.getSuperficie().toString(), item.getTipoSuelo()});
       }
    }

    @Override
    public void mostrarNombreCampo(String nombre) {
        this.textoNombreCampo.setText(nombre);
    }

    @Override
    public void mostrarSuperficieCampo(String sup) {
        this.textoSuperficieCampo.setText(sup);
    }

    @Override
    public JPanel getPanel() {
        return this;
    }

    @Override
    public void lanzarRegistro() {
        this.controlador.lanzarVistaRegistro();
    }
}
