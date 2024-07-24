package com.maicon.dev.gof.singleton;

/**
 * Singleton "Lazy Holder".
 *  - Controle de acesso a um único objeto: Garante que uma classe tenha apenas uma instância, e fornece um ponto global de
 *  acesso a essa instância.
 *  - Uso eficiente de recursos: Evita a criação repetida de objetos que consomem muitos recursos, economizando memória e
 * processamento.
 * - Facilita o gerenciamento de estados globais: Útil para gerenciar estados que precisam ser compartilhados em diferentes
 * partes de uma aplicação.
 * - Consistência: Assegura que todos os componentes da aplicação usem a mesma instância, evitando inconsistências e problemas
 * de sincronização.
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>"
 *
 * @author Maicon
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super(); // Chama o construtor da classe pai
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
