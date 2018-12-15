package clases;

import java.util.LinkedList;

/**
 *
 * @author Santiago Pérez Gómez, Sergio Martín Hernández, Sergio Rivera Gálvez
 */
public class Peliculas {

    private LinkedList<Pelicula> peliculas;

    public Peliculas() {
        peliculas = new LinkedList<>();
    }

    public LinkedList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(LinkedList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    public void addPelicula(Pelicula p){
        //TODO implementar código aquí.
    }
    
    public void verInfoPeliculas(){
        //TODO implementar código aquí.
    }
}
