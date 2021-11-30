package Modelo.SistemaClases;
import Modelo.SistemaClases.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import Modelo.*;

public class SistemaDuenioMascota {

    static Scanner sc = new Scanner(System.in);
    //Para Duenios de mascota

    //Metodo 1
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
        System.out.println("Ingrese el email del duenio: ");
        System.out.print(">>> ");
        String emailDuenio = sc.nextLine();

        Ciudad ciudadDuenio = SistemaLista.seleccionarCiudad();

        //Se crea el objeto
        System.out.println("Se ha creado el dueño exitosamente");
        DuenioMascota duenio = new DuenioMascota(nombreDuenio, direccionDuenio, telefonoDuenio, ciudadDuenio, emailDuenio, cedulaDuenio, apellidosDuenio);
        return duenio;
    }

    //Metodo 2

    public static void editarDuenio(){
        System.out.println("Ingresar el id del duenio a editar: ");
        System.out.print(">>> ");
        String idDuenio = sc.nextLine();

        //Se crea el objeto de prueba
        DuenioMascota duenioBusqueda = new DuenioMascota(idDuenio);
        if(SistemaLista.listaDuenios.contains(duenioBusqueda)){
            System.out.println("Duenio encontrado exitosamente");
            //El metodo contains usa el equals definido en la clase DuenioMascota
            int indice = SistemaLista.listaDuenios.indexOf(duenioBusqueda);
            DuenioMascota duenioEdicion = SistemaLista.listaDuenios.get(indice);
            
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
                        Ciudad ciudadActualizada = SistemaLista.crearCiudad();
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



    
}
