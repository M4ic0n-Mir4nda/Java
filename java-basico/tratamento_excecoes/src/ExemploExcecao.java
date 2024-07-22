import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75"); // Erro não checado

        try {
            valor = NumberFormat.getInstance().parse("a1.75"); // Erro checado e recomenda o uso de um try / catch
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}