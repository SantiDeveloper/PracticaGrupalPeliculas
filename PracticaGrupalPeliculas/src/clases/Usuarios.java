package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago Pérez Gómez, Sergio Martín Hernández, Sergio Rivera Gálvez
 */
public class Usuarios {
    
    private List<Usuario> usuarios;

    public Usuarios() {
        usuarios = new ArrayList<>();
    }
    
    public void autenticar(Usuario u){
        // TODO implementar código aquí.
    }
    
    public void registrar(Usuario u){
       // TODO implementar código aquí.
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
