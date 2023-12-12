package Interfacez;
import Clases.Usuario;
import java.util.List;

public interface IUsuario {
    
    public boolean addUsuario(Usuario obj);
    public boolean updateUsuario(Usuario obj);
    public boolean deleteUsuario(String login);
    public List<Usuario> getUsuarios();
    public Usuario getUsuario(String login);
    public Usuario validarSesiones(String login, String clave);

}