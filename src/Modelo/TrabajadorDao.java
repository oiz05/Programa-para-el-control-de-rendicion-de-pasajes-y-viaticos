package Modelo;

import Clases.Cargo;
import Clases.Trabajador;
import Interfacez.ITrabajador;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static util.DataSource.DataSource;

public class TrabajadorDao implements ITrabajador{

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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Trabajador[] getAllTrabajador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Trabajador getTrabajadorByIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addTrabajador(Trabajador obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateTrabajador(Trabajador obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteTrabajador(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}