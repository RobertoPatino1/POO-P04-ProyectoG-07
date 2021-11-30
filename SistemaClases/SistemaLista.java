package sistemaClases;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;

public class SistemaLista {
    protected static ArrayList<Concurso> listaConcursos = new ArrayList<>(); //Puede contener concursos abiertos o cerrados
    protected static ArrayList<DuenioMascota> listaDuenios = new ArrayList<>();
    protected static ArrayList<Mascota> listaMascotas = new ArrayList<>();;
    protected static ArrayList<Ciudad> listaCiudades = new ArrayList<>();;
    protected static ArrayList<Auspiciante> listaAuspiciantes = new ArrayList<>();;
    protected static ArrayList<Premio> listaPremios = new ArrayList<>();;
    protected static ArrayList<Concurso> listaConcursosAbiertos = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    //Crear ciudades en caso de que el usuario decida editar sus datos
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


    //Metodos para la seleccion de cosas

    //Seleccionar una ciudad

    public static Ciudad seleccionarCiudad(){
        int i = 0;
        System.out.println("Seleccione una de las ciudades: ");
        for(Ciudad ciu: listaCiudades){
            System.out.println((i+=1)+". "+ciu.getNombre());
        }
        System.out.print(">>> ");
        int indice = sc.nextInt()-1;
        sc.nextLine();
        while(indice<0||indice>=listaCiudades.size()){
            System.out.println("No se ha encontrado la ciudad seleccionada, intente nuevamente: ");
            System.out.println("Seleccione una de las ciudades: ");
            System.out.print(">>> ");
            indice = sc.nextInt()-1;
            sc.nextLine();
        }
        //Se obtiene la ciudad en ese indice
        System.out.println("Se ha seleccionado la ciudad exitosamente");
        return listaCiudades.get(indice);
    }

    //Seleccionar un auspiciante
    public static Auspiciante seleccionarAuspiciante(){
        int i = 0;
        System.out.println("Seleccione uno de los auspiciantes disponibles");
        for(Auspiciante aus:listaAuspiciantes){
            System.out.println((i+=1)+". "+aus.getNombre());
        }
        System.out.print(">>> ");
        int indice = sc.nextInt()-1;
        sc.nextLine();
        while(indice<0||indice>=listaAuspiciantes.size()){
            System.out.println("No se ha encontrado el auspiciante seleccionado, intente nuevamente: ");
            System.out.println("Seleccione uno de los auspiciantes: ");
            System.out.print(">>> ");
            indice = sc.nextInt()-1;
            sc.nextLine();
        }
        System.out.println("Se ha seleccionado al auspiciante de manera exitosa");
        return listaAuspiciantes.get(indice);
    }

    public static DuenioMascota seleccionarDuenio(){
        int i = 0;
        System.out.println("Seleccione el dueño de la mascota a crear");
        for(DuenioMascota due:listaDuenios){
            System.out.println((i+=1)+". "+due.getNombre()+" "+due.getApellidos());
        }
        System.out.print(">>> ");
        int indice = sc.nextInt()-1;
        sc.nextLine();
        while(indice<0||indice>=listaDuenios.size()){
            System.out.println("No se ha encontrado al dueño seleccionado, intente nuevamente: ");
            System.out.println("Seleccione el dueño de la mascota a crear: ");
            System.out.print(">>> ");
            indice = sc.nextInt()-1;
            sc.nextLine();
        }
        System.out.println("Se ha seleccionado al dueño de manera exitosa");
        return listaDuenios.get(indice);

    }


    //Metodo para crear una fecha
    public static LocalDate crearFecha(){
        System.out.println("Ingrese el dia para la creacion de su fecha: ");
        System.out.print(">>> ");
        int dia = sc.nextInt();
        sc.nextLine();
        
        //Pidiendo el mes
        System.out.println("Ingrese el numero del mes para la creacion de su fecha: ");
        System.out.print(">>> ");
        int mes = sc.nextInt();
        sc.nextLine();
        
        //Pidiendo el anio
        System.out.println("Ingrese el anio para la creacion de su fecha: ");
        System.out.print(">>> ");
        int anio = sc.nextInt();

        //Se construye la fecha
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        return fecha;
    }

  
    
}
