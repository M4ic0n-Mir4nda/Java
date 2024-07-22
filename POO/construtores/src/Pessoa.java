public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Construtor de uma pessoa sem parametro
    public Pessoa() {
        super();
    }

    // Construtor de uma pessoa somente com o nome
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String newEndereco) {
        this.endereco = newEndereco;
    }
    //...
    //setters de nome e cpf ?
}
