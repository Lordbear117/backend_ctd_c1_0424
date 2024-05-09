package com.backend.service.facade.impl;

import com.backend.model.Producto;
import com.backend.model.Tarjeta;
import com.backend.service.ApiCantidad;
import com.backend.service.ApiProducto;
import com.backend.service.ApiTarjeta;
import com.backend.service.facade.IDescuento;

public class FacadeDescuento implements IDescuento {
    @Override
    public int calcularDescuento(int cantidad, Producto producto, Tarjeta tarjeta) {
        int descuento = 0;
        descuento += ApiCantidad.calcularDescuentoPorCantidad(cantidad);
        descuento += ApiProducto.calcularDescuentoPorProducto(producto);
        descuento += ApiTarjeta.calcularDescuentoPorTarjeta(tarjeta);
        return descuento;
    }


}
