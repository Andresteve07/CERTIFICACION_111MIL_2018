/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocampo;

import administraciondecampos.entidades.Campo;
import java.util.List;

/**
 *
 * @author andresteve07
 */
public interface ProveedorRegistro {

    public List<Campo> buscarPorNombre(String nombre);
}
