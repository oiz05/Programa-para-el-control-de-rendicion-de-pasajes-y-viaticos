
package EstructuraDeDatos;

import Clases.DocumentoAcreditadorGasto;
import Clases.SolicitudViatico;
import Clases.Trabajador;
import Interfacez.ITrabajador;
import java.util.List;
public class ArregloTrabajador implements ITrabajador {

    Trabajador[] listaT = null;
    private int index;
    
    public ArregloTrabajador(int cantidad){
        this.index=0;
        listaT=new Trabajador[cantidad];
    }
    
    @Override
    public Trabajador[] getAllTrabajador() {
        return null;
    }

    @Override
    public Trabajador getTrabajadorByIndex(int index) {
        return listaT[index];
    }

    @Override
    public boolean addTrabajador(Trabajador obj) {
        listaT[index]= obj;
        index++;
        return false;
    }

    @Override
    public void updateTrabajador(Trabajador obj) {
        
    }

    @Override
    public void deleteTrabajador(String codigo) {
        
    }

    @Override
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean update(Trabajador obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Trabajador> getTrabajadores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Trabajador getTrabajador(String login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addSolicitudViatico(SolicitudViatico obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean addDocumentoAcreditadorGasto(DocumentoAcreditadorGasto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}