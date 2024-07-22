package br.com.maiconmiranda.ioc_di;

import org.springframework.stereotype.Component;
// import org.springframework.stereotype.Service;

@Component // Geralmente é usado o @Component por ser algo simples, ou caso seja uma camada
           // de serviço @Service
public class MeuComponent {
    // Resumo/Objetivo: O objetivo é o spring colocar esta classe na propria
    // configuracao no momento que inicializar a aplicacao e quando for chamada com
    // o @Autowired ele será instanciado sem eu precisar fazer isso, ou seja o
    // objetivo do spring é ele gerenciar tudo sem precisar ficar instanciando
    // objetos sempre
    public String chamarMeuComponent() {
        return "Chamando meu component";
    }
}
