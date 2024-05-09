package com.backend.service;

import com.backend.model.Tarjeta;

public class ApiTarjeta {
    public static int calcularDescuentoPorTarjeta(Tarjeta tarjeta){
        return tarjeta.getBanco().equalsIgnoreCase("Star Bank") ? 20 : 0;
    }
}
