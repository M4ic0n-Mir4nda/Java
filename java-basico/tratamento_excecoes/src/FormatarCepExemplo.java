public class FormatarCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{ // Lança a exceção caso tenha algum erro
        if(cep.length() != 8)
            throw new CepInvalidoException(); // Cria uma nova exceção

        //simulando um cep formatado
        return "23.765-064";
    }
}
