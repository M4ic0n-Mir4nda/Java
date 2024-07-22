package map_interface.Ordenacao.ex1;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        // Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        // No momento que é criado "eventosTreeMap" esses eventos já estão ordenados em ordem cresc, por causa do atributo ser um
        // LocalDate que seguindo toda uma corrente de implementação deste método, tem um extends de Comparable
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
//        Set<LocalDate> dateSet = eventosMap.keySet(); Retorn um Set de keys(chaves)

        // Esses dois métodos não se relacionam

//        Collection<Evento> values = eventosMap.values(); Retorna uma Colletion de values(valores)

        // eventosMap.get(); O evento get não funciona pois não terá um Evento para receber como parametro

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        // entrySet: Retorna um Set aonde esse Set cada elemento é de um tipo unico aonde dentro dele tem objetos do tipo
        // Map.Entry onde ele sabe onde indicar o key:value correspondente
        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 14), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER, 20), "Evento 6", "Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
        System.out.println();
    }
}
