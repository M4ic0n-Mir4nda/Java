import maicon.dev.junit.Conta;
import maicon.dev.junit.TransferenciaEntreContas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.xml.transform.TransformerException;

public class ExceptionsTeste {

    @Test
    void validarCenarioDeTransferencia() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
    }

    @Test
    void validaCenarioExcecao() {
        Conta contaOrigem = new Conta("123456", 0);
        Conta contaDestino = new Conta("456548", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(contaOrigem,
                contaDestino,
                0));
    }
}