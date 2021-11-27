package Modelo;

public class Ciudad {
    private String nombre;
    private String provincia;
    
    public Ciudad(String nombre, String provincia){
        this.nombre = nombre;
        this.provincia = provincia;
    }

    //Getter
    public String getNombre(){
        return nombre;
    }   
}
