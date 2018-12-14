/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumenregistro;

import administraciondecampos.entidades.Campo;

/**
 *
 * @author andresteve07
 */
public interface ProveedorResumen {
    public Campo buscarCampoPorId(Long id);
    
}
