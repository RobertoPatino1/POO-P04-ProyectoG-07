package Modelo;

import java.time.LocalDate;

public class Mascota {
    private String nombre;
    private TipoAnimal tipoMascota;
    private String raza;
    private LocalDate fechaDeNacimiento;
    private String foto;
    private DuenioMascota duenio;
    private String id;
    private boolean disponibleParaFuturasInscripciones;
    private boolean haParticipado;

    //Constructor que inicializa todos los atributos
    public Mascota(String nombre, TipoAnimal tipoMascota, String raza, LocalDate fechaDeNacimiento, String foto, DuenioMascota duenio, String id){
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.raza = raza;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.foto = foto;
        this.duenio = duenio;
        this.id = id;
        this.disponibleParaFuturasInscripciones = true;
        this.haParticipado = false; //Se intuye que ninguna mascota ha participado en un concurso
    }
    
    //Constructor con solo el id de la mascota
    public Mascota(String id){
        this.id = id;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }

    public DuenioMascota getDuenio(){
        return duenio;
    }
    public boolean getDisponibilidad(){
        return disponibleParaFuturasInscripciones;
    }
    public boolean getParticipacion(){
        return haParticipado;
    }

    //Setters
    public void setDisponibilidadDeInscripciones(boolean disp){
        this.disponibleParaFuturasInscripciones = disp;
    }
    
    public void setParticipacion(boolean part){
        this.haParticipado = part;
    }

    //Metodo equals:
    //metodo usado para buscar una mascota en la lista de mascotas con el .contains()
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o!=null&&o instanceof Mascota){
            //Downcasting
            Mascota mascotaEquals = (Mascota) o;
            return this.id.equals(mascotaEquals.id);
        }
        return false;
    }

    //toString()
    //Sera usado al momento de mostrar las listas de mascotas por pantalla
    public String toString(){
        if(disponibleParaFuturasInscripciones){
            return "Nombre: "+nombre+"|"+"Tipo de mascota: "+tipoMascota+"|"+"ID: "+id+"|"+"-Disponible para inscripciones-"+"|||"+"Dueño--> "+duenio;
        }else{
            return "Nombre: "+nombre+"|"+"Tipo de mascota: "+tipoMascota+"|"+"ID: "+id+"|"+"-No disponible para inscripciones-"+"|||"+"Dueño--> "+duenio;
        }
        
    }
    
}