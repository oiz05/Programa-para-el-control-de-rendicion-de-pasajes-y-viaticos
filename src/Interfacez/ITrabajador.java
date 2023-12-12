
package Interfacez;

import Clases.DocumentoAcreditadorGasto;
import Clases.SolicitudViatico;
import Clases.Trabajador;
import java.util.List;
public interface ITrabajador {
    
    public boolean add(Object obj);
    public boolean update(Trabajador obj);
    public boolean delete(String login);
    public List<Trabajador> getTrabajadores();
    public Trabajador getTrabajador(String filtro);
    //METODOS ADMIN
    public Trabajador[] getAllTrabajador();
    public Trabajador getTrabajadorByIndex(int index);
    public boolean addTrabajador(Trabajador obj);
    public void updateTrabajador(Trabajador obj);
    public void deleteTrabajador(String codigo);
    
    //METODOS COMISIONADO:
    public boolean addSolicitudViatico(SolicitudViatico obj);
    public List<SolicitudViatico> getSolicitudes();
    public SolicitudViatico getSolicitudViatico(String filtro);  //Buscar
    public void updateSolicitudViatico(SolicitudViatico obj); //Actualizar o editar
    public void deleteSolicitudViatico(String codigoSolicitud); //Eliminar
    
    public boolean addDocumentoAcreditadorGasto(DocumentoAcreditadorGasto obj);
    public List <DocumentoAcreditadorGasto> getDocumentos(); //Listado
    public DocumentoAcreditadorGasto getDocumentoAcreditadorGasto(String filtro);  //Buscar
    public void updateDocumentoAcrditadorGasto(DocumentoAcreditadorGasto obj); //Actualizar o editar
    public void deleteDocumentoAcreditadorGasto(String filtro); //Eliminar
}
