package subsistema2.cep;

import com.maicon.dev.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super(); // Chama o construtor da classe pai
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
