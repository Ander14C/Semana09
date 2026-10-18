
package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        Chofer c1 = new Chofer();
        c1.setNombre("Juan Perez");
        
        Taxi t1 = new Taxi();
        t1.setMatricula("ABCD-1234");
        
        t1.setConductor(c1); //Generando la relacion
        t1.VerDatos();
    }
    
}
