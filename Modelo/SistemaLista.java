package Modelo;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaLista {
    private static ArrayList<Concurso> listaConcursos = new ArrayList<>();; //Puede contener concursos abiertos o cerrados
    private static ArrayList<DuenioMascota> listaDuenios = new ArrayList<>();
    private static ArrayList<Mascota> listaMascotas = new ArrayList<>();;
    private static ArrayList<Ciudad> listaCiudades = new ArrayList<>();;
    private static ArrayList<Auspiciante> listaAuspiciantes = new ArrayList<>();;
    private static ArrayList<Premio> listaPremios = new ArrayList<>();;

    static Scanner sc = new Scanner(System.in);



    //------Metodos de creacion y edicion------\\

    //Para concurso
    public static Concurso crearConcurso(){
        System.out.println("Ingrese el nombre del concurso a crear: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la fecha del concurso: ");
        String fecha = sc.nextLine();
        System.out.println("Ingrese la hora del concurso: ");
        String hora = sc.nextLine();
        System.out.println("Ingrese la fecha de inicio de las inscripciones: ");
        String fechaInicio = sc.nextLine();
        System.out.println("Ingrese la fecha de cierre para las inscripciones: ");
        String fechaCierre = sc.nextLine();
        
        //Se piden datos para el premio
        Ciudad ciudad = crearCiudad(); //Se usa un metodo definido en esta misma clase
        
        System.out.println("Ingrese el lugar donde se llevará a cabo el concurso: ");
        String lugar = sc.nextLine();

        //Se piden datos para el premio
        Premio premio = crearPremios();

        //Se piden datos para el auspiciante
        Auspiciante auspiciante = crearAuspiciante();

        System.out.println("Para quien esta dirigido el concurso: ");
        TipoAnimalesConcurso tipoAnimalesConcurso = null; //Se coloca la variable como null para empezar
        System.out.println("1. Perros \n"+"2. Gatos \n"+"3. Todos");
        int seleccion = sc.nextInt();
        sc.nextLine();
        if(seleccion==1){
            tipoAnimalesConcurso = TipoAnimalesConcurso.PERROS;
        }else if(seleccion==2){
            tipoAnimalesConcurso = TipoAnimalesConcurso.GATOS;
        }else if(seleccion==3){
            tipoAnimalesConcurso = TipoAnimalesConcurso.TODOS;
        }else{
            while(seleccion!=1&&seleccion!=2&&seleccion!=3)
            System.out.println("Respuesta no valida, seleccione nuevamente: ");
            System.out.println("Para quien esta dirigido el concurso: ");
            System.out.println("1. Perros \n"+"2. Gatos \n"+"3. Todos");
            seleccion = sc.nextInt();
        }

        //Se crea el concurso: 
        Concurso concurso = new Concurso(nombre, fecha, hora, fechaInicio, fechaCierre, ciudad, lugar, premio, auspiciante, tipoAnimalesConcurso);
        return concurso;
    }


    
    public static void inscribirParticipantes(){
        System.out.println("Se muestra el listado de concursos abiertos: ");
        
        for(Concurso concurso: listaConcursos){
            if (concurso.getEstaAbierto()){
                System.out.println(concurso);
            }
        }

        //Se solicita ingresar el codigo del concurso y el id de la mascota
        //Para esto se debe verificar que la mascota este en la lista de mascotas
        System.out.println("Ingrese el nombre del concurso en el que se va a registrar al participante: ");
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
                System.out.println("La mascota fue encontrada y registrada exitosamente");

            }else{
                System.out.println("La mascota no fue encontrada, ejecute el programa nuevamente");
            }

        }else{
            System.out.println("El codigo del concurso no fue encontrado, vuelva a ejecutar el programa");
        }
            
        
    }

    

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
        System.out.println("Ingresar el id del duenio a editar: ");

        String idDuenio = sc.nextLine();

        //Se crea el objeto de prueba
        DuenioMascota duenioBusqueda = new DuenioMascota(idDuenio);
        if(listaDuenios.contains(duenioBusqueda)){
            System.out.println("Duenio encontrado exitosamente");
            //El metodo contains usa el equals definido en la clase DuenioMascota
            int indice = listaDuenios.indexOf(duenioBusqueda);
            DuenioMascota duenioEdicion = listaDuenios.get(indice);
            
            int seleccion;
            do{
                seleccion = SistemaMenu.menuEditarDuenio();
                switch (seleccion){
                    case 1: //Editar nombre
                        System.out.println("Ingrese el nuevo nombre para el dueño: ");
                        String nombreActualizado = sc.nextLine();
                        duenioEdicion.setNombre(nombreActualizado);
                        System.out.println("Se ha actualizado el nombre exitosamente");
                        break;
    
    
                    case 2: //Editar apellidos
                        System.out.println("Ingrese los nuevos apellidos para el dueño, separados por un espacio: ");
                        String apellidosActualizados = sc.nextLine();
                        duenioEdicion.setApellidos(apellidosActualizados);
                        System.out.println("Se han actualizado los apellidos exitosamente");
                        break;
    
                    case 3: //Editar direccion
                        System.out.println("Ingrese la nueva direccion del dueño: ");
                        String direccionActualizada = sc.nextLine();
                        duenioEdicion.setDireccion(direccionActualizada);
                        System.out.println("Se ha actualizado la direccion exitosamente");
                        break;
    
                    case 4: //Editar telefono
                        System.out.println("Ingrese el nuevo numero de telefono: ");
                        String telefonoActualizado = sc.nextLine();
                        duenioEdicion.setTelefono(telefonoActualizado);
                        System.out.println("Se ha actualizado el numero de telefono exitosamente");
                        break;
                    
                    case 5: //Editar ciudad
                        Ciudad ciudadActualizada = crearCiudad();
                        System.out.println("Ingrese los nuevos datos para la ciudad...");
                        duenioEdicion.setCiudad(ciudadActualizada);
                        System.out.println("Se ha actualizado la ciudad exitosamente: ");
                        break;
    
                    case 6: //Editar email
                        System.out.println("Ingrese la nueva direccion de email: ");
                        String emailActualizado = sc.nextLine();
                        duenioEdicion.setEmail(emailActualizado);
                        System.out.println("Se ha actualiado la direccion de email exitosamente");
                        break;

                    default:
                        if (seleccion!=7)
                            System.out.println("No se ha encontrado la opcion ingresada. \n"+"Por favor ingrese una opcion nuevamente.");
                            break;
                        
                }
            }while(seleccion!=7);
            
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
        TipoAnimal tipoAnimal = null;
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

        System.out.println("Seleccionar el numero del duenio de la mascota: ");
        int i = 0;
        for(DuenioMascota duenio: listaDuenios){
            System.out.println((i+1)+"."+" "+duenio);
        }
        //El usuario escoge al duenio de la mascota
        int eleccionDuenio = sc.nextInt();
        sc.nextLine();
        //Se resta 1 al numero seleccionado para acceder directamente a su indice en la lista
        int indiceDuenioSeleccionado = eleccionDuenio-1;

        //Se obtiene al duenio de la mascota
        DuenioMascota duenio = listaDuenios.get(indiceDuenioSeleccionado);

        //Se crea el objeto mascota
        //Se debe corregir esta creacion para asignarle un id a la mascota
        Mascota mascota = new Mascota(nombre, tipoAnimal, raza, fechaNacimiento, foto, duenio,"ID");
        return mascota; 

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

    //Para premios (MEJORAR LA INSERCION DEL AUSPICIANTE)

    public static Premio crearPremios(){
        boolean tieneAuspiciante = false;
        System.out.println("Ingrese la descripcion del premio para el primer lugar: ");
        String descripcion1 = sc.nextLine();
        System.out.println("Ingrese la descripcion del premio para el segundo lugar: ");
        String descripcion2 = sc.nextLine();
        System.out.println("Ingrese la descripcion del premio para el tercer lugar: ");
        String descripcion3 = sc.nextLine();
        System.out.println("Sus premios tienen algun auspiciante? ");
        System.out.println("(Si/no) ");
        String respuesta = sc.nextLine().toLowerCase();

        Auspiciante ausp = null;

        //Ojo con esta parte
        while(!(respuesta.equals("si")||respuesta.equals("no"))){
            System.out.println("No se detecto una respuesta, por favor intente nuevamente: ");
            System.out.println("Sus premios tienen algun auspiciante? ");
            System.out.println("(Si/no) ");
            respuesta = sc.nextLine().toLowerCase();

        }
        //Pedirle un auspiciante???
        if(respuesta.equals("si")){
            int i = 0;
            tieneAuspiciante = true;
            System.out.println("Seleccione el auspiciante para sus premios: ");
            for(Auspiciante auspFor: listaAuspiciantes){
                System.out.println((i+1)+". "+auspFor);
                
            }
            int eleccion = sc.nextInt();
            sc.nextLine();
            if(eleccion>=listaAuspiciantes.size()||eleccion<0){
                System.out.println("No se ha encontrado el auspiciante, por favor vuelva a ejecutar el programa");
                return null;
            }
            ausp = listaAuspiciantes.get(i-1); //Se selecciona el auspiciante del indice escogido

            

        }


        //Se crea el objeto
        Premio premio = new Premio(descripcion1, descripcion2, descripcion3, tieneAuspiciante, ausp); //El constructor recibe el auspiciante creado
        System.out.println("El premio ha sido creado exitosamente");
        return premio;
    }


    //Crear auspiciante
    public static Auspiciante crearAuspiciante(){
        System.out.println("Ingrese el nombre del auspiciante para los premios del concurso: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la direccion del auspiciante: ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el telefono del auspiciante: ");
        String telefono = sc.nextLine();

        //Se crea la ciudad con el metodo definido para ciudades
        Ciudad ciudad = crearCiudad();

        System.out.println("Ingrese el email del auspiciante: ");
        String email = sc.nextLine();
        System.out.println("Ingrese la direccion de la pagina web del auspiciante: ");
        String webPage = sc.nextLine();

        //Se crea el objeto
        Auspiciante auspiciante = new Auspiciante(nombre, direccion, telefono, ciudad, email, webPage);

        return auspiciante;
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
