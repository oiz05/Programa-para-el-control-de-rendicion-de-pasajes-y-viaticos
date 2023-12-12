
package Clases;


public class Comisionado extends Trabajador {
    
    public Comisionado(){
        
    }

    public Comisionado(String codigo, String nombre, String apellido) {
        super(codigo, nombre, apellido);
    }
    
    

    public Comisionado(String codigo, String nombre, String apellido, String tipoDocumento, String sexo, String direccion, Cargo cargo) {
        super(codigo, nombre, apellido, tipoDocumento, sexo, direccion, cargo);
    }
    
}
