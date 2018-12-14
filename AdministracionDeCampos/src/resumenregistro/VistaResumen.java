/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumenregistro;

import administraciondecampos.Vista;
import java.util.List;
import registrocampo.ItemLote;

/**
 *
 * @author andresteve07
 */
public interface VistaResumen extends Vista{
    
    public void mostrarItemsLote(List<ItemLote> items);
    public void mostrarNombreCampo(String nombre);
    public void mostrarSuperficieCampo(String sup);

    public void lanzarRegistro();
    
}
