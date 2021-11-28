import java.util.Scanner;

import Modelo.Auspiciante;
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
        //Main.crearObjetos(); // IMPORTANTES COMPROBAR SI ESTO ESTA BIEN 

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

        //Concurso pasado

        //concurso vigente
        System.out.println("---Creacion de Concurso vigente---");
        Ciudad ciudadv = new Ciudad("Guayaquil","Guayas");
        Auspiciante auspiciantev = new Auspiciante("Raul.Salazar","Base.naval.sur.Av25","0991279217",ciudadv,"rausala@espol.edu.ec","http.a");
        Concurso concursoVigente = new Concurso("OrejasLargas","30/11/2021","13:24","28/11/2021","10/12/2021",ciudadv,"Guiayaquil","ParqueSamanes","Croquetas",auspiciantev,TipoAnimal.PERRO,TipoAnimalesConcurso.PERROS);
        SistemaLista.registrarConcurso(concursoVigente);

        //creacion de 10 mascotas 
        System.out.println("---Ingreso de Mascotas---");
        Mascota mascota1 = new Mascota("Pinky",TipoAnimal.PERRO,"Salchica","24/08/2005","http1",DuenioMascota dm,"2005");
        SistemaLista.registrarMascotas(mascota1);
        Mascota mascota2 = new Mascota("Balto",TipoAnimal.PERRO,"Huzky","14/03/1933","http2",DuenioMascota dm,"1933");
        SistemaLista.registrarMascotas(mascota2);
        Mascota mascota3 = new Mascota("Krypto",TipoAnimal.PERRO,"Samoyendo","02/03/1955","http3",DuenioMascota dm,"0210");
        SistemaLista.registrarMascotas(mascota3);
        Mascota mascota4 = new Mascota("Goofy",TipoAnimal.PERRO,"Aberdeen","17/09/1967","http4",DuenioMascota dm,"1967");
        SistemaLista.registrarMascotas(mascota4);
        Mascota mascota5 = new Mascota("Scooby",TipoAnimal.PERRO,"Danes","13/05/1969","http5",DuenioMascota dm,"1969");
        SistemaLista.registrarMascotas(mascota5);
        Mascota mascota6 = new Mascota("Garfiel",TipoAnimal.GATO,"Birmano","19/06/1966","http6",DuenioMascota dm,"1966");
        SistemaLista.registrarMascotas(mascota6);
        Mascota mascota7 = new Mascota("Silvestre",TipoAnimal.GATO,"Silvestris","14/05/1945","http7",DuenioMascota dm,"0103");
        SistemaLista.registrarMascotas(mascota7);
        Mascota mascota8 = new Mascota("Garry",TipoAnimal.GATO,"caracol","23/10/1955","http8",DuenioMascota dm,"1955");
        SistemaLista.registrarMascotas(mascota8);
        Mascota mascota9 = new Mascota("Doraemon",TipoAnimal.GATO,"Birmano","01/12/1969","http9",DuenioMascota dm,"1969");
        SistemaLista.registrarMascotas(mascota9);
        Mascota mascota10 = new Mascota("Chiquito",TipoAnimal.GATO,"Romano","24/08/2005","http10",DuenioMascota dm,"2000");
        SistemaLista.registrarMascotas(mascota10);

        //creacion de 10 dueños 
        System.out.println("---Ingreso de Dueños---");
        SistemaLista.registrarDuenioMascota();

        //creaccion de 3 ciudades
        System.out.println("---Ingreso de ciudades---");
        Ciudad ciudad1 = new Ciudad("Guayaquil","Guayas");
        SistemaLista.registrarCiudad(ciudad1);  
        Ciudad ciudad2 = new Ciudad("Quito","Pichincha");
        SistemaLista.registrarCiudad(ciudad2); 
        Ciudad ciudad3 = new Ciudad("Cuenca","Azuay");
        SistemaLista.registrarCiudad(ciudad3); 

        //creacion de 3 auspiciantes
        System.out.println("---Ingreso de Auspiciantes---");
        SistemaLista.registrarAuspiciante();
        }
        
    }
    
}