package Modelo;
public class Persona{
    private String nombre;
    private String direccion;
    private String telefono; //Puede comenzar con 0
    private Ciudad ciudad;
    private String email;
    

    //Constructor

    public Persona(String nombre, String direccion, String telefono, Ciudad ciudad, String email){
        //Inicializa los atributos
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.ciudad = ciudad;
        this.email = email;
    }


    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public Ciudad getCiudad(){
        return ciudad;
    }
    public String getEmail(){
        return email;
    }

    //Metodo toString
    public String toString(){
        return "Nombre: "+nombre+"|"+"Ciudad: "+ciudad.getNombre();
    }
}