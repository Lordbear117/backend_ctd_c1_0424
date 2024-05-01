package com.backend.test;

import com.backend.model.Empleado;
import com.backend.model.EmpleadoContratado;
import com.backend.model.EmpleadoEfectivo;
import com.backend.service.LiquidadorEfectivo;
import com.backend.service.LiquidadorSueldo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorSueldoTest {

    private LiquidadorSueldo liquidadorSueldo;

    @Test
    public void deberiaLiquidarSueldoDeEmpleadoEfectivo(){
        //arrange
        liquidadorSueldo = new LiquidadorEfectivo();
        Empleado empleado = new EmpleadoEfectivo("Martin", "Martini", "CA-65176878777", 400000, 10000, 1000);

        String respuestaEsperada = "La liquidacion es un archivo digital. Sueldo a liquidar: $409000.0";
        //act
        String respuestaObtenida = liquidadorSueldo.liquidarSueldo(empleado);

        //assert
        assertEquals(respuestaEsperada, respuestaObtenida);

    }

    @Test
    public void cuandoSeRecibeUnEmpleadoContratado_unLiquidadorEfectivoNoDeberiaLiquidar(){
        //arrange
        liquidadorSueldo = new LiquidadorEfectivo();
        Empleado empleado = new EmpleadoContratado("Martin", "Martini", "CA-65176878777", 120, 2000);

        String respuestaEsperada = "La liquidacion no pudo ser calculada";
        String respuestaObtenida = liquidadorSueldo.liquidarSueldo(empleado);

        assertEquals(respuestaEsperada, respuestaObtenida);
    }

}