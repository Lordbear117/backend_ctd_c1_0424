package com.backend;

import com.backend.model.Computadora;
import com.backend.service.ComputadoraFactory;

public class Main {
    public static void main(String[] args) {

        Computadora win1 = ComputadoraFactory.obtenerComputadora(2, 180);
        Computadora win2 = ComputadoraFactory.obtenerComputadora(2, 180);
        Computadora win3 = ComputadoraFactory.obtenerComputadora(2, 180);
        Computadora win4 = ComputadoraFactory.obtenerComputadora(2, 180);
        Computadora mac1 = ComputadoraFactory.obtenerComputadora(16, 500);
        Computadora mac2 = ComputadoraFactory.obtenerComputadora(16, 500);
        Computadora linux = ComputadoraFactory.obtenerComputadora(8, 500);
        System.out.println("---------------------------------------------------");
        System.out.println(win1);
        System.out.println(win2);
        System.out.println(win3);
        System.out.println(win4);
        System.out.println(mac1);
        System.out.println(mac2);
        System.out.println(ComputadoraFactory.getComputadorasLigeras());

    }
}
