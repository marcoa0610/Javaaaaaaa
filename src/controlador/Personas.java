package controlador;

public class Personas {
    
    String nombre;
    int edad;
    String tipoSangre;
    
    public Personas(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Personas(String nombre){
        this.nombre = nombre;
    }
    
      public Personas(String nombre, int edad, String tipoSangre){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoSangre = tipoSangre;
    }
    
    
}
