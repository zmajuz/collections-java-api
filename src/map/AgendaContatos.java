package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removarContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Julia", 236475);
        agendaContatos.adicionarContato("Mariana", 463892);
        agendaContatos.adicionarContato("Mateus", 6859394);
        agendaContatos.adicionarContato("Ainhoa", 3629854);

        /*agendaContatos.exibirContatos();*/

        agendaContatos.removarContato("Julia");
        agendaContatos.exibirContatos();

        /*System.out.printf("O número do contato é: " + agendaContatos.pesquisarPorNome(""));*/

    }
}


