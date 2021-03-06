/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocampo;

import administraciondecampos.ControladorVistas;
import java.awt.Component;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author andresteve07
 */
public class VistaRegistroImpl extends javax.swing.JPanel implements VistaRegistro{

    private PresentadorRegistro presentador;
    private ControladorVistas controlador;
    private DefaultTableModel modeloTablaLotes;

    public VistaRegistroImpl(ControladorVistas controlador, SessionFactory fabricaSesiones) {
        this.controlador = controlador;
        this.modeloTablaLotes = new DefaultTableModel();
        this.modeloTablaLotes.addColumn("Número");
        this.modeloTablaLotes.addColumn("Superficie");
        this.modeloTablaLotes.addColumn("Tipo de Suelo");
        initComponents();
        afterInit();
        this.presentador = new PresentadorRegistroImpl(this, fabricaSesiones);
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
        TextoNombreCampo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextoSuperficieCampo = new javax.swing.JTextField();
        textoErrorNombreCampo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextoNumeroLote = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextoSuperficieLote = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        selectorTiposSuelo = new javax.swing.JComboBox<>();
        textoErrorNumeroLote = new javax.swing.JLabel();
        BotonAgregarLote = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLotes = new javax.swing.JTable();
        BotonEditarLote = new javax.swing.JButton();
        BotonQuitarLote = new javax.swing.JButton();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancelarRegistro = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        textoErrorSupLote = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Nombre");

        TextoNombreCampo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextoNombreCampoFocusLost(evt);
            }
        });

        jLabel2.setText("Superficie");

        TextoSuperficieCampo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextoSuperficieCampoFocusLost(evt);
            }
        });

        textoErrorNombreCampo.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        textoErrorNombreCampo.setForeground(new java.awt.Color(227, 40, 40));
        textoErrorNombreCampo.setText("Este nombre ya está en uso.");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setText("Lotes");

        jLabel5.setFont(new java.awt.Font("Ubuntu Light", 2, 12)); // NOI18N
        jLabel5.setText("Tenga en cuenta que al menos debe ingresar un  Lote.");

        jLabel6.setText("Número:");

        TextoNumeroLote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextoNumeroLoteFocusLost(evt);
            }
        });

        jLabel7.setText("Superficie:");

        TextoSuperficieLote.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextoSuperficieLoteFocusLost(evt);
            }
        });
        TextoSuperficieLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoSuperficieLoteActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de suelo:");

        selectorTiposSuelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I", "II", "III", "IV", "V" }));
        selectorTiposSuelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectorTiposSueloItemStateChanged(evt);
            }
        });
        selectorTiposSuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorTiposSueloActionPerformed(evt);
            }
        });

        textoErrorNumeroLote.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        textoErrorNumeroLote.setForeground(new java.awt.Color(229, 38, 38));
        textoErrorNumeroLote.setText("Este número de Lote ya está en uso.");

        BotonAgregarLote.setText("Agregar Lote");
        BotonAgregarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarLoteActionPerformed(evt);
            }
        });

        tablaLotes.setModel(modeloTablaLotes);
        jScrollPane1.setViewportView(tablaLotes);

        BotonEditarLote.setText("Editar");
        BotonEditarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarLoteActionPerformed(evt);
            }
        });

        BotonQuitarLote.setText("Quitar");
        BotonQuitarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonQuitarLoteActionPerformed(evt);
            }
        });

        BotonRegistrar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BotonRegistrar.setText("Registrar Campo");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonCancelarRegistro.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        BotonCancelarRegistro.setText("Cancelar");
        BotonCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarRegistroActionPerformed(evt);
            }
        });

        textoErrorSupLote.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        textoErrorSupLote.setForeground(new java.awt.Color(229, 38, 38));
        textoErrorSupLote.setText("Superficie de Campo Excedida.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(BotonAgregarLote))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(textoErrorNumeroLote))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(selectorTiposSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TextoSuperficieLote, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(121, 121, 121)
                                    .addComponent(TextoNumeroLote, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(textoErrorSupLote)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotonEditarLote)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonQuitarLote))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BotonCancelarRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonRegistrar)))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel1))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextoNombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(textoErrorNombreCampo))
                                    .addComponent(TextoSuperficieCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextoNombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoErrorNombreCampo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextoSuperficieCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextoNumeroLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TextoSuperficieLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(selectorTiposSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(textoErrorNumeroLote)
                        .addGap(18, 18, 18)
                        .addComponent(textoErrorSupLote)
                        .addGap(18, 18, 18)
                        .addComponent(BotonAgregarLote))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonEditarLote)
                            .addComponent(BotonQuitarLote))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonRegistrar)
                            .addComponent(BotonCancelarRegistro))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void afterInit(){
        this.textoErrorNombreCampo.setVisible(false);
        this.textoErrorNumeroLote.setVisible(false);
        this.textoErrorSupLote.setVisible(false);
        if (this.tablaLotes.getCellSelectionEnabled()) {
            this.tablaLotes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }
        JDialog.setDefaultLookAndFeelDecorated(true);
    }
    private void BotonAgregarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarLoteActionPerformed
        // TODO add your handling code here:
        
        this.presentador.agregarLote(this.TextoNumeroLote.getText(), 
                this.TextoSuperficieLote.getText(), 
                this.selectorTiposSuelo.getSelectedIndex());
        
    }//GEN-LAST:event_BotonAgregarLoteActionPerformed

    private void BotonQuitarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonQuitarLoteActionPerformed
        int rowIndex = this.tablaLotes.getSelectedRow();
        this.presentador.quitarLote(rowIndex);
    }//GEN-LAST:event_BotonQuitarLoteActionPerformed

    private void TextoSuperficieLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoSuperficieLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoSuperficieLoteActionPerformed

    private void BotonCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarRegistroActionPerformed
        this.presentador.cancelarRegistro();
    }//GEN-LAST:event_BotonCancelarRegistroActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "¿Confirma el registro del Campo?", "Registrar Campo",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch(response){
            case JOptionPane.YES_OPTION:
                System.out.println("SIP");
                this.presentador.registrarCampo();
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("NOP");
                break;
            default:
                break;
        }
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void TextoNombreCampoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextoNombreCampoFocusLost
        this.presentador.validarNombreCampo(this.TextoNombreCampo.getText());
    }//GEN-LAST:event_TextoNombreCampoFocusLost

    private void selectorTiposSueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorTiposSueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectorTiposSueloActionPerformed

    private void BotonEditarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarLoteActionPerformed
        int rowIndex = this.tablaLotes.getSelectedRow();
        this.presentador.editarLote(rowIndex);
    }//GEN-LAST:event_BotonEditarLoteActionPerformed

    private void selectorTiposSueloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectorTiposSueloItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_selectorTiposSueloItemStateChanged

    private void TextoSuperficieCampoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextoSuperficieCampoFocusLost
        this.presentador.validarSuperficieCampo(this.TextoSuperficieCampo.getText());
    }//GEN-LAST:event_TextoSuperficieCampoFocusLost

    private void TextoNumeroLoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextoNumeroLoteFocusLost
        this.presentador.validarNumeroLote(this.TextoNumeroLote.getText());
    }//GEN-LAST:event_TextoNumeroLoteFocusLost

    private void TextoSuperficieLoteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextoSuperficieLoteFocusLost
        this.presentador.validarSuperficieLote(this.TextoSuperficieLote.getText());
    }//GEN-LAST:event_TextoSuperficieLoteFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregarLote;
    private javax.swing.JButton BotonCancelarRegistro;
    private javax.swing.JButton BotonEditarLote;
    private javax.swing.JButton BotonQuitarLote;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JTextField TextoNombreCampo;
    private javax.swing.JTextField TextoNumeroLote;
    private javax.swing.JTextField TextoSuperficieCampo;
    private javax.swing.JTextField TextoSuperficieLote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> selectorTiposSuelo;
    private javax.swing.JTable tablaLotes;
    private javax.swing.JLabel textoErrorNombreCampo;
    private javax.swing.JLabel textoErrorNumeroLote;
    private javax.swing.JLabel textoErrorSupLote;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarNombreCampoEnUso() {
        this.textoErrorNombreCampo.setVisible(true);
    }

    @Override
    public void ocultarNombreCampoEnUso() {
        this.textoErrorNombreCampo.setVisible(false);
    }
    
    @Override
    public void mostrarNroLoteEnUso() {
        
        this.textoErrorNumeroLote.setVisible(true);
    }
    
    @Override
    public void ocultarNroLoteEnUso() {
        
        this.textoErrorNumeroLote.setVisible(false);
    }

    @Override
    public void mostrarListaDeItems(List<ItemLote> items) {
        
    }

    @Override
    public JPanel getPanel() {
        return this;
    }

    @Override
    public void agregarItem(ItemLote item) {
        this.modeloTablaLotes.addRow(new Object[]{item.getNumero().toString(),item.getSuperficie().toString(),item.getTipoSuelo()});
    }

    @Override
    public void quitarItem(Integer indice) {
        this.modeloTablaLotes.removeRow(indice);
    }

    @Override
    public void mostrarParametrosInvalidos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void popularInfoDeLote(String nro, String sup, Integer indice) {
        this.selectorTiposSuelo.setSelectedIndex(indice);
        this.TextoNumeroLote.setText(nro);
        this.TextoSuperficieLote.setText(sup);
    }

    @Override
    public void mostrarMaximoSupExcedido() {
        this.textoErrorSupLote.setVisible(true);
    }
    
    @Override
    public void ocultarMaximoSupExcedido() {
        this.textoErrorSupLote.setVisible(false);
    }

    @Override
    public void limpiarTodo() {
        this.TextoNombreCampo.setText("");
        this.TextoSuperficieCampo.setText("");
        this.TextoNumeroLote.setText("");
        this.TextoSuperficieLote.setText("");
        this.selectorTiposSuelo.setSelectedIndex(0);
        this.modeloTablaLotes.setRowCount(0);
        this.tablaLotes.revalidate();
    }

    @Override
    public void lanzarVistaResumen(Long id) {
        this.controlador.lanzarVistaResumen(id);
    }

    @Override
    public void limpiarDatosLote() {
        this.TextoNumeroLote.setText("");
        this.TextoSuperficieLote.setText("");
        this.selectorTiposSuelo.setSelectedIndex(0);
    }
}
