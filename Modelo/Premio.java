package Modelo;
import java.util.ArrayList; //Usar arrayLists para los premios?
public class Premio {
    private String descripcionPrimerLugar;
    private String descripcionSegundoLugar;
    private String descripcionTercerLugar;
    private boolean tieneAuspiciante; //OJOOOOOOOOOOOOOOOOO

    public Premio(String sP, String dS, String dT,boolean tA){
        this.descripcionPrimerLugar = sP;
        this.descripcionSegundoLugar = dS;
        this.descripcionTercerLugar = dT;
        this.tieneAuspiciante = tA;
    }  

    //ToString

    //Retorna un String con la info tal y como se muestra en el pdf

    //Verificar el uso de el boolean tieneAuspiciante
    public String toString(){
        return "Primer lugar: "+descripcionPrimerLugar+"\n"+"Segundo lugar: "+descripcionSegundoLugar+"\n"+"Tercer lugar: "+descripcionTercerLugar;
    }
    
}
