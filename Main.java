import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seleccion;
        int seleccion1;
        int seleccion2;
        int seleccion3;

        do{
            seleccion = menuPrincipal();
            switch (seleccion){
                case 1: //Administrar concursos
                    seleccion1 = menuConcursos();
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
                    seleccion2 = menuDuenios();
                    if (seleccion2 == 4){
                        //Crear duenio
                        System.out.println("---Crear duenio---");

                        //PEDIR DATOS PARA CREAR AL DUENIO

                        break;
                    }else if(seleccion2 == 5){
                        //Editar duenio
                        System.out.println("Editar duenio");

                        //PEDIR DATOS A REEMPLAZAR PARA EL DUENIO O ALGO ASI

                        break;
                    }else if(seleccion2 == 6){
                        //Regresar al menu
                        System.out.println("Regresar al menu principal");
                        break;
                    }
                    break;

                case 3:
                    seleccion3 = menuMascotas();
                    if (seleccion3 == 7){
                        //Crear mascota
                        System.out.println("Crear mascota");

                        //PEDIR LOS DATOS PARA CREAR LA MASCOTA

                        break;
                    }else if(seleccion3 == 8){
                        //Eliminar mascota
                        System.out.println("Eliminar mascota");

                        //PEDIR LA MASCOTA QUE SE DESEA ELIMINAR (REVISAR ESTO)

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


    static Scanner sc = new Scanner(System.in); //Debe ser estatico para poder ser usado en los metodos


    public static int menuPrincipal(){
        System.out.println("---Menu principal---");
        System.out.println("Selecciona una opcion");
        System.out.println("1. Administrar Concursos");
        System.out.println("2. Administrar Dueños");
        System.out.println("3. Administrar Mascotas");
        System.out.println("4. Salir");
        int opcion = sc.nextInt();
        return opcion;
    }

    //Opciones principales
    public static int menuConcursos(){
        System.out.println("---Menu de concursos---");
        System.out.println("1. Crear concurso");
        System.out.println("2. Inscribir participante");
        System.out.println("3. Regresar al menú principal");
        int opcion = sc.nextInt();
        return opcion;
    }

    public static int menuDuenios(){
        System.out.println("---Menu de duenios---");
        System.out.println("4. Crear dueño");
        System.out.println("5. Editar dueño");
        System.out.println("6. Regresar al menú principal");
        int opcion = sc.nextInt();
        return opcion;      
    }

    public static int menuMascotas(){
        System.out.println("---Menu de mascotas---");
        System.out.println("7. Crear mascota");
        System.out.println("8. Eliminar mascota");
        System.out.println("9. Regresar al menú principal");
        int opcion = sc.nextInt();
        return opcion;  
    }





    
}