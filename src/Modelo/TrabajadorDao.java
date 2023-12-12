package Modelo;


import Clases.Cargo;
import Clases.Comisionado;
import Clases.DocumentoAcreditadorGasto;
import Clases.SolicitudViatico;
import Clases.Trabajador;
import Clases.Viatico;
import Interfacez.ITrabajador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import static util.DataSource.DataSource;

public class TrabajadorDao implements ITrabajador{
    
    private Connection obtenerConexion() throws SQLException, ClassNotFoundException {
        // Establecer la conexión con la base de datos SQL Server
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://95.217.180.168:1433;databaseName=ControlPV;encrypt=false;trustServerCertificate=true;";
        String usuario = "sa";
        String contraseña = "01K#cjWq3c";
        return DriverManager.getConnection(url, usuario, contraseña);
    
        }

    @Override
    public boolean add(Object obj) {
        return false; //FALTA MODIFICAR
    }

    @Override
    public boolean update(Trabajador obj) {
        return false; //FALTA MODIFICAR
    }

    @Override
    public boolean delete(String login) {
        return false; //FALTA MODIFICAR
    }

    @Override
    public List<Trabajador> getTrabajadores() {
        ArrayList<Trabajador> data = new ArrayList<>();
        String query="select ";
                query+="upper(nombre_trabajador), ";
                query+="upper(apellido_trabajador), ";
                query+="upper(codigo_trabajador), ";
                query+="upper(tipo_documento), ";
                query+="upper(sexo_trabajador), ";
                query+="upper(direccion_trabajador),";
                query+="upper(tipo_cargo),";
                query+="upper(nombre_cargo) ";
                query+="from Trabajador";
        try{
            
            Statement  stmt = DataSource().createStatement();       
            ResultSet rs = stmt.executeQuery(query);            
            
        //Recuperacion de registros
        while(rs.next()){
                
                Trabajador trabaj = new Trabajador();
                trabaj.setNombre(rs.getString(1));    
                trabaj.setApellido(rs.getString(2));
                trabaj.setCodigo(rs.getString(3));
                trabaj.setTipoDocumento(rs.getString(4));
                trabaj.setSexo(rs.getString(5));
                trabaj.setDireccion(rs.getString(6));
                Cargo cgo=new Cargo(rs.getString(7),rs.getString(8));
                trabaj.setCargo(cgo);                
                data.add(trabaj); 
                      
            }
        }
        catch(Exception ex){System.out.println(ex.getMessage());}
        return data;
    }

    @Override
    public Trabajador getTrabajador(String filtro) {
        Trabajador tbjd = null;
        String query="select * from Trabajador where codigo_trabajador like ?";
        try{
            Connection conn = obtenerConexion();
            PreparedStatement stmt=conn.prepareStatement(query);
            stmt.setString(1, "%" + "?" + "%");
            ResultSet rs = stmt.executeQuery();
            
            
            
            Cargo cgo=new Cargo(rs.getString(7),rs.getString(8));
            tbjd=new Trabajador();
            tbjd.setNombre(rs.getString(1));
            tbjd.setApellido(rs.getString(2));
            tbjd.setCodigo(rs.getString(3));
            tbjd.setTipoDocumento(rs.getString(4));
            tbjd.setSexo(rs.getString(5));
            tbjd.setDireccion(rs.getString(6));
            tbjd.setCargo(cgo);
                    
        } catch(Exception ex) {System.out.println(ex.getMessage());}
        return tbjd;
    }

    @Override
    public Trabajador[] getAllTrabajador() {
         return null; //FALTA MODIFICAR
    }

    @Override
    public Trabajador getTrabajadorByIndex(int index) {
        return null; //FALTA MODIFICAR
    }

    @Override
    public boolean addTrabajador(Trabajador obj) {
         //Conexion BD
         boolean flag=false;
         String query="INSERT INTO Trabajador (nombre_trabajador, apellido_trabajador, codigo_trabajador, tipo_documento, sexo_trabajador, direccion_trabajador, tipo_cargo, nombre_cargo) VALUES(?,?,?,?,?,?,?,?) ";
        try(Connection con = obtenerConexion(); PreparedStatement stmt = con.prepareStatement(query)){
            
            stmt.setString(1, obj.getNombre());
            stmt.setString(2, obj.getApellido());
            stmt.setString(3, obj.getCodigo());
            stmt.setString(4, obj.getTipoDocumento());
            stmt.setString(5, obj.getSexo());
            stmt.setString(6, obj.getDireccion());
            stmt.setString(7, obj.getCargo().getTipoCargo());
            stmt.setString(8, obj.getCargo().getNombreCargo());
            flag = stmt.execute();
        }
        catch(Exception ex){System.out.println(ex.getMessage());}
        return flag;
    }

