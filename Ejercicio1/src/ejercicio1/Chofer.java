
package ejercicio1;

public class Chofer {
    private String nombre;

    public Chofer(String nombre) {
        this.nombre = nombre;
    }

    Chofer() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String printChofer(){
        return nombre;
    }
}
