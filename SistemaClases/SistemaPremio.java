
package sistemaClases;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;
import sistemaClases.*;
public class SistemaPremio {
    static Scanner sc = new Scanner(System.in);
    public static Premio crearPremios(){
        boolean tieneAuspiciante = false;
        System.out.println("Ingrese la descripcion del premio para el primer lugar: ");
        System.out.print(">>> ");
        String descripcion1 = sc.nextLine();
        System.out.println("Ingrese la descripcion del premio para el segundo lugar: ");
        System.out.print(">>> ");
        String descripcion2 = sc.nextLine();
        System.out.println("Ingrese la descripcion del premio para el tercer lugar: ");
        System.out.print(">>> ");
        String descripcion3 = sc.nextLine();
        System.out.println("Sus premios tienen algun auspiciante? ");
        System.out.println("(Si/No) ");
        System.out.print(">>> ");
        String respuesta = sc.nextLine().toLowerCase();

        Auspiciante ausp = null;

        
        while(!respuesta.equals("si")&&!respuesta.equals("no")){
            System.out.println("No se detecto una respuesta, por favor intente nuevamente: ");
            System.out.println("Sus premios tienen algun auspiciante? ");
            System.out.println("(Si/No) ");
            System.out.print(">>> ");
            respuesta = sc.nextLine().toLowerCase();

        }
        //Pedirle un auspiciante
        if(respuesta.equals("si")){
            int i = 0;
            tieneAuspiciante = true;
            System.out.println("Seleccione el auspiciante para sus premios: ");
            for(Auspiciante auspFor: SistemaLista.listaAuspiciantes){
                System.out.println((i+=1)+". "+auspFor);
                
            }
            System.out.print(">>> ");
            int eleccion = sc.nextInt();
            sc.nextLine();
            while(eleccion-1>=SistemaLista.listaAuspiciantes.size()||eleccion-1<0){
                System.out.println("No se ha encontrado el auspiciante, por favor ingrese un numero valido");
                System.out.print(">>> ");
                eleccion = sc.nextInt();
                sc.nextLine();
            }
            ausp = SistemaLista.listaAuspiciantes.get(eleccion-1); //Se selecciona el auspiciante del indice escogido
        }

        //Se crea el objeto
        Premio premio = new Premio(descripcion1, descripcion2, descripcion3, tieneAuspiciante, ausp); //El constructor recibe el auspiciante creado
        System.out.println("El premio ha sido creado exitosamente");
        return premio;
    }
    
}
