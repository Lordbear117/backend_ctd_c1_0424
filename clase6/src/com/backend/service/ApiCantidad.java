package com.backend.service;

public class ApiCantidad {

    public static int calcularDescuentoPorCantidad(int cantidad) {

        return cantidad > 12 ? 15 : 0;

    }
}
