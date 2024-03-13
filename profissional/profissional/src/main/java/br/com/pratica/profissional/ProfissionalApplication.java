package br.com.pratica.profissional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.pratica.profissional")
public class ProfissionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfissionalApplication.class, args);

	}

}
