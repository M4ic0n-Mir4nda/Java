package dio.springboot.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

@Configurable // Em caso de erros na implementação de Beans e garantir a injeção de
              // dependencias
public class Beans { // Classe criada para gerenciar varios beans, neste caso foi preciso pois Gson
                     // não tem um método Component implementado
    @Bean
    public Gson gson() {
        return new Gson();
    }
}
