package Modelo;
import java.util.ArrayList; //Usar arrayLists para los premios?
public class Premio {
    private String descripcionPrimerLugar;
    private String descripcionSegundoLugar;
    private String descripcionTercerLugar;
    private boolean tieneAuspiciante; //OJOOOOOOOOOOOOOOOOO




    //ToString

    //Retorna un String con la info tal y como se muestra en el pdf

    //Verificar el uso de el boolean tieneAuspiciante
    public String toString(){
        return "Primer lugar: "+descripcionPrimerLugar+"\n"+"Segundo lugar: "+descripcionSegundoLugar+"\n"+"Tercer lugar: "+descripcionTercerLugar;
    }
    
}
