package com.backend.test;

import com.backend.model.Producto;
import com.backend.model.Tarjeta;
import com.backend.service.facade.impl.FacadeDescuento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeDescuentoTest {

    private FacadeDescuento facadeDescuento = new FacadeDescuento();

    @Test
    void alRecibirLatasYMasDe12_deberiaCalcular25DeDescuento(){
        Tarjeta tarjeta = new Tarjeta("Link Bank", "8798547698798");
        Producto producto = new Producto("Arvejas", "latas");
        int descuentoObtenido = facadeDescuento.calcularDescuento(14, producto, tarjeta);
        assertEquals(25, descuentoObtenido);
    }

    @Test
    void alRecibirMenosDe12UnidadesDeProductoNoLataYTarjetaNoStar_deberiaCalcular0DeDescuento(){
        Tarjeta tarjeta = new Tarjeta("Link Bank", "8798547698798");
        Producto producto = new Producto("Galletitas Oreo", "galletitas");
        int descuentoObtenido = facadeDescuento.calcularDescuento(1, producto, tarjeta);
        assertEquals(0, descuentoObtenido);
    }


}