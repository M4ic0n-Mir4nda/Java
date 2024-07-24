package com.maicon.dev.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

/** Facede
 *
 - Simplificação da interface: Proporciona uma interface simplificada e mais amigável para um conjunto complexo de classes ou
 subsistemas, facilitando o uso por parte dos clientes.

 - Redução da dependência: Minimiza o acoplamento entre os clientes e os componentes internos do sistema, promovendo uma
 arquitetura mais modular e flexível.

 - Facilidade de manutenção: Ao isolar as complexidades e os detalhes internos do sistema, facilita a manutenção e a evolução do
 código, permitindo modificações no subsistema sem impactar os clientes.

 - Encapsulamento: Oculta as complexidades e os detalhes de implementação de um subsistema, protegendo o código contra mudanças
 e promovendo a encapsulação.

 - Coordenação de subsistemas: Pode ser usado para centralizar e gerenciar a interação entre diferentes subsistemas, melhorando
 a coesão e a organização do código.

 - Melhora a legibilidade do código: Fornece uma interface clara e direta, melhorando a legibilidade e a compreensão do código
 por parte dos desenvolvedores.
 * **/

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
