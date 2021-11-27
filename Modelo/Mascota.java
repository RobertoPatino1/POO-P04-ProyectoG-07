package Modelo;

public class Mascota {
    private String nombre;
    private TipoAnimal tipoMascota;
    private String raza;
    private String fechaDeNacimiento;
    private String foto;
    private DuenioMascota duenio;
    private String id;

    //Constructor que inicializa los atributos
    public Mascota(String nombre, TipoAnimal tipoMascota, String raza, String fechaDeNacimiento, String foto, DuenioMascota duenio, String id){
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.raza = raza;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.foto = foto;
        this.duenio = duenio;
        this.id = id;
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

    //Metodo equals:
    //-----Este metodo sera usado para buscar una mascota en la lista de mascotas con el .contains()-----
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
        return "Nombre: "+nombre+"|"+"Tipo de mascota: "+tipoMascota+"|"+"Dueño: "+duenio;
    }
    
}