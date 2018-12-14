/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocampo;

/**
 *
 * @author andresteve07
 */
class ItemLote {
    private Long numero;
    private Long superficie;
    private String tipoSuelo;

    public ItemLote(Long numero, Long superficie, String tipoSuelo) {
        this.numero = numero;
        this.superficie = superficie;
        this.tipoSuelo = tipoSuelo;
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

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }
}
