package Modelo;
import java.util.Scanner;
public class SistemaMenu {
    static Scanner sc = new Scanner(System.in); //Debe ser estatico para poder ser usado en los metodos


    public static int menuPrincipal(){
        System.out.println("---Menu principal---");
        System.out.println("Selecciona una opcion");
        System.out.println("1. Administrar Concursos");
        System.out.println("2. Administrar Dueños");
        System.out.println("3. Administrar Mascotas");
        System.out.println("4. Salir");
        String opcionString = sc.nextLine();
        int opcion = Integer.valueOf(opcionString);
        return opcion;
    }

    //Opciones principales
    public static int menuConcursos(){
        System.out.println("---Menu de concursos---");
        System.out.println("1. Crear concurso");
        System.out.println("2. Inscribir participante");
        System.out.println("3. Regresar al menú principal");
        String opcionString = sc.nextLine();
        int opcion = Integer.valueOf(opcionString);
        return opcion;
    }

    public static int menuDuenios(){
        System.out.println("---Menu de duenios---");
        System.out.println("4. Crear dueño");
        System.out.println("5. Editar dueño");
        System.out.println("6. Regresar al menú principal");
        String opcionString = sc.nextLine();
        int opcion = Integer.valueOf(opcionString);
        return opcion;      
    }

    public static int menuMascotas(){
        System.out.println("---Menu de mascotas---");
        System.out.println("7. Crear mascota");
        System.out.println("8. Eliminar mascota");
        System.out.println("9. Regresar al menú principal");
        String opcionString = sc.nextLine();
        int opcion = Integer.valueOf(opcionString);
        return opcion;  
    }





    //Crear duenio
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
        return duenio;
    }

    public static void editarDuenio(){
        System.out.println("---Editar duenio---");

        System.out.println("Ingresar el id del duenio a editar: ");

        String idDuenio = sc.nextLine();

        //Se recorre la lista de duenios buscando el que contenga esa id



    }
    
    public static void crearMascota(){
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

    }

    
}
