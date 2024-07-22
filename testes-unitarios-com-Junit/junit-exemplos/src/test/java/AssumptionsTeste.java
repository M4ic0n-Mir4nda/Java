import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {

    @Test
    void validarAlgoSomenteNoUsuarioWillyan() {
        Assumptions.assumeFalse("root".equals(System.getenv("USER"))); // Só vai ser executado o teste se o USER for "root"
        Assertions.assertEquals(10, 5 + 5);
    }
}
