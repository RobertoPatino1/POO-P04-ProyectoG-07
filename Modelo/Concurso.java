package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {
    private String nombre;
    private LocalDate fechaEvento;
    private String horaEvento;
    private LocalDate fechaInicioInscripcion;
    private LocalDate fechaCierreInscripcion;
    private Ciudad ciudad;
    private String lugar;
    private Premio premio; 
    private Auspiciante auspiciante;
    private TipoAnimalesConcurso dirigidoA;
    private boolean estaAbierto; //True si el concurso esta abierto/ false si esta cerrado
    private boolean concursoFinalizado; //True si el concurso ha terminado
  

    //Lista de mascotas inscritas
    private ArrayList<Mascota> mascotasInscritas = new ArrayList<>();

    //Lista de ganadores
    private ArrayList<Mascota> ganadores = new ArrayList<>();
    

    public Concurso(String nombre, LocalDate fechaEvento, String horaEvento, LocalDate fechaInicioInscripcion, LocalDate fechaCierreInscripcion, Ciudad ciudad, String lugar, Premio premio, Auspiciante auspiciante, TipoAnimalesConcurso dirigidoA){

        
        this.nombre= nombre;
        this.fechaEvento= fechaEvento;
        this.horaEvento= horaEvento;
        this.fechaInicioInscripcion= fechaInicioInscripcion;
        this.fechaCierreInscripcion= fechaCierreInscripcion;
        this.ciudad= ciudad;
        this.lugar= lugar;
        this.premio= premio;
        this.auspiciante= auspiciante;
        this.dirigidoA= dirigidoA;
        this.estaAbierto = true; //El concurso esta abierto para inscripciones
        this.concursoFinalizado = false; //El concurso aun no ha terminado
    }

    //Constructor solo con el nombre
    public Concurso(String nombre){
        this.nombre = nombre;
    }


    public void cerrarInscripcionesConcurso(){
        estaAbierto = false;
    }

    public void finalizarConcurso(){
        concursoFinalizado = true;
    }

    //Metodo para seleccionar a los ganadores
    public void seleccionarGanadores(ArrayList<Mascota> ganadores){
        this.ganadores = ganadores;
    }

    //Metodo para inscribir participantes en el concurso:
    public void inscribirParticipantes(Mascota m){
        if(estaAbierto)
            mascotasInscritas.add(m);
        else
            System.out.println("El concurso se encuentra cerrado.");
    }

    public void consultarGanadores(){
        if(concursoFinalizado){
            System.out.println("Se muestra la lista de ganadores: ");
            for(Mascota mascota:ganadores){
                System.out.println(mascota.getNombre());
            }
        }else{
            System.out.println("El concurso aun no ha terminado");
        }
    }

    







    //Getters

    public String getNombre(){
        return nombre;
    }

    public boolean getEstaAbierto(){
        return estaAbierto;
    }
    public boolean getConcursoFinalizado(){
        return concursoFinalizado;
    }

    //Metodo equals
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o!=null&& o instanceof Concurso){
            //Downcasting
            Concurso concursoEquals = (Concurso) o;
            return this.nombre.equals(concursoEquals.nombre);
        }
        return false;
    }


    //Metodo toString
    public String toString(){
        if(concursoFinalizado){
            return "Nombre: "+nombre+"|"+"Fecha: "+fechaEvento+"|"+"Hora: "+horaEvento+"|"+"Lugar: "+lugar+"|"+"Dirigido a: "+dirigidoA+"|"+"Estado: Finalizado";

        }
        return "Nombre: "+nombre+"|"+"Fecha: "+fechaEvento+"|"+"Hora: "+horaEvento+"|"+"Lugar: "+lugar+"|"+"Dirigido a: "+dirigidoA+"Fecha de inicio de inscripciones: "+fechaInicioInscripcion+"|"+"Fecha de cierre de inscripciones: "+fechaCierreInscripcion+"|"+"Estado: Abierto";
    }



   



}