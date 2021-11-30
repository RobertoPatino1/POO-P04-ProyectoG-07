package sistemaClases;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;
import sistemaClases.*;
public class SistemaConcurso {
    static Scanner sc = new Scanner(System.in);
    //Para concurso

    //Metodo de creacion
    public static Concurso crearConcurso(){
        System.out.println("Ingrese el nombre del concurso a crear: ");
        System.out.print(">>> ");
        String nombre = sc.nextLine();
        System.out.println("--Datos para la fecha del concurso--");
        LocalDate fechaConcurso = SistemaLista.crearFecha();
        System.out.println("Ingrese la hora del concurso: ");
        System.out.print(">>> ");
        String hora = sc.nextLine();

        System.out.println("--Datos para la fecha de inicio de las inscripciones--");
        LocalDate fechaInicioInscripciones = SistemaLista.crearFecha();
        System.out.println("--Datos para la fecha de cierre para las inscripciones--");
        LocalDate fechaCierreInscripciones = SistemaLista.crearFecha();
        
        
        Ciudad ciudad = SistemaLista.seleccionarCiudad();
        
        System.out.println("Ingrese el lugar donde se llevará a cabo el concurso: ");
        System.out.print(">>> ");
        String lugar = sc.nextLine();

        //Se escoge al auspiciante
        Auspiciante auspiciante = SistemaLista.seleccionarAuspiciante();

        //Se piden datos para el premio
        Premio premio = SistemaPremio.crearPremios();
        //Se lo registra en la lista
        SistemaLista.listaPremios.add(premio);
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
            while(seleccion!=1&&seleccion!=2&&seleccion!=3){
            System.out.println("Respuesta no valida, seleccione nuevamente: ");
            System.out.println("Para quien esta dirigido el concurso: ");
            System.out.println("1. Perros \n"+"2. Gatos \n"+"3. Todos");
            System.out.print(">>> ");
            seleccion = sc.nextInt();
            sc.nextLine();
            }
        }

        //Se crea el concurso: 
        System.out.println("Se ha creado el concurso exitosamente");
        Concurso concurso = new Concurso(nombre, fechaConcurso, hora, fechaInicioInscripciones, fechaCierreInscripciones, ciudad, lugar, premio, auspiciante, tipoAnimalesConcurso);
        return concurso;
    }

            
    public static void inscribirParticipantes(){
        int i = 0;
        System.out.println("Se muestra el listado de concursos abiertos: ");
        
        for(Concurso concurso: SistemaLista.listaConcursos){
            if (concurso.getEstaAbierto()){
                SistemaLista.listaConcursosAbiertos.add(concurso); //Se agrega al concurso a la lista de concursos abiertos
                System.out.println((i+=1)+". "+concurso);
            }
        }

        //Se solicita ingresar el codigo del concurso y el id de la mascota
        //Para esto se debe verificar que la mascota este en la lista de mascotas
        System.out.println("Ingrese el numero del concurso en el que se va a registrar al participante: ");


        System.out.print(">>> ");
        
        int indice = sc.nextInt()-1;
        sc.nextLine();
        while(indice<0||indice>=SistemaLista.listaConcursosAbiertos.size()){
            System.out.println("Concurso no encontrado, por favor ingrese un valor valido");
            System.out.println("Ingrese el numero del concurso en el que se va a registrar al participante: ");


            System.out.print(">>> ");
            indice = sc.nextInt()-1;
            sc.nextLine();
        }

        //Se busca en la lista el concurso
        Concurso concurso = SistemaLista.listaConcursosAbiertos.get(indice);
        System.out.println("El concurso: "+concurso.getNombre()+" fue encontrado exitosamente");

        //Inscripcion de la mascota
        System.out.println("Ingrese el id de la mascota a inscribir");
        System.out.print(">>> ");
        String idIngresado = sc.nextLine();
        Mascota mascotaBusqueda = new Mascota(idIngresado);

        if(SistemaLista.listaMascotas.contains(mascotaBusqueda)){
            //Se registra a la mascota en el concurso especificado
            int indice2 = SistemaLista.listaMascotas.indexOf(mascotaBusqueda);
            Mascota mascotaRegistro = SistemaLista.listaMascotas.get(indice2);
            if(mascotaRegistro.getDisponibilidad()==false){
                System.out.println("La mascota seleccionada no se encuentra disponible para inscripciones");
            }else{
                mascotaRegistro.setParticipacion(true); //Se indica que la mascota esta participando
                concurso.inscribirParticipantes(mascotaRegistro); 
                System.out.println("La mascota fue encontrada y registrada exitosamente");

            }

        }else{
            System.out.println("La mascota no fue encontrada, ejecute el programa nuevamente");
        }
   
    }           
}
