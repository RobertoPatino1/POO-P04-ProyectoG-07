package Modelo;
import java.util.ArrayList;
//import Modelo.SistemaGeneral;

public class SistemaLista {
    private ArrayList<SistemaLista> lista;
    
    //Métodos de Registro 
    public ArrayList<Mascota> reguistrarMascotas(Mascota m) {
        ArrayList<Mascota> mascotas = new ArrayList<>(); 
        mascotas.add(m);
        return mascotas;
    } 
    public ArrayList<DuenioMascota> reguistrarDuenioMascota(DuenioMascota dm) {
        ArrayList<DuenioMascota> duenios = new ArrayList<>();
        duenios.add(dm);
        return duenios;
    }
    public ArrayList<Ciudad> reguistrarCiudad(Ciudad c) {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(c);
        return ciudades;
    }
    public ArrayList<Auspiciante> reguistrarAuspiciante(Auspiciante a) {
        ArrayList<Auspiciante> auspiciantes = new ArrayList<>();
        auspiciantes.add(a);
        return auspiciantes;
    }

    //Metodos de Visualizacion 
    public void VerListaMascotas(ArrayList<Mascota> mascotas){
        for(Mascota m:mascotas){
            m.toString();
        }
    }
    public void VerListaDuenioMascota(ArrayList<DuenioMascota> duenios){
        //------------------------------
        /*
        for(DuenioMascota dm:duenios){
            dm.toString();
        }
        */
        //------------------------------
        //no tiene un toString
        //no tiene gets
    }
    public void VerCiudades(ArrayList<Ciudad> ciudades){
        //------------------------------
        /*
        for(Ciudad c:ciudades){
            c.toString();
            c.getNombre();
        }
        */
        //------------------------------
        //no tiene un toString
        //no tiene gets
    }
    public void VerAuspiciantes(ArrayList<Auspiciante> auspiciantes){
        //------------------------------
        /*
        for(Auspiacinte a:auspiciantes){
            a.toString();
            a.getNombre();
        }
        */
        //------------------------------
        //no tiene un toString
        //no tiene gets     
    }

}
