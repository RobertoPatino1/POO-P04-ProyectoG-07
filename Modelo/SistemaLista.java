package Modelo;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaLista {
    private static ArrayList<Concurso> listaConcursos = new ArrayList<>(); //Puede contener concursos abiertos o cerrados
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
        System.out.print(">>> ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la fecha del concurso: ");
        System.out.print(">>> ");
        String fecha = sc.nextLine();
        System.out.println("Ingrese la hora del concurso: ");
        System.out.print(">>> ");
        String hora = sc.nextLine();
        System.out.println("Ingrese la fecha de inicio de las inscripciones: ");
        System.out.print(">>> ");
        String fechaInicio = sc.nextLine();
        System.out.println("Ingrese la fecha de cierre para las inscripciones: ");
        System.out.print(">>> ");
        String fechaCierre = sc.nextLine();
        
        
        Ciudad ciudad = crearCiudad(); //Se usa un metodo definido en esta misma clase
        
        System.out.println("Ingrese el lugar donde se llevará a cabo el concurso: ");
        System.out.print(">>> ");
        String lugar = sc.nextLine();

        //Se piden datos para el auspiciante
        System.out.println("Desea agregar un auspiciante nuevo a la lista de auspiciantes para su concurso?\n (Si/No)");
        String respuesta = sc.nextLine().toLowerCase();
        while(!respuesta.equals("si")&&!respuesta.equals("no")){
            System.out.println("Respuesta no valida, por favor ingrese si o no.");
            System.out.println("Desea agregar un auspiciante nuevo a la lista de auspiciantes para su concurso?\n (Si/No)");
            respuesta = sc.nextLine().toLowerCase();
        }
        Auspiciante auspiciante = null;
        if(respuesta.equals("si")){
            auspiciante = crearAuspiciante();
            //Se lo registra en la lista
            if(auspiciante!=null)
                listaAuspiciantes.add(auspiciante);

        }


        //Se piden datos para el premio
        Premio premio = crearPremios();
        //Se lo registra en la lista
        listaPremios.add(premio);



        System.out.println("Para quien esta dirigido el concurso: ");
        TipoAnimalesConcurso tipoAnimalesConcurso = null; //Se coloca la variable como null para empezar
        System.out.println("1. Perros \n"+"2. Gatos \n"+"3. Todos");
        System.out.print(">>> ");
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
            System.out.print(">>> ");
            seleccion = sc.nextInt();
        }

        //Se crea el concurso: 
        System.out.println("Se ha creado el concurso exitosamente");
        Concurso concurso = new Concurso(nombre, fecha, hora, fechaInicio, fechaCierre, ciudad, lugar, premio, auspiciante, tipoAnimalesConcurso);
        return concurso;
    }


    
    public static void inscribirParticipantes(){
        int i = 0;
        System.out.println("Se muestra el listado de concursos abiertos: ");
        
        for(Concurso concurso: listaConcursos){
            if (concurso.getEstaAbierto()){
                System.out.println((i+1)+". "+concurso);
            }
        }

        //Se solicita ingresar el codigo del concurso y el id de la mascota
        //Para esto se debe verificar que la mascota este en la lista de mascotas
        System.out.println("Ingrese el nombre del concurso en el que se va a registrar al participante: ");
        System.out.print(">>> ");
        
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
            System.out.print(">>> ");
            String idIngresado = sc.nextLine();
            Mascota mascotaBusqueda = new Mascota(idIngresado);

            if(listaMascotas.contains(mascotaBusqueda)){
                //Se registra a la mascota en el concurso especificado
                int indice2 = listaMascotas.indexOf(mascotaBusqueda);
                Mascota mascotaRegistro = listaMascotas.get(indice2);
                concurso.inscribirParticipantes(mascotaRegistro); 
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
        System.out.print(">>> ");
        String nombreDuenio = sc.nextLine();
   
        System.out.println("Ingrese los apellidos del dueño separados por un espacio: ");
        System.out.print(">>> ");
        String apellidosDuenio = sc.nextLine();
        System.out.println("Ingrese la cedula del dueño: ");
        System.out.print(">>> ");
        String cedulaDuenio = sc.nextLine();
        System.out.println("Ingrese la direccion del dueño: ");
        System.out.print(">>> ");
        String direccionDuenio = sc.nextLine();
        System.out.println("Ingrese el telefono del duenio: ");
        System.out.print(">>> ");
        String telefonoDuenio = sc.nextLine();
        System.out.println("Ingrese el nombre de la ciudad en la que reside el duenio: ");
        System.out.print(">>> ");
        String nombreCiudad = sc.nextLine();
        System.out.println("Ingrese el nombre de la provincia en la que reside el duenio: ");
        System.out.print(">>> ");
        String provinciaDuenio = sc.nextLine();
        System.out.println("Ingrese el email del duenio: ");
        System.out.print(">>> ");
        String emailDuenio = sc.nextLine();

        //Creando el objeto de tipo ciudad
        Ciudad ciudadDuenio = new Ciudad(nombreCiudad,provinciaDuenio);


        //Se crea el objeto
        System.out.println("Se ha creado el dueño exitosamente");
        DuenioMascota duenio = new DuenioMascota(nombreDuenio, direccionDuenio, telefonoDuenio, ciudadDuenio, emailDuenio, cedulaDuenio, apellidosDuenio);
        //Sera que se lo agrega a la lista de Duenios de una?
        return duenio;
    }


    public static void editarDuenio(){
        System.out.println("Ingresar el id del duenio a editar: ");
        System.out.print(">>> ");
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
                        System.out.print(">>> ");
                        String nombreActualizado = sc.nextLine();
                        duenioEdicion.setNombre(nombreActualizado);
                        System.out.println("Se ha actualizado el nombre exitosamente");
                        break;
    
    
                    case 2: //Editar apellidos
                        System.out.println("Ingrese los nuevos apellidos para el dueño, separados por un espacio: ");
                        System.out.print(">>> ");
                        String apellidosActualizados = sc.nextLine();
                        duenioEdicion.setApellidos(apellidosActualizados);
                        System.out.println("Se han actualizado los apellidos exitosamente");
                        break;
    
                    case 3: //Editar direccion
                        System.out.println("Ingrese la nueva direccion del dueño: ");
                        System.out.print(">>> ");
                        String direccionActualizada = sc.nextLine();
                        duenioEdicion.setDireccion(direccionActualizada);
                        System.out.println("Se ha actualizado la direccion exitosamente");
                        break;
    
                    case 4: //Editar telefono
                        System.out.println("Ingrese el nuevo numero de telefono: ");
                        System.out.print(">>> ");
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
                        System.out.print(">>> ");
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


        System.out.println("Ingrese el nombre de la mascota: ");
        System.out.print(">>> ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el tipo de mascota que se inscribira: ");
        System.out.println("1. Perro");
        System.out.println("2. gato");
        TipoAnimal tipoAnimal = null;
        System.out.print(">>> ");
        String decisionString = sc.nextLine();
        int decision = Integer.valueOf(decisionString);

        while(decision!=1&&decision!=2){
            System.out.println("Opcion no encontrada, por favor intente nuevamente.");
            System.out.println("Ingrese el tipo de mascota que se inscribira: ");
            System.out.println("1. Perro");
            System.out.println("2. gato");
            System.out.print(">>> ");
            decisionString = sc.nextLine();
            decision = Integer.valueOf(decisionString);
        }
        if(decision==1){
            tipoAnimal = TipoAnimal.PERRO;
        }else if(decision==2){
            tipoAnimal = TipoAnimal.GATO;
        }
        
        System.out.println("Ingrese la raza de la mascota a inscribir: ");
        System.out.print(">>> ");
        String raza = sc.nextLine();

        System.out.println("Ingrese la fecha de nacimiento aproximada de la mascota: ");
        System.out.print(">>> ");
        String fechaNacimiento = sc.nextLine(); //Corregir esto

        System.out.println("Ingresar la foto de la mascota: ");
        System.out.print(">>> ");
        String foto = sc.nextLine();

        System.out.println("Seleccionar el numero del duenio de la mascota: ");
        int i = 0;
        for(DuenioMascota duenio: listaDuenios){
            System.out.println((i+=1)+"."+" "+duenio);
        }
        //El usuario escoge al duenio de la mascota
        System.out.print(">>> ");
        int eleccionDuenio = sc.nextInt();
        sc.nextLine();
        //Se resta 1 al numero seleccionado para acceder directamente a su indice en la lista
        int indiceDuenioSeleccionado = eleccionDuenio-1;

        //Se obtiene al duenio de la mascota
        DuenioMascota duenio = listaDuenios.get(indiceDuenioSeleccionado);

        //Se crea el id de la mascota y se le notifica al usuario
        String id = crearIdMascota(4);
        System.out.println("El ID asignado a su mascota es: "+id);

        //Se crea el objeto mascota
        Mascota mascota = new Mascota(nombre, tipoAnimal, raza, fechaNacimiento, foto, duenio,id);
        System.out.println("Se ha creado la mascota exitosamente");
        return mascota; 

    }

    public static void eliminarMascota(){
        System.out.println("Ingrese el id de la mascota que desea eliminar de la lista: ");
        System.out.print(">>> ");
        String id = sc.nextLine().toUpperCase();
        //Se crea la mascota de busqueda solo con el id
        Mascota mascotaBusqueda = new Mascota(id);

        //Se busca la mascota en la lista de mascotas
        if(listaMascotas.contains(mascotaBusqueda)){
            int indice = listaMascotas.indexOf(mascotaBusqueda);
            Mascota mascotaEliminar = listaMascotas.get(indice);
            //Se coloca que esta mascota ya no estara disponible para futuras inscripciones
            mascotaEliminar.setDisponibilidadDeInscripciones(false);
            //Se elimina a la mascota de la lista
            System.out.println("Se ha eliminado a la mascota "+mascotaEliminar.getNombre());
            listaMascotas.remove(mascotaEliminar);

        }else{
            //No vamos a usar un bucle while para evitar problemas de input para datos
            System.out.println("No se ha encontrado la mascota solicitada, por favor vuelva a ejecutar");
        }

    }






    //Para ciudades
    public static Ciudad crearCiudad(){
        System.out.println("Ingrese el nombre de la ciudad: ");
        System.out.print(">>> ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el nombre de la provincia: ");
        System.out.print(">>> ");
        String provincia = sc.nextLine();
        
        //Se crea el objeto de tipo ciudad y se lo retorna
        System.out.println("Se ha creado la ciudad exitosamente\n");
        Ciudad ciudad = new Ciudad(nombre, provincia);
        return ciudad;
    }

    //Para premios (MEJORAR LA INSERCION DEL AUSPICIANTE)

    public static Premio crearPremios(){
        boolean tieneAuspiciante = false;
        System.out.println("Ingrese la descripcion del premio para el primer lugar: ");
        System.out.print(">>> ");
        String descripcion1 = sc.nextLine();
        System.out.println("Ingrese la descripcion del premio para el segundo lugar: ");
        System.out.print(">>> ");
        String descripcion2 = sc.nextLine();
        System.out.println("Ingrese la descripcion del premio para el tercer lugar: ");
        System.out.print(">>> ");
        String descripcion3 = sc.nextLine();
        System.out.println("Sus premios tienen algun auspiciante? ");
        System.out.println("(Si/no) ");
        System.out.print(">>> ");
        String respuesta = sc.nextLine().toLowerCase();

        Auspiciante ausp = null;

        //Ojo con esta parte
        while(!respuesta.equals("si")&&!respuesta.equals("no")){
            System.out.println("No se detecto una respuesta, por favor intente nuevamente: ");
            System.out.println("Sus premios tienen algun auspiciante? ");
            System.out.println("(Si/no) ");
            System.out.print(">>> ");
            respuesta = sc.nextLine().toLowerCase();

        }
        //Pedirle un auspiciante
        if(respuesta.equals("si")){
            int i = 0;
            tieneAuspiciante = true;
            System.out.println("Seleccione el auspiciante para sus premios: ");
            for(Auspiciante auspFor: listaAuspiciantes){
                System.out.println((i+=1)+". "+auspFor);
                
            }
            System.out.print(">>> ");
            int eleccion = sc.nextInt();
            sc.nextLine();
            while(eleccion-1>=listaAuspiciantes.size()||eleccion-1<0){
                System.out.println("No se ha encontrado el auspiciante, por favor ingrese un numero valido");
                System.out.print(">>> ");
                eleccion = sc.nextInt();
                sc.nextLine();
            }
            ausp = listaAuspiciantes.get(eleccion-1); //Se selecciona el auspiciante del indice escogido

            

        }


        //Se crea el objeto
        Premio premio = new Premio(descripcion1, descripcion2, descripcion3, tieneAuspiciante, ausp); //El constructor recibe el auspiciante creado
        System.out.println("El premio ha sido creado exitosamente");
        return premio;
    }


    //Crear auspiciante
    public static Auspiciante crearAuspiciante(){
        System.out.println("Ingrese el nombre del auspiciante para los premios del concurso: ");
        System.out.print(">>> ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese la direccion del auspiciante: ");
        System.out.print(">>> ");
        String direccion = sc.nextLine();
        System.out.println("Ingrese el telefono del auspiciante: ");
        System.out.print(">>> ");
        String telefono = sc.nextLine();

        //Se crea la ciudad con el metodo definido para ciudades
        System.out.println("Ingrese los datos de la ciudad para el auspiciante \n");
        Ciudad ciudad = crearCiudad();

        System.out.println("Ingrese el email del auspiciante: ");
        System.out.print(">>> ");
        String email = sc.nextLine();
        System.out.println("Ingrese la direccion de la pagina web del auspiciante: ");
        System.out.print(">>> ");
        String webPage = sc.nextLine();

        //Se crea el objeto
        System.out.println("Se ha creado el auspiciante exitosamente\n");
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
        for(int i = 0; i < listaConcursos.size(); i++){
            System.out.println(listaConcursos.get(i).toString()+"\n");
        }
    }

    public static void visualizarListaMascotas(){
        for(int i = 0; i < listaMascotas.size(); i++){
            System.out.println(listaMascotas.get(i).toString()+"\n");
        }
    }

    public static void visualizarListaDuenios(){
        for(int i = 0; i < listaDuenios.size(); i++){
            System.out.println(listaDuenios.get(i).toString()+"\n");
        }
    }

    public static void visualizarListaCiudades(){
        for(int i = 0; i < listaCiudades.size(); i++){
            System.out.println(listaCiudades.get(i).toString()+"\n");
        }
    }

    public static void visualizarListaAuspiciantes(){
        for(int i = 0; i < listaAuspiciantes.size(); i++){
            System.out.println(listaAuspiciantes.get(i).toString()+"\n");
        }
    }
    


    //Metodo para crear un id aleatorio para las mascotas

    public static String crearIdMascota(int i) 
    { 
        String theAlphaNumericS;
        StringBuilder builder;
        
        theAlphaNumericS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"; 

        //create the StringBuffer
        builder = new StringBuilder(i); 

        for (int m = 0; m < i; m++) { 

            // generate numeric
            int myindex 
                = (int)(theAlphaNumericS.length() 
                        * Math.random()); 

            // add the characters
            builder.append(theAlphaNumericS 
                        .charAt(myindex)); 
        } 

        return builder.toString();
    }
    
}
