package com.backend.service.facade;

import com.backend.model.Producto;
import com.backend.model.Tarjeta;

public interface IDescuento {

    int calcularDescuento(int cantidad, Producto producto, Tarjeta tarjeta);
}
