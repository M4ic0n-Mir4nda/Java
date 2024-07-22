package me.br.com.mockito.exemplos;

import maicon.dev.EnviarMensagem;
import maicon.dev.Mensagem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

/**
 * Teste da classe {@link EnviarMensagem} exemplificando Spy
 */
@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {

    @Spy
    EnviarMensagem enviarMensagem = new EnviarMensagem();

    @Test
    void adicionarMensagem() {
        Mensagem mensagem = new Mensagem("Hello World");

        enviarMensagem.adicionarMensagem(mensagem);

        verify(enviarMensagem).adicionarMensagem(mensagem); // Verifica se neste objeto foi chamado o metodo "adicionarMensagem"

        Assertions.assertEquals(1, enviarMensagem.getMensagens().size()); // Verifica se o tamanho do array é == 1
    }

}