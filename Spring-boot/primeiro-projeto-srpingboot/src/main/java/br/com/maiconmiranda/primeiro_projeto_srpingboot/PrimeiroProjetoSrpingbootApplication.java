package br.com.maiconmiranda.primeiro_projeto_srpingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "br.com.maiconmiranda") // Tudo que seja baseado em um componente será escaneado - obs:
														// usado quando a estrutura padrão de organizacao for alterada,
														// neste caso o diretorio "controller" está sendo colocado na
														// raiz
														// "maiconmiranda" o normal seria dentro de
														// "primeiro_projeto_srpingboot"
public class PrimeiroProjetoSrpingbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeiroProjetoSrpingbootApplication.class, args);
	}

}
