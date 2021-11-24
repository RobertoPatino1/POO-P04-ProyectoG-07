package Modelo;

import org.w3c.dom.ranges.RangeException;

public class Mascota {
    private String nombre;
    private TipoAnimal tipoMascota;
    private String raza;
    private String fechaDeNacimiento;
    private String foto;
    private DuenioMascota duenio;

    //Constructor que inicializa los atributos
    public Mascota(String nombre, TipoAnimal tipoMascota, String raza, String fechaDeNacimiento, String foto, DuenioMascota duenio){
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.raza = raza;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.foto = foto;
        this.duenio = duenio;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public DuenioMascota getDuenio(){
        return duenio;
    }
    
    //toString para mascota
    public String toString(){
        return "Nombre: "+nombre+"\n"+"Tipo de mascota: "+tipoMascota+"\n"+"Raza: "+raza+"\n"+"Fecha de nacimiento: "+fechaDeNacimiento+"\n"+"Dueño: "+duenio;
    }
}
