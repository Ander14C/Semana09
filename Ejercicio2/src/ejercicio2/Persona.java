
package ejercicio2;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String nro_doc;
    
    private ArrayList<Auto> carros = new ArrayList(); //creando la relacion... no entiendo (。_。)

    public Persona(){
        
    }
    
    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public void VerDatos(){
        System.out.println("Dueno: "+ this.nombre+ " Numero doc: "+ this.nro_doc);
        if(this.carros.size()>0){
            System.out.println("Los autos son: ");
            for(Auto a: this.carros){
                a.VerDatos();
            }
        }else{
            System.out.println("No tiene autos");
        }
    }
     public void agregarAuto(Auto nuevoauto){
         this.carros.add(nuevoauto);
     }

}
