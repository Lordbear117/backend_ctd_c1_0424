package com.backend.service;

import com.backend.model.Mail;
import com.backend.service.handlers.*;

public class MailService {

    private ManejadorMail primerManejador;

    public MailService() {
        //primer eslabon
        primerManejador = new ManejadorGerencial();

        //segundo eslabon
        ManejadorMail segundoManejador = new ManejadorComercial();
        primerManejador.setSiguienteManejador(segundoManejador);

        //tercer eslabon
        ManejadorMail tercerManejador = new ManejadorTecnico();
        segundoManejador.setSiguienteManejador(tercerManejador);

        //cuarto eslabon
        ManejadorMail cuartoManejador = new ManejadorSpam();
        tercerManejador.setSiguienteManejador(cuartoManejador);
    }


    public String procesarMail(Mail mail){
        return primerManejador.procesarMail(mail);
    }
}
