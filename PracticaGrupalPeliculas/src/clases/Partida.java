package clases;

/**
 *
 * @author Santiago Pérez Gómez, Sergio Martín Hernández, Sergio Rivera Gálvez
 */
public class Partida implements Compartible{

    private int identificador;
    private Usuario ganador;
    private String resultado;
    private int ptosJugador1;
    private int ptosJugador2;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Usuario getGanador() {
        return ganador;
    }

    public void setGanador(Usuario ganador) {
        this.ganador = ganador;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public int getPtosJugador1() {
        return ptosJugador1;
    }

    public void setPtosJugador1(int ptosJugador1) {
        this.ptosJugador1 = ptosJugador1;
    }

    public int getPtosJugador2() {
        return ptosJugador2;
    }

    public void setPtosJugador2(int ptosJugador2) {
        this.ptosJugador2 = ptosJugador2;
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
