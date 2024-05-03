package com.backend.test;

import com.backend.model.Persona;
import com.backend.service.impl.VacunatorioProxy;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VacunatorioProxyTest {

    private VacunatorioProxy vacunatorioProxy = new VacunatorioProxy();

    @Test
    void siLaPersonaConcurreAntesDeFechaAsignada_noDeberiaSerVacunada(){

        //arrange
        Persona persona = new Persona("Robert Gimenez", "46865856", "AntiGripal", LocalDate.of(2024, 5, 3));
        String respuestaEsperada = "La fecha no se corresponde con la fecha asignada";

        //act
        String respuestaObtenida = vacunatorioProxy.vacunar(persona);

        //assert
        assertEquals(respuestaEsperada, respuestaObtenida);

    }

    @Test
    void siLaPersonaConcurreEnFechaAsignada_deberiaSerVacunada(){

        //arrange
        Persona persona = new Persona("Robert Gimenez", "46865856", "AntiGripal", LocalDate.of(2024, 5, 2));
        String respuestaEsperada = "Se ha registrado a la persona con DNI 46865856, fue vacunada con AntiGripal";

        //act
        String respuestaObtenida = vacunatorioProxy.vacunar(persona);

        //assert
        assertEquals(respuestaEsperada, respuestaObtenida);

    }

}