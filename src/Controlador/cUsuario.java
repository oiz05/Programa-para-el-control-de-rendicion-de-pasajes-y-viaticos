package Controlador;

import Clases.Usuario;
import Modelo.UsuarioDao;
import java.util.List;

public class cUsuario {
   public List<Usuario> getUsuarios() { 
       UsuarioDao obj = new UsuarioDao();
       return obj.getUsuarios();
   }
   
   public Usuario validarSesiones(String login, String clave) {
       UsuarioDao obj = new UsuarioDao();
       return obj.validarSesiones(login, clave);
   }
   
   public boolean add(Usuario obj) {
       UsuarioDao objD = new UsuarioDao();
       return objD.addUsuario(obj);
   }
}
