package Modelo;

public class Concurso {
    private String nombre;
    private String fechaEvento;
    private String horaEvento;
    private String fechaInicioInscripcion;
    private String fechaCierreInscripcion;
    private Ciudad ciudad;
    private String lugar;
    private Premio premio; //Completar la clase premio
    private Auspiciante auspiciante;
    private TipoAnimal dirigidoA;
    private boolean estaAbierto; //True si el concurso esta abierto/ false si esta cerrado
    private boolean concursoFinalizado; //True si el concurso ha terminado

    public Concurso(String nombre, String fechaEvento, String horaEvento, String fechaInicioInscripcion, String fechaCierreInscripcion, Ciudad ciudad, String lugar, Premio premio, Auspiciante auspiciante, TipoAnimal dirigidoA){
        
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
    }

    //Metodo visualizar las mascotas inscritas (imcompleto)
    public void visualizarMascotasInscritas(){
        //MascotaInscrita = new ArrayList<Mascota>()
    }
}