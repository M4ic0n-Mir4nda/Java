package list.OperacoesBasicas.ex2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoCompra;
    private double total;

    public CarrinhoDeCompras() {
        this.carrinhoCompra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoCompra.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        for(Item i: carrinhoCompra) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                carrinhoCompra.remove(i);
                return;
            }
        }
    }

    public double calcularValorTotal() {
        for(Item i: carrinhoCompra) {
            double soma = i.getPreco() * i.getQuantidade();
            this.total += soma;
        }
        return this.total;
    }

    public void exibirItens() {
        System.out.println(carrinhoCompra);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoCompra = new CarrinhoDeCompras();
        carrinhoCompra.adicionarItem("Item 1", 1.99, 2);
        carrinhoCompra.adicionarItem("Item 2", 5.99, 5);
        carrinhoCompra.adicionarItem("Item 3", 10.99, 2);

        carrinhoCompra.removerItem("Item 2");
        System.out.println(carrinhoCompra.calcularValorTotal());
        carrinhoCompra.exibirItens();
    }
}
