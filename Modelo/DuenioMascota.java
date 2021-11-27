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
    
    //Constructor con solo la cedula
    //Pone todos los demas valores del constructor en null.
    //Este Constructor sera usado unicamente para la busqueda de un objeto en la lista con la cedula
    public DuenioMascota(String cedula){
        super(null, null, null, null, null);
        this.cedula = cedula;
    }


    //Este metodo sera usado por el contains para buscar en la lista el elemento que coincida con la cedula ingresada
    @Override
    public boolean equals(Object o){

        if(this == o){
            return true;
        }
        if(o!=null&&o instanceof DuenioMascota){
            //Downcasting
            DuenioMascota duenio = (DuenioMascota) o;
            return this.cedula.equals(duenio.cedula);
        }
        return false;
        
    }

    public String toString(){
        return super.toString()+"Apellidos: "+apellidos+"|"+"Cedula: "+cedula; 
    }
    
}
