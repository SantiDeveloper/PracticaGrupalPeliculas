package clases;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Santiago Pérez Gómez, Sergio Martín Hernández, Sergio Rivera Gálvez
 */
public class Clasificacion {
    
    private List<Item> items;

    public Clasificacion() {
        items = new LinkedList<>();
    }
    
    public void actualizar(){
        //TODO implementar código aquí.
    }
    
    public void visualizar(){
        //TODO implementar código aquí.
    }
    
    public void ordenarVictorias(){
        //TODO implementar código aquí.
    }
    
    public void ordernarPorcentaje(){
        //TODO implementar código aquí.
    }
    
    public void ordernarPuntos(){
        //TODO implementar código aquí.
    }
    
    public void volcarTXT(File f){
        //TODO implementar código aquí.
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
}
