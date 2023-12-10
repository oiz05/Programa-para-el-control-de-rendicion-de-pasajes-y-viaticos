package Modelo;


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
        String url = "jdbc:sqlserver://OSCARZARI\\SQLEXPRESS:1433;databaseName=CPasajesV;encrypt=false;trustServerCertificate=true;";
        String usuario = "sa";
        String contraseña = "oscar123";
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
        try{
            String query = "SELECT  codigo_trabajador, UPPER(apellido_trabajador) apellido_trabajador, UPPER(nombre_trabajador) nombre_trabajador";
                    query += "FROM Trabajador ";
                   query += "ORDER BY apellido_trabajador ";
            Statement  stmt = DataSource().createStatement();       
            ResultSet rs = stmt.executeQuery(query);            
            
        //Recuperacion de registros
        while(rs.next()){
                Trabajador trabaj = new Trabajador();
                trabaj.setCodigo(rs.getString(1));
                trabaj.setNombre(rs.getString(3));    
                trabaj.setApellido(rs.getString(2));
                data.add(trabaj); 
                      
            }
        }
        catch(Exception ex){System.out.println(ex.getMessage());}
        return data;
    }

    @Override
    public Trabajador getTrabajador(String login) {
        return null; //FALTA MODIFICAR
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

    //METODOS COMISIONADO
    @Override
    public void addSolicitudViatico(SolicitudViatico obj) {
        //FALTA MODIFICAR
        boolean flag=false;
        String query="INSERT INTO SolicitudV (codigo_solicitudV, codigo_trabajador, ) VALUES(?,?,?,?,?,?,?,?) ";
        
    }

    
    
}