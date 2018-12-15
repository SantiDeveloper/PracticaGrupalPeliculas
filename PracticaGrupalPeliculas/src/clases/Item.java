package clases;

/**
 *
 * @author Santiago Pérez Gómez, Sergio Martín Hernández, Sergio Rivera Gálvez
 */
public class Item {
    private String nombreUsuario;
    private int jugadas;
    private int ganadas;
    private int perdidas;
    private double porcentageVictorias;
    private int ptos;
    
    public void detallePartida(String nombre){
        //TODO: implementar código aquí.
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas = perdidas;
    }

    public double getPorcentageVictorias() {
        return porcentageVictorias;
    }

    public void setPorcentageVictorias(double porcentageVictorias) {
        this.porcentageVictorias = porcentageVictorias;
    }

    public int getPtos() {
        return ptos;
    }

    public void setPtos(int ptos) {
        this.ptos = ptos;
    }
}
