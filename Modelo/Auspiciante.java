package Modelo;

public class Auspiciante extends Persona{

    private String webPage;


    //Constructor que inicializa todos los atributos
    public Auspiciante(String nombre, String direccion, String telefono, Ciudad ciudad, String email, String webPage){
        super(nombre, direccion, telefono, ciudad, email);
        this.webPage = webPage;
    }


    //Metodo toString
    public String toString(){
        return "Auspiciante: "+super.getNombre();
    }
    
}
