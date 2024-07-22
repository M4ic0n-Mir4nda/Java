import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
// @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTeste {

    @DisplayName("Teste que valida se o usuário foi criado")
    // @Order(4)
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    // @Order(3)
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    // @Order(2)
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    // @Order(1)
    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}