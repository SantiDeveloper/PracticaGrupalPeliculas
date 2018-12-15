package clases;

/**
 *
 * @author Santiago Pérez Gómez, Sergio Martín Hernández, Sergio Rivera Gálvez
 */
public class Pelicula implements Compartible{

    private String titulo;
    private int anyo;
    private String director_a;
    private String genero;
    private String actor;
    private String actriz;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getDirector_a() {
        return director_a;
    }

    public void setDirector_a(String director_a) {
        this.director_a = director_a;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActriz() {
        return actriz;
    }

    public void setActriz(String actriz) {
        this.actriz = actriz;
    }

    @Override
    public void compartir(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void compartir(Usuario[] users) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
