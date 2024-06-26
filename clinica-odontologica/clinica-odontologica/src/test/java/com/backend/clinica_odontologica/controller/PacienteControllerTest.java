package com.backend.clinica_odontologica.controller;

import com.backend.clinica_odontologica.dto.entrada.DomicilioEntradaDto;
import com.backend.clinica_odontologica.dto.entrada.PacienteEntradaDto;
import com.backend.clinica_odontologica.dto.salida.DomicilioSalidaDto;
import com.backend.clinica_odontologica.dto.salida.PacienteSalidaDto;
import com.backend.clinica_odontologica.utils.JsonPrinter;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PacienteControllerTest {

    @Autowired
    private PacienteController pacienteController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @Order(1)
    void deberiaRegistrarUnPacienteMedianteApi() throws Exception {

        //arrange
        PacienteEntradaDto pacienteEntradaDto = new PacienteEntradaDto("Nombre", "Apellido", 2222222, LocalDate.of(2024, 06, 26), new DomicilioEntradaDto("Calle", 123, "Localidad", "COR"));
        PacienteSalidaDto pacienteSalidaDto = new PacienteSalidaDto(1L, "Nombre", "Apellido", 2222222, LocalDate.of(2024, 06, 26), new DomicilioSalidaDto(1L, "Calle", 123, "Localidad", "COR"));

        //Se convierten los objetos PacienteEntradaDto y PacienteSalidaDto en cadenas JSON utilizando el JsonPrinter configurado anteriormente.
        String requestPayload = JsonPrinter.toString(pacienteEntradaDto);
        String expectedResponseBody = JsonPrinter.toString(pacienteSalidaDto);

        //act
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders
                        .post("/pacientes/registrar")
                        .content(requestPayload)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().is(201))
                .andExpect(content().contentType("application/json"))
                .andReturn();
       //Se realiza una serie de expectativas (expectations) sobre la respuesta de la solicitud HTTP, incluyendo el estado esperado (201), el tipo de contenido esperado ("application/json"), y se imprime el resultado.
        //assert
        Assertions.assertEquals(expectedResponseBody, result.getResponse().getContentAsString());

    }

    @Test
    @Order(2)
    void deberiaEncontrarYDevolverPacienteConId1MedianteApi() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                .get("/pacientes/{id}", 1))
                .andDo(print())
                .andExpect(status().is(200))
                .andExpect(content().contentType("application/json"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.dni").value(2222222))
                .andExpect(MockMvcResultMatchers.jsonPath("$.nombre").value("Nombre"));

    }


}