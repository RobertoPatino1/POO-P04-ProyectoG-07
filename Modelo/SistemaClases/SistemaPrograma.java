package Modelo.SistemaClases;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

import Modelo.*;
import Modelo.SistemaClases.*;
public class SistemaPrograma {
    public static void iniciarPrograma(){
        crearObjetos(); //Se crean todos los objetos con el metodo

        Scanner sc = new Scanner(System.in);
        int seleccion;
        int seleccion1;
        int seleccion2;
        int seleccion3;

        do{
            seleccion = SistemaMenu.menuPrincipal();
            switch (seleccion){
                case 1: //Administrar concursos
                    System.out.println("Se muestra una lista con todos los concursos existentes \n");
                    SistemaLista.visualizarListaConcursos(); //Se muestra la lista de concursos
                    seleccion1 = SistemaMenu.menuConcursos();
                    while(seleccion1!=1&&seleccion1!=2&&seleccion1!=3){
                        System.out.println("Opcion no valida, intente nuevamente");
                        seleccion1 = SistemaMenu.menuConcursos();
                    }
                    if (seleccion1 == 1){
                        //Creacion de un concurso
                        System.out.println("---Creacion de concurso---");
                        Concurso concurso = SistemaConcurso.crearConcurso();
                        //Se alacena al concurso en la lista de concursos
                        SistemaLista.registrarConcurso(concurso);
                        break;

                    }else if(seleccion1 == 2){
                        //Inscripcion de participante
                        System.out.println("---Inscripcion de participante---");
                        SistemaConcurso.inscribirParticipantes();
                        break;
                    }else if (seleccion1 == 3){
                        //Regresar al menu principal
                        System.out.println("---Regresar al menu principal---");
                        break;
                    }
                    break;


                case 2: //Administrar Duenios
                    //Se muestra por pantalla la lista de duenios
                    System.out.println("Se muestra una lista con todos los duenios existentes \n");
                    SistemaLista.visualizarListaDuenios();
                    seleccion2 = SistemaMenu.menuDuenios();
                    while(seleccion2!=4&&seleccion2!=5&&seleccion2!=6){
                        System.out.println("Opcion no valida, intente nuevamente");
                        seleccion2 = SistemaMenu.menuDuenios();
                    }
                    if (seleccion2 == 4){
                        System.out.println("---Crear duenio---");
                        DuenioMascota duenioCreado = SistemaDuenioMascota.crearDuenio(); //Se crea el duenio de la mascota

                        //Luego se agrega este duenio creado a la lista de duenios
                        SistemaLista.registrarDuenioMascota(duenioCreado);
                        break;
                    }else if(seleccion2 == 5){
                        //Editar duenio
                        System.out.println("---Editar duenio---");
                        SistemaDuenioMascota.editarDuenio();
                        break;

                    }else if(seleccion2 == 6){
                        //Regresar al menu
                        System.out.println("Regresar al menu principal");
                        break;
                    }
                    break;

                case 3:
                    //Se muestra la lista de mascotas existentes
                    System.out.println("Se muestra una lista con todas las mascotas existentes \n");
                    SistemaLista.visualizarListaMascotas();
                    seleccion3 = SistemaMenu.menuMascotas();
                    while(seleccion3!=7&&seleccion3!=8&&seleccion3!=9){
                        System.out.println("Opcion no valida, intente nuevamente");
                        seleccion3 = SistemaMenu.menuMascotas();
                    }
                    if (seleccion3 == 7){
                        //Crear mascota
                        System.out.println("---Crear mascota---");
                        Mascota mascotaCreada = SistemaMascota.crearMascota();
                        //Se agrega la mascota a la lista
                        SistemaLista.registrarMascotas(mascotaCreada);
                        break;
        
                    }else if(seleccion3 == 8){
                        //Eliminar mascota
                        System.out.println("---Eliminar mascota---");
                        SistemaMascota.eliminarMascota();
                        
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

        //creaccion de 3 ciudades
        
        Ciudad ciudad1 = new Ciudad("Guayaquil","Guayas");
        SistemaLista.registrarCiudad(ciudad1); //Se registran las ciudades en las listas
        Ciudad ciudad2 = new Ciudad("Quito","Pichincha");
        SistemaLista.registrarCiudad(ciudad2); //Se registran en la lista
        Ciudad ciudad3 = new Ciudad("Cuenca","Azuay");
        SistemaLista.registrarCiudad(ciudad3); //Se registran en la lista


        //creacion de 10 dueños 
       
        //Se crean y registran los 10 duenios
        DuenioMascota duenio1 = new DuenioMascota("Mario", "14 y Francisco segura", "3087207", ciudad1 , "mdas2508@gmail.com", "0951120526", "Alava");
        SistemaLista.registrarDuenioMascota(duenio1);
        DuenioMascota duenio2 = new DuenioMascota("Josue", "15 y Francisco segura", "3087208", ciudad1 , "correo0001@gmail.com", "0951120527", "Bajaña");
        SistemaLista.registrarDuenioMascota(duenio2);
        DuenioMascota duenio3 = new DuenioMascota("Roberto", "16 y Francisco segura", "3087209", ciudad1 , "correo0002@gmail.com", "0951120528", "Patiño");
        SistemaLista.registrarDuenioMascota(duenio3);
        DuenioMascota duenio4 = new DuenioMascota("Carlos", "17 y Francisco segura", "3087201", ciudad2 , "correo0003@gmail.com", "0951120529", "Naranjo");
        SistemaLista.registrarDuenioMascota(duenio4);
        DuenioMascota duenio5 = new DuenioMascota("Jose", "18 y Francisco segura", "3087202", ciudad2 , "correo0004@gmail.com", "0951120530", "Narvas");
        SistemaLista.registrarDuenioMascota(duenio5);
        DuenioMascota duenio6 = new DuenioMascota("Jorge", "19 y Francisco segura", "3087203", ciudad2 , "correo0005@gmail.com", "0951120531", "Camacho");
        SistemaLista.registrarDuenioMascota(duenio6);
        DuenioMascota duenio7 = new DuenioMascota("Juan", "20 y Francisco segura", "3087204", ciudad3 , "correo0006@gmail.com", "0951120532", "Sierra");
        SistemaLista.registrarDuenioMascota(duenio7);
        DuenioMascota duenio8 = new DuenioMascota("Ronny", "21 y Francisco segura", "3087205", ciudad3 , "correo0007@gmail.com", "0951120533", "Vargas");
        SistemaLista.registrarDuenioMascota(duenio8);
        DuenioMascota duenio9 = new DuenioMascota("Luis", "22 y Francisco segura", "3087206", ciudad3 , "correo0008@gmail.com", "0951120534", "Carriel");
        SistemaLista.registrarDuenioMascota(duenio9);
        DuenioMascota duenio10 = new DuenioMascota("Kennet", "23 y Francisco segura", "3087210", ciudad2 , "correo0009@gmail.com", "0951120535", "Lima");
        SistemaLista.registrarDuenioMascota(duenio10);

        //creacion de 10 mascotas 
        
        //Se crean y registran las 10 mascotas
        Mascota mascota1 = new Mascota("Pinky",TipoAnimal.PERRO,"Salchica",LocalDate.of(2005,8,24),"http1",duenio1,"2005");
        SistemaLista.registrarMascotas(mascota1);
        Mascota mascota2 = new Mascota("Balto",TipoAnimal.PERRO,"Huzky",LocalDate.of(1933,03,14),"http2",duenio2,"1933");
        SistemaLista.registrarMascotas(mascota2);
        Mascota mascota3 = new Mascota("Krypto",TipoAnimal.PERRO,"Samoyendo",LocalDate.of(1955,3,02),"http3",duenio3,"0210");
        SistemaLista.registrarMascotas(mascota3);
        Mascota mascota4 = new Mascota("Goofy",TipoAnimal.PERRO,"Aberdeen",LocalDate.of(1967,9,17),"http4",duenio4,"1967");
        SistemaLista.registrarMascotas(mascota4);
        Mascota mascota5 = new Mascota("Scooby",TipoAnimal.PERRO,"Danes",LocalDate.of(1969,5,13),"http5",duenio5,"1969");
        SistemaLista.registrarMascotas(mascota5);
        Mascota mascota6 = new Mascota("Garfiel",TipoAnimal.GATO,"Birmano",LocalDate.of(1966,6,19),"http6",duenio6,"1966");
        SistemaLista.registrarMascotas(mascota6);
        Mascota mascota7 = new Mascota("Silvestre",TipoAnimal.GATO,"Silvestris",LocalDate.of(1945,5,14),"http7",duenio7,"0103");
        SistemaLista.registrarMascotas(mascota7);
        Mascota mascota8 = new Mascota("Garry",TipoAnimal.GATO,"caracol",LocalDate.of(1955,10,23),"http8",duenio8,"1955");
        SistemaLista.registrarMascotas(mascota8);
        Mascota mascota9 = new Mascota("Doraemon",TipoAnimal.GATO,"Birmano",LocalDate.of(1969,12,1),"http9",duenio9,"1968");
        SistemaLista.registrarMascotas(mascota9);
        Mascota mascota10 = new Mascota("Chiquito",TipoAnimal.GATO,"Romano",LocalDate.of(2005,8,24),"http10",duenio10,"2000");
        SistemaLista.registrarMascotas(mascota10);

        //creacion de 3 auspiciantes
        //Se crean y registran los auspiciantes en la lista
       
        Auspiciante auspiciante1= new Auspiciante("Netlife", "Alfonoso Mendosa Av16", "3920000", ciudad1, "info@netlife.net.ec", "https://www.netlife.ec/");
        SistemaLista.registrarAuspiciante(auspiciante1);
        Auspiciante auspiciante2= new Auspiciante("Banco Pacifico", "Av 25 de Julio", "2085000", ciudad2, "mcarillo@seruvi.com", "webadminpac@pacifico.fin.ec.");
        SistemaLista.registrarAuspiciante(auspiciante2);
        Auspiciante auspiciante3= new Auspiciante("Coca cola", "Av Juan tanca Marengo", "42598910", ciudad3, "gener@cocacola.com", "https://www.coca-cola.com.co/");
        SistemaLista.registrarAuspiciante(auspiciante3);

        //Concurso vigente        
        Auspiciante auspiciantev = new Auspiciante("Raul.Salazar","Base.naval.sur.Av25","0991279217",ciudad1,"rausala@espol.edu.ec","http.a");
        Premio premio1 = new Premio("Comida para perro 1 año", "Comida para perro 1/2 año", "Comida para perro 1/4 año",true, auspiciantev);
        Concurso concursoVigente = new Concurso("Orejas Largas",LocalDate.of(2021,11,30),"13:24",LocalDate.of(2021,11,28),LocalDate.of(2021,12,10),ciudad1,"ParqueSamanes",premio1,auspiciantev,TipoAnimalesConcurso.PERROS);
        SistemaLista.registrarConcurso(concursoVigente);

        //Concurso pasado
        Concurso concursoPasado = new Concurso("Patitas felices", LocalDate.of(2020,11,28), "16:00", LocalDate.of(2020,10,28), LocalDate.of(2020,11,25), ciudad1, "Parque centenario", premio1, auspiciantev, TipoAnimalesConcurso.TODOS);
        //Se cierra el concurso y se lo finaliza

        
        //Se agregan los participantes al concurso pasado
        concursoPasado.inscribirParticipantes(mascota1);
        concursoPasado.inscribirParticipantes(mascota2);
        concursoPasado.inscribirParticipantes(mascota3);
        concursoPasado.inscribirParticipantes(mascota4);
        concursoPasado.inscribirParticipantes(mascota5);
        concursoPasado.cerrarInscripcionesConcurso();
        
        SistemaLista.registrarConcurso(concursoPasado);

        //Se escogen a las mascotas ganadores
        ArrayList<Mascota> ganadores = new ArrayList<>();
        ganadores.add(mascota1);
        ganadores.add(mascota2);
        ganadores.add(mascota3);
        //Se finaliza el concurso
        concursoPasado.finalizarConcurso();

        //Se indica que las mascotas 1,2,3,4 y 5 ya han participado
        //Estas mascotas al ser eliminadas, quedaran en el registro pero ya no estaran disponibles para participar
        mascota1.setParticipacion(true);
        mascota2.setParticipacion(true);
        mascota3.setParticipacion(true);
        mascota4.setParticipacion(true);
        mascota5.setParticipacion(true);

    }
    
}
