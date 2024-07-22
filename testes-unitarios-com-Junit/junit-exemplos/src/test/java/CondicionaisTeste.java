import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "maicon")
    void validaComparacaoSomenteNoUsuarioMaicon() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void desabilitaComparacaoSomenteNoUsuarioRoot() {
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgoSomenteNoUsuarioWillyan() {
        Assertions.assertEquals(10, 5 + 5);
    }
}