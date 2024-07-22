import maicon.dev.junit.GerenciadorDeConexaoComBancoDeDados;
import maicon.dev.junit.Pessoa;
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class AfterBeforeTeste {

    @BeforeAll // Execução no inicio do codigo
    static void configuraConexao() {
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
    }

    @BeforeEach // Executa antes e depois de cada teste que existe na classe
    void insereDadosParaTeste() {
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach // Executa antes e depois de cada teste que existe na classe
    void removeDadosDoTeste() {
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll // Execução no final do codigo
    static void finalizarConexao() {
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
    }
}