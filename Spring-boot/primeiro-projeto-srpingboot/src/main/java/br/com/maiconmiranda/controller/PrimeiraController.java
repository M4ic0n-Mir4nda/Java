package br.com.maiconmiranda.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que é uma classe do tipo Controller onde atraves dela será recebida
                // uma requisicao.
// Recurso
@RequestMapping("/primeiraController") // Mapeia uma rota para ser acessada
public class PrimeiraController {

    // metodo
    @GetMapping("/primeiroMetodo/{id}") // Define o tipo de requisição que será a rota
    public String primeiroMetodo(@PathVariable String id) { // se o ultimo nome for diferente da variavel é feito da
                                                            // seguinte forma: @PathVariable(name = "id")
        return "O parametro é " + id;
    }

    @GetMapping("/metodoComQueryParams")
    public String metodoComQueryParams(@RequestParam String id) { // Informa na requisicao que dentro da
                                                                  // requisicao ira receber os query params(parametros)
        return "O parametro com metodoComQueryParams é" + id;
    }

    @GetMapping("/metodoComQueryParams2")
    public String metodoComQueryParams2(@RequestParam Map<String, String> allParams) { // Desta forma você não precisa
                                                                                       // mapear todas as querys, O Map
                                                                                       // pega chave e valor e mapeia
                                                                                       // todas as variaveis
                                                                                       // automaticamente
        // receber os query params(parametros)
        return "O parametro com metodoComQueryParams é " + allParams.entrySet();
    }

    @PostMapping("/metodoComBodyParams")
    public String metodoComBodtParams(@RequestBody Usuario usuario) {
        return "metodoComBodtParams " + usuario.username;
    }

    @PostMapping("/metodoComHeaders")
    public String metodoComHeaders(@RequestHeader("name") String name) {
        return "metodoComHeaders " + name;
    }

    @PostMapping("/metodoComListHeaders")
    public String metodoComListHeaders(@RequestHeader Map<String, String> headers) {
        return "metodoComListHeaders " + headers.entrySet();
    }

    @GetMapping("/metodoRespondeEntity/{id}")
    public ResponseEntity<Object> metodoRespondeEntity(@PathVariable Long id) {
        var usuario = new Usuario("maiconmiranda");
        if (id > 5) {
            return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
        }
        return ResponseEntity.badRequest().body("Número menor que 5");
    }

    record Usuario(String username) {
    }

}
