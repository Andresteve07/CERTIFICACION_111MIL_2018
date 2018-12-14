/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocampo;

import administraciondecampos.entidades.Campo;
import administraciondecampos.entidades.Lote;
import administraciondecampos.entidades.TiposSuelo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author andresteve07
 */
public class PresentadorRegistroImpl implements PresentadorRegistro{
    private VistaRegistro vista;
    private ProveedorRegistro proveedor;
    
    private List<Lote> lotesEnTabla;
    private Long ultimoValorSuperficieCampo;
    
    public PresentadorRegistroImpl(VistaRegistro vista, SessionFactory fabricaSesiones){
        this.lotesEnTabla = new ArrayList<>();
        this.vista = vista;
        this.proveedor = new ProveedorRegistroImpl(fabricaSesiones);
    }

    @Override
    public void iniciar() {
        
    }

    @Override
    public void validarNombreCampo(String nombre) {
        List<Campo> campos = this.proveedor.buscarPorNombre(nombre);
        if(campos.isEmpty()){
            this.vista.ocultarNombreCampoEnUso();
        } else {
            this.vista.mostrarNombreCampoEnUso();
        }
        
    }

    @Override
    public void validarSuperficieCampo(String superficie) {
        try{
            this.ultimoValorSuperficieCampo = Long.parseLong(superficie);
        } catch(NumberFormatException numExc){
            this.vista.mostrarParametrosInvalidos();
        }
    }

    @Override
    public void validarNumeroLote(String numeroLote) {
        for(Lote lote: this.lotesEnTabla){
            if(lote.getNumero() == Long.parseLong(numeroLote)){
                this.vista.mostrarNroLoteEnUso();
                return;
            }
        }
        this.vista.ocultarNroLoteEnUso();
        
    }

    @Override
    public void validarSuperficieLote(String superficieLote) {
        Long sumaSupLotes = 0L;
        for(Lote lote: this.lotesEnTabla){
            sumaSupLotes+=lote.getSuperficie();
        }
        try{
            if(sumaSupLotes + Long.parseLong(superficieLote) > this.ultimoValorSuperficieCampo){
            this.vista.mostrarMaximoSupExcedido();
            } else {
                this.vista.ocultarMaximoSupExcedido();
            }
        } catch(NumberFormatException formatExc){
            this.vista.mostrarParametrosInvalidos();
        }       
    }

    @Override
    public void agregarLote(String nroLote, String supLote, Integer tipoSuelo) {
        try{
            Long numLote = Long.parseLong(nroLote);
            Long sup = Long.parseLong(supLote);
            Lote nuevoLote = new Lote();
            nuevoLote.setNumero(numLote);
            nuevoLote.setSuperficie(sup);
            nuevoLote.setTipoSuelo(tipoSuelo);
            this.lotesEnTabla.add(nuevoLote);
            this.vista.agregarItem(new ItemLote(numLote,sup,TiposSuelo.from(tipoSuelo).toString()));
        } catch(NumberFormatException numExc){
            this.vista.mostrarParametrosInvalidos();
        }
        
        
    }

    @Override
    public void editarLote(Integer indice) {
        if(indice<0){
            return;
        }
        imprimirLotes();
        Lote lote = this.lotesEnTabla.get(indice);
        this.vista.popularInfoDeLote(lote.getNumero().toString(),lote.getSuperficie().toString(),lote.getTipoSuelo());
        this.lotesEnTabla.remove(lote);
        this.vista.quitarItem(indice);
    }

    public void imprimirLotes(){
        for(Lote lote: this.lotesEnTabla){
            System.out.println("LOTE: " + lote.getNumero());
        }
    }
    @Override
    public void quitarLote(Integer indice) {
        if(indice<0){
            return;
        }
        this.lotesEnTabla.remove(this.lotesEnTabla.get(indice));
        this.vista.quitarItem(indice);
    }

    @Override
    public void cancelarRegistro() {
        
    }

    @Override
    public void registrarCampo() {
        
    }
    
}
