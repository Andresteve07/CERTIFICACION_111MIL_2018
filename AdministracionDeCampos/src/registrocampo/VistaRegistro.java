/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocampo;

import administraciondecampos.Vista;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author andresteve07
 */
public interface VistaRegistro extends Vista{
    public void mostrarNombreCampoEnUso();
    public void mostrarNroLoteEnUso();
    public void mostrarListaDeItems(List<ItemLote> items);
    public void agregarItem(ItemLote item);
    public void quitarItem(Integer indice);

    public void ocultarNombreCampoEnUso();

    public void mostrarParametrosInvalidos();

    public void popularInfoDeLote(String num, String sup, Integer indice);

    public void mostrarMaximoSupExcedido();

    public void ocultarNroLoteEnUso();

    public void ocultarMaximoSupExcedido();

    public void limpiarTodo();

    public void lanzarVistaResumen(Long id);

    public void limpiarDatosLote();

}
