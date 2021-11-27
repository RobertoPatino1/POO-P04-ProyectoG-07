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

    //Implementando el metodo equals que se base solo en la cedula

    @Override
    public boolean equals(Object o){
        if(this==o){
            return true;
        }
        if(o!=null&&o instanceof DuenioMascota){
            //Se hace downcasting
            DuenioMascota duenioEquals = (DuenioMascota) o;
            return this.cedula.equals(duenioEquals.cedula);
        }
        return false;
    }
    
}
