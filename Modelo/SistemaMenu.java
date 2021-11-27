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
    
}
