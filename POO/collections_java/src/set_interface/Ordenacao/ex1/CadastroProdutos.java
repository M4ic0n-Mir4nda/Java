package set_interface.Ordenacao.ex1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        // TreeSet deixa organizado desta forma de acordo com o Comparable o HashSeet não permite isso
        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
