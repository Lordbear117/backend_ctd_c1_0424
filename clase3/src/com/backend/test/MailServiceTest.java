package com.backend.test;

import com.backend.model.Mail;
import com.backend.service.MailService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MailServiceTest {

    private final MailService mailService = new MailService();

    @Test
    void cuandoElDestinoNoSeaParaNingunDepartamento_oElAsuntoNoNombreUnDepartamento_deberiaProcesarseComoSpam(){
        //arrange
        Mail mail = new Mail("lkjfhg", "kjhxkjfg", "kjhrgkj");
        String respuestaEsperada = "SPAM";

        //act
        String respuestaObtenida = mailService.procesarMail(mail);

        //assert
        assertEquals(respuestaEsperada, respuestaObtenida);

    }


}