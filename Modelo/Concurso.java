package Modelo;

import java.util.ArrayList;

public class Concurso {
    private String nombre;
    private String fechaEvento;
    private String horaEvento;
    private String fechaInicioInscripcion;
    private String fechaCierreInscripcion;
    private Ciudad ciudad;
    private String lugar;
    private Premio premio; 
    private Auspiciante auspiciante;
    private TipoAnimalesConcurso dirigidoA;
    private boolean estaAbierto; //True si el concurso esta abierto/ false si esta cerrado
    private boolean concursoFinalizado; //True si el concurso ha terminado

    //Lista de mascotas inscritas
    private ArrayList<Mascota> mascotasInscritas;

    //Lista de ganadores
    private ArrayList<Mascota> ganadores;
    

    public Concurso(String nombre, String fechaEvento, String horaEvento, String fechaInicioInscripcion, String fechaCierreInscripcion, Ciudad ciudad, String lugar, Premio premio, Auspiciante auspiciante, TipoAnimalesConcurso dirigidoA){
        
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
        return "Nombre: "+nombre+"|"+"Fecha: "+fechaEvento+"|"+"Hora: "+horaEvento+"|"+"Lugar: "+lugar+"|"+"Dirigido a: "+dirigidoA;
    }



   



}