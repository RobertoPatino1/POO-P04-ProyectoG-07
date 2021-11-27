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
    public ArrayList<Persona> reguistrarDuenioMascota(DuenioMascota dm) {
        ArrayList<Persona> duenios = new ArrayList<>();
        duenios.add(dm);
        return duenios;
    }
    public ArrayList<Ciudad> reguistrarCiudad(Ciudad c) {
        ArrayList<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(c);
        return ciudades;
    }
    public ArrayList<Persona> reguistrarAuspiciante(Auspiciante a) {
        ArrayList<Persona> auspiciantes = new ArrayList<>();
        auspiciantes.add(a);
        return auspiciantes;
    }

    //Metodos de Visualizacion 
    public void VerListaMascotas(ArrayList<Mascota> mascotas){
        for(Mascota m:mascotas){
            m.toString();
        }
    }
    public void VerListaDuenioMascota(ArrayList<Persona> duenios){
        for(Persona dm:duenios){
            dm.getNombre();
        }
    }
    public void VerCiudades(ArrayList<Ciudad> ciudades){
        for(Ciudad c:ciudades){
            c.getNombre();
        }
    }
    public void VerAuspiciantes(ArrayList<Persona> auspiciantes){
        for(Persona a:auspiciantes){
            a.getNombre();
        } 
    }
    //los metodos que poseen getNombre no poseen un toString establecido
}
