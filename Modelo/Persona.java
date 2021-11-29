package Modelo;
public class Persona{
    private String nombre;
    private String direccion;
    private String telefono; //Puede comenzar con 0
    private Ciudad ciudad;
    private String email;
    
    //Constructor que inicializa todos los atributos
    public Persona(String nombre, String direccion, String telefono, Ciudad ciudad, String email){
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

    //Setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setCiudad(Ciudad ciudad){
        this.ciudad=ciudad;
    }
    public void setEmail(String email){
        this.email=email;
    }

    //Metodo toString
    public String toString(){
        return "Nombre: "+nombre+"|"+"Ciudad: "+ciudad.getNombre()+"|";
    }
}