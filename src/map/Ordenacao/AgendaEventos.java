package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    //atributos
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.print(eventosTreeMap);
    }
    public void obterProximoEvento() {
        /*Set<LocalDate> dataSet = eventoMap.keySet();
        Collection<Evento> values = eventoMap.values();*/

        LocalDate dataAtual= LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + "acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JUNE, 15), "Evento 1", "Atracao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JUNE, 9), "Evento 2", "Atracao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.JANUARY, 10), "Evento 3", "Atracao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JUNE, 12), "Evento 4", "Atracao 4");
        agendaEventos.adicionarEvento(LocalDate.of(20224, Month.JUNE, 13), "Evento 5", "Atracao 5");

        /*agendaEventos.exibirAgenda();*/

        agendaEventos.obterProximoEvento();
    }
}
