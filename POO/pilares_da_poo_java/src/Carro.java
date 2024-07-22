public class Carro extends Veiculo{
    public void ligar() {
        confereCambiol();
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    public void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }
    private void confereCambiol() {
        System.out.println("Conferindo cambio em P");
    }
}
