package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionado:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign(para consumir Api's externas)
 *
 * @author Maicon
 * **/

@EnableFeignClients // habilita OpenFeign
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
