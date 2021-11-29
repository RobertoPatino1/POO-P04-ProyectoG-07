import java.util.Scanner;

import Modelo.Auspiciante;
import Modelo.Ciudad;
import Modelo.Concurso;
import Modelo.DuenioMascota;
import Modelo.Mascota;
import Modelo.Premio;
import Modelo.SistemaLista;
import Modelo.TipoAnimal;
import Modelo.TipoAnimalesConcurso;
import Modelo.SistemaMenu;
public class Main {
    public static void main(String[] args) {
    
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
                    System.out.println("Se muestra una lista con todos los concursos existentes");
                    SistemaLista.visualizarListaConcursos(); //Se muestra la lista de concursos
                    seleccion1 = SistemaMenu.menuConcursos();
                    if (seleccion1 == 1){
                        //Creacion de un concurso
                        System.out.println("---Creacion de concurso---");
                        SistemaLista.crearConcurso();
                        break;

                    }else if(seleccion1 == 2){
                        //Inscripcion de participante
                        System.out.println("---Inscripcion de participante---");
                        SistemaLista.inscribirParticipantes();
                        break;
                    }else if (seleccion1 == 3){
                        //Regresar al menu principal
                        System.out.println("---Regresar al menu principal---");
                        break;
                    }
                    break;


                case 2: //Administrar Duenios
                    //Se muestra por pantalla la lista de duenios
                    System.out.println("Se muestra una lista con todos los duenios existentes");
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
                    System.out.println("Se muestra una lista con todas las mascotas existentes");
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

        //concurso vigente
       
        Ciudad ciudadv = new Ciudad("Guayaquil","Guayas");
        Auspiciante auspiciantev = new Auspiciante("Raul.Salazar","Base.naval.sur.Av25","0991279217",ciudadv,"rausala@espol.edu.ec","http.a");
        Premio premio1 = new Premio("Comida para perro 1 año", "Comida para perro 1/2 año", "Comida para perro 1/4 año",true, auspiciantev);
        Concurso concursoVigente = new Concurso("Orejas Largas","30/11/2021","13:24","28/11/2021","10/12/2021",ciudadv,"ParqueSamanes",premio1,auspiciantev,TipoAnimalesConcurso.PERROS);
        SistemaLista.registrarConcurso(concursoVigente);

        //Concurso pasado
        Concurso concursoPasado = new Concurso("Patitas felices", "28/11/2020", "16:00", "28/10/2020", "25/11/2020", ciudadv, "Parque centenario", premio1, auspiciantev, TipoAnimalesConcurso.TODOS);
        //Se cierra el concurso y se lo finaliza
        concursoPasado.cerrarInscripcionesConcurso();
        concursoPasado.finalizarConcurso();
        SistemaLista.registrarConcurso(concursoPasado);
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
        Mascota mascota1 = new Mascota("Pinky",TipoAnimal.PERRO,"Salchica","24/08/2005","http1",duenio1,"2005");
        SistemaLista.registrarMascotas(mascota1);
        Mascota mascota2 = new Mascota("Balto",TipoAnimal.PERRO,"Huzky","14/03/1933","http2",duenio2,"1933");
        SistemaLista.registrarMascotas(mascota2);
        Mascota mascota3 = new Mascota("Krypto",TipoAnimal.PERRO,"Samoyendo","02/03/1955","http3",duenio3,"0210");
        SistemaLista.registrarMascotas(mascota3);
        Mascota mascota4 = new Mascota("Goofy",TipoAnimal.PERRO,"Aberdeen","17/09/1967","http4",duenio4,"1967");
        SistemaLista.registrarMascotas(mascota4);
        Mascota mascota5 = new Mascota("Scooby",TipoAnimal.PERRO,"Danes","13/05/1969","http5",duenio5,"1969");
        SistemaLista.registrarMascotas(mascota5);
        Mascota mascota6 = new Mascota("Garfiel",TipoAnimal.GATO,"Birmano","19/06/1966","http6",duenio6,"1966");
        SistemaLista.registrarMascotas(mascota6);
        Mascota mascota7 = new Mascota("Silvestre",TipoAnimal.GATO,"Silvestris","14/05/1945","http7",duenio7,"0103");
        SistemaLista.registrarMascotas(mascota7);
        Mascota mascota8 = new Mascota("Garry",TipoAnimal.GATO,"caracol","23/10/1955","http8",duenio8,"1955");
        SistemaLista.registrarMascotas(mascota8);
        Mascota mascota9 = new Mascota("Doraemon",TipoAnimal.GATO,"Birmano","01/12/1969","http9",duenio9,"1969");
        SistemaLista.registrarMascotas(mascota9);
        Mascota mascota10 = new Mascota("Chiquito",TipoAnimal.GATO,"Romano","24/08/2005","http10",duenio10,"2000");
        SistemaLista.registrarMascotas(mascota10);

        //creacion de 3 auspiciantes
        //Se crean y registran los auspiciantes en la lista
       
        Auspiciante auspiciante1= new Auspiciante("Auspiciante 1", "direccion 1", "telefono1", ciudad1, "email1@", "webPage1.com");
        SistemaLista.registrarAuspiciante(auspiciante1);
        Auspiciante auspiciante2= new Auspiciante("Auspiciante 2", "direccion 2", "telefono1", ciudad2, "email2@", "webPage2.com");
        SistemaLista.registrarAuspiciante(auspiciante2);
        Auspiciante auspiciante3= new Auspiciante("Auspiciante 3", "direccion 3", "telefono1", ciudad3, "email3@", "webPage3.com");
        SistemaLista.registrarAuspiciante(auspiciante3);
        }
        
    }
    
