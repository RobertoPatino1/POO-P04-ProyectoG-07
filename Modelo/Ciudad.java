package Modelo;

public class Ciudad {
    private String nombre;
    private String provincia;
    
    //Constructor que inicializa todos los atributos
    public Ciudad(String nombre, String provincia){
        this.nombre = nombre;
        this.provincia = provincia;
    }

    //Getter
    public String getNombre(){
        return nombre;
    }   

    //Metodo toString
    //Sera usado para imprimir las listas de ciudades por pantalla
    public String toString(){
        return "Nombre: "+nombre+"|"+"Provincia: "+provincia;
    }
    
}