    @Override
    public void updateTrabajador(Trabajador obj) {
        //FALTA MODIFICAR
    }

    @Override
    public void deleteTrabajador(String codigo) {
        //FALTA MODIFICAR
    }

    //METODOS COMISIONADO-------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public boolean addSolicitudViatico(SolicitudViatico obj) {
        boolean flag=false;
        String query="INSERT INTO SolicitudV (codigo_solicitudV, codigo_trabajador, fecha_solicitud, fecha_viaje_ida, fecha_viaje_retorno, tipo_viaje, monto_viatico) VALUES(?,?,?,?,?,?,?) ";
        try(Connection con = obtenerConexion(); PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setString(1, obj.getCodSolicitud());
            stmt.setString(2, obj.getComisionado().getCodigo());
            stmt.setString(3, obj.getFechaSolicitud());
            stmt.setString(4, obj.getFechaIda());
            stmt.setString(5, obj.getFechaRetorno());
            stmt.setString(6, obj.getTipoViaje());
            stmt.setDouble(7, obj.getMonto().getMontoViatico());
            flag = stmt.execute();
        } catch(Exception ex){System.out.println(ex.getMessage());}
        return flag;
    }
    
    
    
    
        @Override
        public boolean addDocumentoAcreditadorGasto(DocumentoAcreditadorGasto obj) {
            boolean flag=false; 
            String query="INSERT INTO DocumentoAG (codigo_solicitudV, codigo_trabajador, nombre_empresa, codigo_DAG, tipo_DAG, descripcion_gasto, nombre_declarador, apellido_declarador, tipo_documento_del_declarador, documento_del_declarador, fecha_gasto, monto_gasto) VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ";
            
            try(Connection con=obtenerConexion(); PreparedStatement stmt=con.prepareStatement(query)){
                stmt.setString(1, obj.getSolicitudV().getCodSolicitud());
                stmt.setString(2, obj.getSolicitudV().getComisionado().getCodigo());
                stmt.setString(3, obj.getNombreEmpresa());
                stmt.setString(4, obj.getCodDoc());
                stmt.setString(5, obj.getTipoDAG());
                stmt.setString(6, obj.getDescripcionGasto());
                stmt.setString(7, obj.getNombreDeclarador());
                stmt.setString(8, obj.getApellidoDeclarador());
                stmt.setString(9, obj.getTipoDocumentoDeclarador());
                stmt.setString(10, obj.getDocumentoDeclarador());
                stmt.setString(11, obj.getFechaGasto());
                stmt.setDouble(12, obj.getMontoGasto());
        
            }   catch(Exception ex){System.out.println(ex.getMessage());}
               
            return flag; 
        }
    
    //---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public List<SolicitudViatico> getSolicitudes() {
         ArrayList<SolicitudViatico> data = new ArrayList<>();
        String query="select ";
                query+="upper(codigo_solicitudV), ";
                query+="upper(codigo_trabajador), ";
                query+="upper(fecha_solicitud), ";
                query+="upper(fecha_viaje_ida), ";
                query+="upper(fecha_viaje_retorno), ";
                query+="upper(tipo_viaje), ";
                query+="upper(monto_viatico), ";
                query+="upper(estado_solicitudV)";
                query+="from SolicitudV";
        try{
            
            Statement  stmt = DataSource().createStatement();       
            ResultSet rs = stmt.executeQuery(query);            
            
        //Recuperacion de registros
        while(rs.next()){
                
                SolicitudViatico soli = new SolicitudViatico();
                soli.setCodSolicitud(rs.getString(1));    
                soli.setFechaSolicitud(rs.getString(3));
                soli.setFechaIda(rs.getString(4));
                soli.setFechaRetorno(rs.getString(5));
                soli.setTipoViaje(rs.getString(6));
                Comisionado comi = new Comisionado();
                comi.setCodigo(rs.getString(2));
                soli.setComisionado(comi);
                Viatico montoVi = new Viatico();
                montoVi.setMontoViatico(rs.getDouble(7));
                soli.setMonto(montoVi); 
                soli.setEstado(rs.getString(8));
                data.add(soli);      
            }
        }catch(Exception ex){System.out.println(ex.getMessage());}
        return data;
    }

    @Override
    public SolicitudViatico getSolicitudViatico(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateSolicitudViatico(SolicitudViatico obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteSolicitudViatico(String codigoSolicitud) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<DocumentoAcreditadorGasto> getDocumentos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DocumentoAcreditadorGasto getDocumentoAcreditadorGasto(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateDocumentoAcrditadorGasto(DocumentoAcreditadorGasto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteDocumentoAcreditadorGasto(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}