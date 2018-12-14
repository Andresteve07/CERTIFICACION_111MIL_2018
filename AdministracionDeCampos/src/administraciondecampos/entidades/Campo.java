/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administraciondecampos.entidades;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 *
 * @author andresteve07
 */

//@Entity
//@Table(name="campo")
public class Campo {

    //@Id
    //@GeneratedValue
    private Long id;
    
    private String nombre;
    
    private Long superficie;
    /*
    @OneToMany(
        mappedBy = "lote", 
        cascade = CascadeType.ALL, 
        orphanRemoval = true
    )*/
    private Set<Lote> lotes;

    public Campo() {
        //this.lotes = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Long superficie) {
        this.superficie = superficie;
    }

    
    /*
    public void agregarLote(Lote lote){
        this.lotes.add(lote);
        lote.setCampo(this);
    }
    
    public void quitarLote(Lote lote){
        this.lotes.remove(lote);
        lote.setCampo(null);
    }
*/

    public Set<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(Set<Lote> lotes) {
        this.lotes = lotes;
    }
}
