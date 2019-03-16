/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arbolgenealogico;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Alexander Martinez
 */
public class Persona {
    private int cedula;
    private String nombre;
    private  HashMap <Integer, Persona> mapaPersona;

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        mapaPersona = new HashMap();
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Integer, Persona> getMapaPersona() {
        return mapaPersona;
    }

    public void setMapaPersona(HashMap<Integer, Persona> mapaPersona) {
        this.mapaPersona = mapaPersona;
    }
    

   
    
   
     
    
}
