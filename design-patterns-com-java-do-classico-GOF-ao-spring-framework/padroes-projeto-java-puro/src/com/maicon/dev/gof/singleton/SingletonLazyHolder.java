package com.maicon.dev.gof.singleton;

/**
 * Singleton "Lazy Holder Performatica".
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
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super(); // Chama o construtor da classe pai
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
