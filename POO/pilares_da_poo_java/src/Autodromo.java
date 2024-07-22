public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("7987897");
        // jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("987987987");
        // z400.ligar();

        Veiculo coringa = jeep;

        coringa.ligar();
    }
}
