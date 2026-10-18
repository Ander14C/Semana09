
package ejercicio1;

public class Taxi {
    private String matricula;
    private Chofer conductor;//Con esto se alinia a la clase Chofer

    public Chofer getConductor() {
        return conductor;
    }

    public void setConductor(Chofer conductor) {
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void VerDatos(){
        System.out.println("TAXI MATRICULA: "+ this.matricula);
        if(this.conductor!=null){
            System.out.println("Chofer: "+ this.conductor);
        }else{
            System.out.println("No tiene conductor...");
        }
    }
}
