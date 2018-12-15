package clases;

/**
 *
 * @author Santiago Pérez Gómez, Sergio Martín Hernández, Sergio Rivera Gálvez
 */
public class Pregunta {
    private int id;
    private Pelicula pelicula;
    private int puntosJugador1;
    private int puntosJugador2;

    public void seleccionarPelicula(Peliculas films){
        //TODO implementar código aquí.
    }
    
    public void ofrecerNuevaPista(){
        //TODO implementar código aquí.
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public int getPuntosJugador1() {
        return puntosJugador1;
    }

    public void setPuntosJugador1(int puntosJugador1) {
        this.puntosJugador1 = puntosJugador1;
    }

    public int getPuntosJugador2() {
        return puntosJugador2;
    }

    public void setPuntosJugador2(int puntosJugador2) {
        this.puntosJugador2 = puntosJugador2;
    }
    
}
