package com.example.android.personasdiplomado;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by android on 30/09/2017.
 */

public class Datos {

    public static ArrayList<Personas> personas = new ArrayList<>();


    public static void guardarPersona(Personas p){
        personas.add(p);
    }
    public static ArrayList<Personas> obtenerPersonas(){
        return personas;
    }
}
