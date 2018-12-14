/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resumenregistro;

import administraciondecampos.entidades.Campo;
import administraciondecampos.entidades.Lote;
import administraciondecampos.entidades.TiposSuelo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import registrocampo.ItemLote;

/**
 *
 * @author andresteve07
 */
public class PresentadorResumenImpl implements PresentadorResumen{
    private VistaResumen vista;
    private ProveedorResumen proveedor;
    
    private Long idCampo;
    private Campo campo;

    public PresentadorResumenImpl(Long idCampo, VistaResumen vista, SessionFactory fabricaSesiones) {
        this.vista = vista;
        this.proveedor = new ProveedorResumenImpl(fabricaSesiones);
        this.idCampo = idCampo;
    }
    
    @Override
    public void iniciar() {
        this.campo = this.proveedor.buscarCampoPorId(this.idCampo);
        if (this.campo != null){
            this.vista.mostrarNombreCampo(this.campo.getNombre());
            this.vista.mostrarSuperficieCampo(this.campo.getSuperficie().toString());
            this.vista.mostrarItemsLote(this.mapearLotesAItems(new ArrayList<>(this.campo.getLotes())));
        } else {
            this.vista.lanzarRegistro();
        }
    }
    
    private List<ItemLote> mapearLotesAItems(List<Lote> lotes){
        List<ItemLote> items = new ArrayList<>();
        for(Lote lote : lotes){
            items.add(new ItemLote(lote.getId(), lote.getSuperficie(), TiposSuelo.from(lote.getTipoSuelo()).toString()));
        }
        return items;
    }
    
}
