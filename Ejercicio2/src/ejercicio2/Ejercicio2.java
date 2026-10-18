
package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Anderson");
        p1.setNro_doc("60922611");
        
        Auto a1 = new Auto();
        a1.setMatricula("ABC-123");
        a1.setMarca("Ferrari");
        a1.setColor("Azul");
        
        Auto a2 = new Auto();
        a2.setMarca("Lamborghini");
        a2.setColor("Rojo");
        a2.setMatricula("CDA-321");
        
        p1.agregarAuto(a1);
        p1.agregarAuto(a2);
        p1.VerDatos();
    }
    
}
