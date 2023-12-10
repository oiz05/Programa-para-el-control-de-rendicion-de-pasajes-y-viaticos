package Clases;

public class Usuario {
   private String login;
   private String clave;
   private String nombre_cargo;
   private Trabajador trabajador;

    public Usuario() {
    }

    public Usuario(String login, String clave, String nombre_cargo, Trabajador trabajador) {
        this.login = login;
        this.clave = clave;
        this.nombre_cargo = nombre_cargo;
        this.trabajador = trabajador;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre_cargo() {
        return nombre_cargo;
    }

    public void setNombre_cargo(String rol) {
        this.nombre_cargo = rol;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
   
}
