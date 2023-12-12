package Modelo;


import Clases.Cargo;
import Clases.DeclaracionJurada;
import Clases.DocumentoAcreditadorGasto;
import Clases.SolicitudViatico;
import Clases.Trabajador;
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
                Cargo cgo=new Cargo(rs.getString(7),rs.getString(8));
                Trabajador trabaj = new Trabajador();
                trabaj.setNombre(rs.getString(1));    
                trabaj.setApellido(rs.getString(2));
                trabaj.setCodigo(rs.getString(3));
                trabaj.setTipoDocumento(rs.getString(4));
                trabaj.setSexo(rs.getString(5));
                trabaj.setDireccion(rs.getString(6));
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
        String query="select* from Trabajador where codigo_trabajador = '?' ";
        try{
            Connection conn = obtenerConexion();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Cargo cgo=new Cargo(rs.getString(7),rs.getString(8));
            tbjd=new Trabajador(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    cgo
                    
            
            );
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

}