package com.backend.service;

import com.backend.model.Computadora;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {

    private static Map<String, Computadora> computadorasLigeras = new HashMap<>();

    public static Computadora obtenerComputadora(int ram, int disco){

        //definir la key
        String key = ram + ":" + disco;
        System.out.println(key);

        //verificar si esa key ya existe en nuestra coleccion
        if(!computadorasLigeras.containsKey(key)){
            //crear la compu
            Computadora computadora = new Computadora(ram, disco);
            computadorasLigeras.put(key, computadora);
            System.out.println("Computadora creada");
        } else {
            System.out.println("Computadora encontrada");
        }

        return computadorasLigeras.get(key);

    }

    public static Map<String, Computadora> getComputadorasLigeras() {
        return computadorasLigeras;
    }


}
