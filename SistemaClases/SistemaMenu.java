package sistemaClases;
import java.util.Scanner;
public class SistemaMenu {
    static Scanner sc = new Scanner(System.in); //Debe ser estatico para poder ser usado en los metodos


    //Menu principal del proyecto
    public static int menuPrincipal(){
        System.out.println("---Menu principal---");
        System.out.println("Selecciona una opcion");
        System.out.println("1. Administrar Concursos");
        System.out.println("2. Administrar Dueños");
        System.out.println("3. Administrar Mascotas");
        System.out.println("4. Salir");
        System.out.print(">>> ");
        String opcionString = sc.nextLine();
        int opcion = Integer.valueOf(opcionString);
        return opcion;
    }

    //Opciones principales del proyecto
    public static int menuConcursos(){
        System.out.println("---Menu de concursos---");
        System.out.println("1. Crear concurso");
        System.out.println("2. Inscribir participante");
        System.out.println("3. Regresar al menú principal");
        System.out.print(">>> ");
        String opcionString = sc.nextLine();
        int opcion = Integer.valueOf(opcionString);
        return opcion;
    }

    //Opciones del apartado dueños
    public static int menuDuenios(){
        System.out.println("---Menu de duenios---");
        System.out.println("4. Crear dueño");
        System.out.println("5. Editar dueño");
        System.out.println("6. Regresar al menú principal");
        System.out.print(">>> ");
        String opcionString = sc.nextLine();
        int opcion = Integer.valueOf(opcionString);
        return opcion;      
    }

    //Opciones del apartado Mascotas
    public static int menuMascotas(){
        System.out.println("---Menu de mascotas---");
        System.out.println("7. Crear mascota");
        System.out.println("8. Eliminar mascota");
        System.out.println("9. Regresar al menú principal");
        System.out.print(">>> ");
        String opcionString = sc.nextLine();
        int opcion = Integer.valueOf(opcionString);
        return opcion;  
    }

    //Menu que se usa para editar al dueño de una mascota
    public static int menuEditarDuenio(){
        System.out.println(">>>Menu de edicion para duenios<<<");
        System.out.println("Selecciona una opcion");
        System.out.println("1. Editar nombre");
        System.out.println("2. Actualizar apellidos");
        System.out.println("3. Actualizar direccion");
        System.out.println("4. Actualizar telefono");
        System.out.println("5. Actualizar ciudad");
        System.out.println("6. Actualizar email");
        System.out.println("7. Finalizar edicion");

        System.out.print(">>> ");
        String opcionString = sc.nextLine();
        int opcion = Integer.valueOf(opcionString);
        return opcion;
    }


 
    
}
