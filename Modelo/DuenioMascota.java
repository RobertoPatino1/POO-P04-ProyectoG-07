package Modelo;

public class DuenioMascota extends Persona{

    private String cedula;
    private String apellidos;

    //Constructor
    public DuenioMascota(String nombre, String direccion, String telefono, Ciudad ciudad, String email, String cedula, String apellidos){
        //Inicializa los atributos
        super(nombre, direccion, telefono, ciudad, email); //Llamando al constructor de la clase padre Persona
        this.cedula = cedula;
        this.apellidos = apellidos;
    }
    
}
