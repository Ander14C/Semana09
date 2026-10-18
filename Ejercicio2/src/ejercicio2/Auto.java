
package ejercicio2;

public class Auto {
    private String marca;
    private String matricula;
    private String color;
    private Persona propietario;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }
     public void VerDatos(){
        System.out.println("Auto matricula: "+ this.matricula+ " Color: "+ this.color);
    }
}
