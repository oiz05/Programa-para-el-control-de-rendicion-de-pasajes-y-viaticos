package Modelo;

import Clases.Cargo;
import Clases.Trabajador;
import Clases.Usuario;
import Interfacez.IUsuario;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static util.DataSource.DataSource;

public class UsuarioDao implements IUsuario{

    private Connection obtenerConexion() throws SQLException {
        // Establecer la conexión con la base de datos SQL Server
        String url = "jdbc:sqlserver://95.217.180.168:1433;databaseName=ControlPV;encrypt=false;trustServerCertificate=true;";
        String usuario = "sa";
        String contraseña = "01K#cjWq3c";
        return DriverManager.getConnection(url, usuario, contraseña);
    
        }
    @Override
    public boolean add(Usuario obj) {
       boolean flag=false; 
        //Conexion BD
        try{
            String query = " INSERT INTO Usuario ";
                   query += "(login, clave, rol_trabajador, codigo_trabajador) ";
                   query += " VALUES(?,?,?,?)";
            PreparedStatement  stmt = DataSource().prepareStatement(query);
            stmt.setString(1, obj.getLogin());
            stmt.setString(2, obj.getClave());
            stmt.setString(3, obj.getNombre_cargo());
            stmt.setString(4, obj.getTrabajador().getCodigo());
            flag = stmt.execute();
        }
        catch(Exception ex){System.out.println(ex.getMessage());}
        return flag;
        
    }

    @Override
    public boolean update(Usuario obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean delete(String login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Usuario> getUsuarios() {
         ArrayList<Usuario> data = new ArrayList<>();
        //Conexion BD
        try{
            
            String query = "SELECT tt.nombre_trabajador, tt.apellido_trabajador, uu.login, uu.rol_trabajador, uu.codigo_trabajador ";
                   query += "FROM Usuario uu ";
                   query += "inner join Trabajador tt on uu.codigo_trabajador = tt.codigo_trabajador ";
            Statement stmt = DataSource().createStatement();       
            ResultSet rs = stmt.executeQuery(query);
            
            //Recuperacion de registros
            while(rs.next()){
                Trabajador trabaj = new Trabajador();
                trabaj.setCodigo(rs.getString(5));
                trabaj.setNombre(rs.getString(1));    
                trabaj.setApellido(rs.getString(2));  
                

                Usuario aux = new Usuario();
                aux.setLogin(rs.getString(3));
                aux.setNombre_cargo(rs.getString(4));
                aux.setTrabajador(trabaj);   
                
                data.add(aux);            
            }
        }
        catch(Exception ex){System.out.println(ex.getMessage());}
        return data;
    }

    @Override
    public Usuario getUsuario(String login) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Usuario validarSesiones(String login, String clave) {
        Usuario data = new Usuario();
        //Conexion BD
        try{
            String query = "SELECT uu.clave, uu.login ";
                   query += "FROM Usuario uu ";
                   query += "WHERE uu.login = ? and uu.clave = ? ";
            PreparedStatement  stmt = DataSource().prepareStatement(query);
            
            stmt.setString(1, login);
            stmt.setString(2, clave);
            ResultSet rs = stmt.executeQuery();

            //Recuperacion de registros
             if (rs.next() ){
                data.setNombre_cargo(rs.getString(1)); 
                data.setLogin(rs.getString(2));
                
             }   
            else{ //En caso no exista usuario
                 data.setLogin("");
             } 
            
        }
        catch(SQLException ex){System.out.println(ex.getMessage());}
        
        return data;
           
    }
    

}
