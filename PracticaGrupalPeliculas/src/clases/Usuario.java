package clases;

/**
 *
 * @author santi
 */
public class Usuario {
    
    private StringBuilder muro;
    private int partidasGanadas;
    private int partidasPerdidas;
    private int partidasEmpatadas;
    private Partida[] partidasCompletas;
    private Partida[] partidasPendientes;
    private Usuario[] solicitudesAmigosPendientes;
    private Usuario[] amigos;

    public void invitarAmigo(Usuario u){
        //TODO implementar código aquí.
    }
    
    public void aceptarInvitacion(Usuario u){
        //TODO implementar código aquí.
    }
    
    public void rechazarInvitacion(Usuario u){
        //TODO implementar código aquí.
    }
    
    public void compartirPelicula(Pelicula p){
        //TODO implementar código aquí.
    }
    
    public void compartirPelicula(Pelicula p, Usuario u){
        //TODO implementar código aquí.
    }
    
    public void compartirCritica(Critica c){
        //TODO implementar código aquí.
    }
    
    public void compartirCritica(Critica c, Usuario u){
        //TODO implementar código aquí.
    }
    
    public void compartirPartida(Partida p){
        //TODO implementar código aquí.
    }
    
    public void compartirPartida(Partida p, Usuario u){
        //TODO implementar código aquí.
    }
    
    public void compartirTodo(){
        //TODO implementar código aquí.
    }
    
    public void compartirTodo(Usuario u){
        //TODO implementar código aquí.
    }
    
    public void addPelicula(Pelicula p){
        //TODO implementar código aquí.
    }
    
    public void addCritica(Critica c){
        //TODO implementar código aquí.
    }
    
    public void iniciarPartida(Usuario u){
        //TODO implementar código aquí.
    }
    
    public void completarPartida(Partida p){
        //TODO implementar código aquí.
    }
    
    public StringBuilder getMuro() {
        return muro;
    }

    public void setMuro(StringBuilder muro) {
        this.muro = muro;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public int getPartidasEmpatadas() {
        return partidasEmpatadas;
    }

    public void setPartidasEmpatadas(int partidasEmpatadas) {
        this.partidasEmpatadas = partidasEmpatadas;
    }

    public Partida[] getPartidasCompletas() {
        return partidasCompletas;
    }

    public void setPartidasCompletas(Partida[] partidasCompletas) {
        this.partidasCompletas = partidasCompletas;
    }

    public Partida[] getPartidasPendientes() {
        return partidasPendientes;
    }

    public void setPartidasPendientes(Partida[] partidasPendientes) {
        this.partidasPendientes = partidasPendientes;
    }

    public Usuario[] getSolicitudesAmigosPendientes() {
        return solicitudesAmigosPendientes;
    }

    public void setSolicitudesAmigosPendientes(Usuario[] solicitudesAmigosPendientes) {
        this.solicitudesAmigosPendientes = solicitudesAmigosPendientes;
    }

    public Usuario[] getAmigos() {
        return amigos;
    }

    public void setAmigos(Usuario[] amigos) {
        this.amigos = amigos;
    }
    
}
