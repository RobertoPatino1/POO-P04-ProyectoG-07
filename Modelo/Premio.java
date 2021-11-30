package Modelo;
import java.util.ArrayList;

public class Premio {
    private String descripcionPrimerLugar;
    private String descripcionSegundoLugar;
    private String descripcionTercerLugar;
    private boolean tieneAuspiciante;
    private Auspiciante auspiciante;

    //Controctores 
    //Caso 1: sin auspiciante 
    public Premio(String sP, String dS, String dT,boolean tA){
        this.descripcionPrimerLugar = sP;
        this.descripcionSegundoLugar = dS;
        this.descripcionTercerLugar = dT;
        this.tieneAuspiciante = tA;
    }  
    //Caso2: Con auspiciante (Constructor que inicializa todos los atributos)
    public Premio(String sP, String dS, String dT,boolean tA, Auspiciante auspiciante){
        this.descripcionPrimerLugar = sP;
        this.descripcionSegundoLugar = dS;
        this.descripcionTercerLugar = dT;
        this.tieneAuspiciante = tA; 
        this.auspiciante = auspiciante; 
    }

    //Setter de auspiciante
    public void setAuspiciante(Auspiciante au){
        this.auspiciante = au;
    }

    //ToString
    //Retorna un String con la info tal y como se muestra en el pdf
    public String toString(){
        return "Primer lugar: "+descripcionPrimerLugar+"|"+"Segundo lugar: "+descripcionSegundoLugar+"|"+"Tercer lugar: "+descripcionTercerLugar;
    }
    
}
