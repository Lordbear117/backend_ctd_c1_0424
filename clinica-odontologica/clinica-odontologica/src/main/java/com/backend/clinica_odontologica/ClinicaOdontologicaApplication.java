package com.backend.clinica_odontologica;

import com.backend.clinica_odontologica.dbconnection.H2Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicaOdontologicaApplication {

	public static void main(String[] args) {

		H2Connection.ejecutarScriptInicial();

		SpringApplication.run(ClinicaOdontologicaApplication.class, args);
	}

}
