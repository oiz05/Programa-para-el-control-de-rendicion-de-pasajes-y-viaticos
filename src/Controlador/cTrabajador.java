
package Controlador;

import Clases.DocumentoAcreditadorGasto;
import Clases.SolicitudViatico;
import Clases.Trabajador;
import java.util.List;
import Modelo.TrabajadorDao;

public class cTrabajador {
   public List<Trabajador> getTrabajadores() {
       TrabajadorDao objD = new TrabajadorDao();
       return objD.getTrabajadores();
   } 

//METODOS ADMIN:
    public boolean addTrabajador(Trabajador obj){
        TrabajadorDao objD=new TrabajadorDao();
        return objD.addTrabajador(obj);
    }
    public Trabajador getTrabajador(String filtro){
        TrabajadorDao objD=new TrabajadorDao();
        return objD.getTrabajador(filtro);
    }
//METODOS COMISIONADO-----------------------------------------------------------------------
   public boolean addSolicitudViatico(SolicitudViatico obj){
       TrabajadorDao objD=new TrabajadorDao();
      return objD.addSolicitudViatico(obj);
   }
   
   public List<SolicitudViatico> getSolicitudes() {
         TrabajadorDao objD=new TrabajadorDao();
         return objD.getSolicitudes();
   }
   
   
   
   public boolean addDocumentoAcreditadorGasto(DocumentoAcreditadorGasto obj){
       TrabajadorDao objD=new TrabajadorDao();
       return objD.addDocumentoAcreditadorGasto(obj);
   }
//------------------------------------------------------------------------------------------
}
