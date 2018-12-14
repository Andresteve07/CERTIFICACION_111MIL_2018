/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administraciondecampos.entidades;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author andresteve07
 */
public enum TiposSuelo {
    I(0),
    II(1),
    III(2),
    IV(3),
    V(4);
    
    private final Integer tipoID;
    private static Map<Integer, TiposSuelo> map = new HashMap<>();

    static {
        for (TiposSuelo tipoSueloEnum : TiposSuelo.values()) {
            map.put(tipoSueloEnum.tipoID, tipoSueloEnum);
        }
    }
    TiposSuelo(Integer tipoID){
        this.tipoID = tipoID;
    }
    public Integer getStateID(){
        return this.tipoID;
    }
    public static TiposSuelo from(int value) {
        return map.get(value);
    }
}
