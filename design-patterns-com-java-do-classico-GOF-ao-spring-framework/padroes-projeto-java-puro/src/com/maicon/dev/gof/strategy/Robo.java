package com.maicon.dev.gof.strategy;

/** Strategy
 *
 - Flexibilidade: Permite a alteração dinâmica do comportamento de um objeto em tempo de execução, trocando a estratégia
 utilizada sem modificar o próprio objeto.

 - Encapsulamento de algoritmos: Cada algoritmo (estratégia) é encapsulado em uma classe separada, o que facilita a manutenção e
 a compreensão do código.

 - Reutilização de código: Estratégias podem ser reutilizadas por diferentes contextos e classes, promovendo a reutilização de
 código e evitando duplicação.

 - Facilita a adição de novos comportamentos: Novas estratégias podem ser adicionadas sem alterar as classes que utilizam o
 padrão, seguindo o princípio aberto/fechado (Open/Closed Principle) da programação orientada a objetos.

 - Reduz complexidade condicional: Elimina a necessidade de múltiplas declarações condicionais (como if ou switch) para
 selecionar o comportamento adequado, delegando essa responsabilidade para as classes de estratégia.
 * **/
public class Robo {
                            // strategy
    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
