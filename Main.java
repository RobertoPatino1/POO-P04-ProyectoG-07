import java.util.Scanner;

import Modelo.Ciudad;
import Modelo.DuenioMascota;
import Modelo.Mascota;
import Modelo.SistemaLista;
import Modelo.TipoAnimal;
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
                    seleccion1 = SistemaMenu.menuConcursos();

                    //Se debe hacer un print mostrando los concursos existentes
                    //System.out.println(listaConcursos);



                    if (seleccion == 1){
                        //Creacion de un concurso
                        System.out.println("---Creacion de concurso---");


                        
                        //PEDIR DATOS PARA CREAR EL CONCURSO

                        break;
                    }else if(seleccion == 2){
                        //Inscripcion de participante
                        System.out.println("---Inscripcion de participante---");

                        //PEDIR DATOS PARA INSCRIBIR AL PARTICIPANTE

                        break;
                    }else if (seleccion == 3){
                        //Regresar al menu principal
                        System.out.println("---Regresar al menu principal---");
                        //---Volver a poner el metodo en esta linea---?
                        break;
                    }
                    break;


                case 2: //Administrar Duenios
                    seleccion2 = SistemaMenu.menuDuenios();
                    if (seleccion2 == 4){
                        //Crear duenio
                        //System.out.println(listaDuenios);

                        SistemaLista.visualizarListaDuenios();
                        System.out.println("---Crear duenio---");

                        DuenioMascota duenioCreado = SistemaLista.crearDuenio(); //Se crea el duenio de la mascota
                        //Luego se agrega este duenio creado a la lista de duenios

                        SistemaLista.registrarDuenioMascota(duenioCreado);


                        break;
                    }else if(seleccion2 == 5){
                        //Editar duenio
                        System.out.println("Editar duenio");
                        
                        SistemaLista.editarDuenio();

                        break;

                    }else if(seleccion2 == 6){
                        //Regresar al menu
                        System.out.println("Regresar al menu principal");
                        break;
                    }
                    break;

                case 3:
                    seleccion3 = SistemaMenu.menuMascotas();
                    if (seleccion3 == 7){

                        //Se muestra la lista de mascotas existentes
                        SistemaLista.visualizarListaMascotas();
                        //Crear mascota
                        System.out.println("Crear mascota");
                        Mascota mascotaCreada = SistemaLista.crearMascota();

                        //Se agrega la mascota a la lista
                        SistemaLista.registrarMascotas(mascotaCreada);
                        break;
                    }else if(seleccion3 == 8){
                        //Eliminar mascota
                        System.out.println("Eliminar mascota");
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







    
}