/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administraciondecampos.entidades;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author andresteve07
 */
//@Entity
//@Table(name="lote")
public class Lote {
    
    //@Id
    //@GeneratedValue
    private Long id;
    private Long numero;
    private Long superficie;
    private Integer tipoSuelo;
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "campo_id")
    private Campo campo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public Long getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Long superficie) {
        this.superficie = superficie;
    }

    public Integer getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(Integer tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }
/*
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lote other = (Lote) obj;
        return Objects.equals(this.id, other.id);
    }
    */
}
