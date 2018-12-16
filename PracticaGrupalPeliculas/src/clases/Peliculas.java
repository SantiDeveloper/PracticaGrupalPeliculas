package clases;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santiago Pérez Gómez, Sergio Martín Hernández, Sergio Rivera Gálvez
 */
public class Peliculas {

    private List<Pelicula> peliculas;

    public Peliculas() {
        peliculas = new ArrayList<>();
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    public void addPelicula(Pelicula p){
        //TODO implementar código aquí.
    }
    
    public void verInfoPeliculas(){
        //TODO implementar código aquí.
    }
}
