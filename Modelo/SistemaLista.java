package Modelo;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaLista {
    private static ArrayList<Concurso> listaConcursos; 
    private static ArrayList<DuenioMascota> listaDuenios;
    private static ArrayList<Mascota> listaMascotas;
    private static ArrayList<Ciudad> listaCiudades;
    private static ArrayList<Auspiciante> listaAuspiciantes;
    private static ArrayList<Premio> listaPremios;

    static Scanner sc = new Scanner(System.in);



    //------Metodos de creacion y edicion------\\

    //Para concurso
    public static Concurso crearConcurso(){
        //Se deben pedir y rellenar todos los datos referentes al concurso para luego retornarlo

        //Debe tener retorno de tipo Concurso o debe ser void para agregar el concurso a la lista de concursos???
        return null; //Cambiar al objeto de concurso creado
    }
        /*

    public static void inscribirParticipantes(){
        System.out.println("Se muestra el listado de concursos abiertos: ");
        
        for(Concurso concurso: listaConcursos){
            if (concurso.estaAbierto){
                System.out.println(concurso);
            }
        }

        //Se solicita ingresar el codigo del concurso y el id de la mascota
        //Para esto se debe verificar que la mascota este en la lista de mascotas
        System.out.println("Ingrese el codigo del concurso en el que se va a registrar al participante: ");
        String codigoConcurso = sc.nextLine();

        //Se crea un concurso de busqueda con el codigo ingresado
        Concurso concursoBusqueda = new Concurso(codigoConcurso);

        if(listaConcursos.contains(concursoBusqueda)){
            //Se accede al elemento:
            int indice = listaConcursos.indexOf(concursoBusqueda);
            Concurso concurso = listaConcursos.get(indice); //Se obtiene el concurso referido y se accede a el

            System.out.println("El concurso: "+concurso.getNombre()+" fue encontrado exitosamente");

            //Inscripcion de la mascota
            System.out.println("Ingrese el id de la mascota a inscribir");
            String idIngresado = sc.nextLine();
            Mascota mascotaBusqueda = new Mascota(idIngresado);

            if(listaMascotas.contains(mascotaBusqueda)){
                System.out.println("La mascota fue encontrada y registrada exitosamente")
            }else{
                System.out.println("La mascota no fue encontrada, ejecute el programa nuevamente")
            }

        }else{
            System.out.println("El codigo del concurso no fue encontrado, vuelva a ejecutar el programa")
        }
            
        
    }

    */

    //Para Duenios de mascota
    public static DuenioMascota crearDuenio(){
        //PEDIR DATOS PARA CREAR AL DUENIO
        
        System.out.println("Ingrese el nombre del dueño: ");
        String nombreDuenio = sc.nextLine();
   
        System.out.println("Ingrese los apellidos del dueño separados por un espacio: ");
        String apellidosDuenio = sc.nextLine();
        System.out.println("Ingrese la cedula del dueño: ");
        String cedulaDuenio = sc.nextLine();
        System.out.println("Ingrese la direccion del dueño: ");
        String direccionDuenio = sc.nextLine();
        System.out.println("Ingrese el telefono del duenio: ");
        String telefonoDuenio = sc.nextLine();
        System.out.println("Ingrese el nombre de la ciudad en la que reside el duenio: ");
        String nombreCiudad = sc.nextLine();
        System.out.println("Ingrese el nombre de la provincia en la que reside el duenio: ");
        String provinciaDuenio = sc.nextLine();
        System.out.println("Ingrese el email del duenio: ");
        String emailDuenio = sc.nextLine();

        //Creando el objeto de tipo ciudad
        Ciudad ciudadDuenio = new Ciudad(nombreCiudad,provinciaDuenio);


        //Se crea el objeto
        DuenioMascota duenio = new DuenioMascota(nombreDuenio, direccionDuenio, telefonoDuenio, ciudadDuenio, emailDuenio, cedulaDuenio, apellidosDuenio);
        //Sera que se lo agrega a la lista de Duenios de una?
        return duenio;
    }


    public static void editarDuenio(){
        System.out.println("---Editar duenio---");

        System.out.println("Ingresar el id del duenio a editar: ");

        String idDuenio = sc.nextLine();

        //Se crea el objeto de prueba
        DuenioMascota duenioBusqueda = new DuenioMascota(idDuenio);
        if(listaDuenios.contains(duenioBusqueda)){
            System.out.println("Duenio encontrado exitosamente");
            //El metodo contains usa el equals definido en la clase DuenioMascota
            int indice = listaDuenios.indexOf(duenioBusqueda);
            DuenioMascota duenio = listaDuenios.get(indice);
            
            int seleccion = 0;
            
            System.out.println("Que dato desea actualizar?");
            //Se debe crear una estructura de control con do while parecida al menu principal.
            /*

            Cuerpo del metodo

            */



        }else{
            System.out.println("Duenio no encontrado, por favor vuelva a ejecutar el programa");
        }

        



    }

    //Para mascotas
    public static Mascota crearMascota(){
        //Se debe mostrar la lista de mascotas
        System.out.println(listaMascotas);

        System.out.println("Ingrese el nombre de la mascota: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el tipo de mascota que se inscribira: ");
        System.out.println("1. Perro");
        System.out.println("2. gato");
        TipoAnimal tipoAnimal;
        String decisionString = sc.nextLine();
        int decision = Integer.valueOf(decisionString);

        if(decision==1){
            tipoAnimal = TipoAnimal.PERRO;
        }else if(decision==2){
            tipoAnimal = TipoAnimal.GATO;
        }
        
        System.out.println("Ingrese la raza de la mascota a inscribir: ");
        String raza = sc.nextLine();

        System.out.println("Ingrese la fecha de nacimiento aproximada de la mascota: ");

        String fechaNacimiento = sc.nextLine(); //Corregir esto

        System.out.println("Ingresar la foto de la mascota: ");
        String foto = sc.nextLine();

        System.out.println("Seleccionar al duenio de la mascota: ");
        //Hacer un print de la lista de duenios

        //Pedir alguna forma de identificar al duenio

        //Guardarlo en una variable y listo

        //Duenio duenio = listaDuenios[n]

        //Mascota mascota = new Mascota(nombre, tipoAnimal, raza, fechaNacimiento, foto, duenio)
        return null; //Cambiar el return

    }

    public static void eliminarMascota(){
        System.out.println("Ingrese el id de la mascota que desea eliminar de la lista: ");
        String id = sc.nextLine();
        //Se crea la mascota de busqueda solo con el id
        Mascota mascotaBusqueda = new Mascota(id);

        //Se busca la mascota en la lista de mascotas
        if(listaMascotas.contains(mascotaBusqueda)){
            int indice = listaMascotas.indexOf(mascotaBusqueda);
            Mascota mascotaEliminar = listaMascotas.get(indice);
            //Se coloca que esta mascota ya no estara disponible para futuras inscripciones
            mascotaEliminar.setDisponibilidadDeInscripciones(false);
            //Se elimina a la mascota de la lista
            listaMascotas.remove(mascotaEliminar);

        }else{
            System.out.println("No se ha encontrado la mascota solicitada, por favor vuelva a ejecutar");
        }

    }






    //Para ciudades
    public static Ciudad crearCiudad(){
        System.out.println("Ingrese el nombre de la ciudad: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el nombre de la provincia: ");
        String provincia = sc.nextLine();
        
        //Se crea el objeto de tipo ciudad y se lo retorna
        Ciudad ciudad = new Ciudad(nombre, provincia);
        return ciudad;
    }











    
    //------Métodos de Registro------\\
    public static void registrarConcurso(Concurso c){
        listaConcursos.add(c);
    }

    public static void registrarMascotas(Mascota m) { 
        listaMascotas.add(m);
    } 

    public static void registrarDuenioMascota(DuenioMascota dm) {
        listaDuenios.add(dm);
    }

    public static void registrarCiudad(Ciudad c) {
        listaCiudades.add(c);
    }

    public static void registrarAuspiciante(Auspiciante a) {
        listaAuspiciantes.add(a);
    }





    //------Metodos de Visualizacion ------\\
    public static void visualizarListaConcursos(){
        System.out.println(listaConcursos);
    }

    public static void visualizarListaMascotas(){
        System.out.println(listaMascotas);
    }

    public static void visualizarListaDuenios(){
        System.out.println(listaDuenios);
    }

    public static void visualizarListaCiudades(){
        System.out.println(listaCiudades);
    }

    public static void visualizarListaAuspiciantes(){
        System.out.println(listaAuspiciantes);
    }
    
}
