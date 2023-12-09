
package Controlador;

import Clases.Trabajador;
import java.util.List;
import Modelo.TrabajadorDao;

public class cTrabajador {
   public List<Trabajador> getEmpleados() {
       TrabajadorDao objD = new TrabajadorDao();
       return objD.getTrabajadores();
   } 
}
