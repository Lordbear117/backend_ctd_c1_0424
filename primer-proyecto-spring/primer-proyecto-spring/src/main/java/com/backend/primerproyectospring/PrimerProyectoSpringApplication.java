package com.backend.primerproyectospring;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PrimerProyectoSpringApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(PrimerProyectoSpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoSpringApplication.class, args);
		LOGGER.info("PrimerProyecto is now running...");
	}

	@GetMapping("/hola")
	public String saludar(){
		return "Hola Camada 1";
	}

}
