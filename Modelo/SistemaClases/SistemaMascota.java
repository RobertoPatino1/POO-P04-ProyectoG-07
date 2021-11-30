package Modelo.SistemaClases;
import Modelo.SistemaClases.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import Modelo.*;

public class SistemaMascota {
    static Scanner sc = new Scanner(System.in);

    //Metodo 1
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
        LocalDate fechaNacimiento = SistemaLista.crearFecha();

        System.out.println("Ingresar la foto de la mascota: ");
        System.out.print(">>> ");
        String foto = sc.nextLine();

        System.out.println("Seleccionar el numero del duenio de la mascota: ");
        
        DuenioMascota duenio = SistemaLista.seleccionarDuenio();
        //Se crea el id de la mascota y se le notifica al usuario
        
        String id = crearIdMascota(4); //Se usa el metodo creado abajo

        System.out.println("El ID asignado a su mascota es: "+id);

        //Se crea el objeto mascota
        Mascota mascota = new Mascota(nombre, tipoAnimal, raza, fechaNacimiento, foto, duenio,id);
        System.out.println("Se ha creado la mascota exitosamente");
        return mascota; 

    }


    //Metodo 2
    public static void eliminarMascota(){
        System.out.println("Ingrese el id de la mascota que desea eliminar de la lista: ");
        System.out.print(">>> ");
        String id = sc.nextLine().toUpperCase();
        //Se crea la mascota de busqueda solo con el id
        Mascota mascotaBusqueda = new Mascota(id);

        //Se busca la mascota en la lista de mascotas
        if(SistemaLista.listaMascotas.contains(mascotaBusqueda)){
            int indice = SistemaLista.listaMascotas.indexOf(mascotaBusqueda);
            Mascota mascotaEliminar = SistemaLista.listaMascotas.get(indice);
            //Se coloca que esta mascota ya no estara disponible para futuras inscripciones
            mascotaEliminar.setDisponibilidadDeInscripciones(false);
            //Se elimina a la mascota de la lista

            //En caso de que haya participado se mantiene el registro
            if(mascotaEliminar.getParticipacion()){
                System.out.println("Se ha eliminado a la mascota "+mascotaEliminar.getNombre()+" para futuras inscripciones");
            }else{
                System.out.println("Se ha eliminado de la lista a la mascota "+mascotaEliminar.getNombre());
                SistemaLista.listaMascotas.remove(mascotaEliminar); //Se la elimina de la lista solo si no ha participado anteriormente
            }

        }else{
            System.out.println("No se ha encontrado la mascota solicitada, por favor vuelva a ejecutar");
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
