
package Controlador;

import Clases.SolicitudViatico;
import Clases.Trabajador;
import java.util.List;
import Modelo.TrabajadorDao;

public class cTrabajador {
   public List<Trabajador> getEmpleados() {
       TrabajadorDao objD = new TrabajadorDao();
       return objD.getTrabajadores();
   } 

//METODOS ADMIN:
    public boolean addTrabajador(Trabajador obj){
        TrabajadorDao objD=new TrabajadorDao();
        return objD.addTrabajador(obj);
    }
//METODOS COMISIONADO:
   public void addSolicitudViatico(SolicitudViatico obj){
       TrabajadorDao objD = new TrabajadorDao();
       objD.addSolicitudViatico(obj);
       
   }
}
