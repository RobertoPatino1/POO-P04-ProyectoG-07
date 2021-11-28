import java.util.Scanner;

import Modelo.Ciudad;
import Modelo.Concurso;
import Modelo.DuenioMascota;
import Modelo.Mascota;
import Modelo.SistemaLista;
import Modelo.TipoAnimal;
import Modelo.TipoAnimalesConcurso;
import Modelo.SistemaMenu;
public class Main {
    public static void main(String[] args) {
        
        /*






        Objetos creados previo a la ejecucion del programa







        */

        Scanner sc = new Scanner(System.in);
        int seleccion;
        int seleccion1;
        int seleccion2;
        int seleccion3;

        do{
            seleccion = SistemaMenu.menuPrincipal();
            switch (seleccion){
                case 1: //Administrar concursos
                    SistemaLista.visualizarListaConcursos(); //Se muestra la lista de concursos
                    seleccion1 = SistemaMenu.menuConcursos();
                    if (seleccion == 1){
                        //Creacion de un concurso
                        System.out.println("---Creacion de concurso---");
                        SistemaLista.crearConcurso();
                        break;

                    }else if(seleccion == 2){
                        //Inscripcion de participante
                        System.out.println("---Inscripcion de participante---");
                        SistemaLista.inscribirParticipantes();
                        break;
                    }else if (seleccion == 3){
                        //Regresar al menu principal
                        System.out.println("---Regresar al menu principal---");
                        break;
                    }
                    break;


                case 2: //Administrar Duenios
                    //Se muestra por pantalla la lista de duenios
                    SistemaLista.visualizarListaDuenios();
                    seleccion2 = SistemaMenu.menuDuenios();
                    if (seleccion2 == 4){
                        System.out.println("---Crear duenio---");
                        DuenioMascota duenioCreado = SistemaLista.crearDuenio(); //Se crea el duenio de la mascota

                        //Luego se agrega este duenio creado a la lista de duenios
                        SistemaLista.registrarDuenioMascota(duenioCreado);
                        break;
                    }else if(seleccion2 == 5){
                        //Editar duenio
                        System.out.println("---Editar duenio---");
                        SistemaLista.editarDuenio();
                        break;

                    }else if(seleccion2 == 6){
                        //Regresar al menu
                        System.out.println("Regresar al menu principal");
                        break;
                    }
                    break;

                case 3:
                    //Se muestra la lista de mascotas existentes
                    SistemaLista.visualizarListaMascotas();
                    seleccion3 = SistemaMenu.menuMascotas();
                    if (seleccion3 == 7){
                        //Crear mascota
                        System.out.println("---Crear mascota---");
                        Mascota mascotaCreada = SistemaLista.crearMascota();
                        //Se agrega la mascota a la lista
                        SistemaLista.registrarMascotas(mascotaCreada);
                        break;
        
                    }else if(seleccion3 == 8){
                        //Eliminar mascota
                        System.out.println("---Eliminar mascota---");
                        SistemaLista.eliminarMascota();
                        
                        break;
                        
                    }else if(seleccion3 == 9){
                        //Regresar al menu
                        System.out.println("Regresar al menu principal");
                        break;
                    }
                    break;

                default:
                    if (seleccion!=4)
                        System.out.println("No se ha encontrado la opcion ingresada. \n"+"Por favor ingrese una opcion nuevamente.");
                        break;
                    
            }
        }while(seleccion!=4);
        sc.close();

        if (seleccion == 4)
            System.out.println("Gracias por usar nuestro sistema");



    }

    public static void crearObjetos(){
        //Dentro de este metodo se deben crear los objetos especificados al final del problema
        /*
        ● 1 Concurso pasado, con 5 mascotas inscritas y 3 ganadores.
        ● 1 Concurso vigente
        ● 10 mascotas
        ● 10 dueños de mascotas
        ● Las ciudades Guayaquil, Quito y Cuenca
        ● 3 auspiciantes
        */
        
    }







    
}