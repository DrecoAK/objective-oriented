package si;

import java.util.ArrayList;

/**
 *
 * @author André, Jorge
 */
public class Agente
{
    private Estado atual;
    private Ambiente amb;
    private EspacoEstados es;
    private ArrayList<Aresta> solucao;
    private double distanciaTotal = 0;
    private int heuristica = 0;

    public Agente(Ambiente amb, Estado qi, Estado qf, int heuristica)
    {
        System.out.println("Iniciando construtor Agente()...");
        solucao = new ArrayList<>();
        this.amb = amb;
        es = new EspacoEstados(amb.cloneEstados(), amb.cloneArestas(), qi, qf);
        atual = qi;
        this.heuristica = heuristica;
        System.out.println("Estado inicial: " + qi);
        System.out.println("Estado objetivo: " + qf);
    }

    public void perceber() // atualiza o estado atual do agente de acordo com sua posição no ambiente. seria possível também atualizar a lista de estados e arestas se necessário
    {
        atual = amb.getPosAgente(this);
        System.out.println("perceber(): agente está em " + atual + ".");
    }

    public void addToSolucao(Aresta a)
    {
        solucao.add(a);
        System.out.println("addToSolucao(): adicionada aresta " + a.getOrigem().getNome() + " - " + a.getDestino().getNome() + " (d: " + a.getDistancia() + ")");
    }

    // escolha da próxima ação
    public void deliberar()
    {
        System.out.println("Iniciando deliberar()...");
        /*
        addToSolucao(es.getArestas().get(0));
        addToSolucao(es.getArestas().get(2));
        addToSolucao(es.getArestas().get(6));
        addToSolucao(es.getArestas().get(6));
        System.out.println("");
         */
        System.out.println("Iniciando A*!");
        System.out.println("Estado Inicial: " + es.getEstadoInicial());
    }

    public void irPara(Aresta a)
    {
        amb.moveAgente(this, a);
        distanciaTotal += a.getDistancia();
        perceber();
    }

    // executar ação no ambiente (em resposta a uma ação, o ambiente deve mudar de estado)
    public void executar()
    {
        System.out.println("\nIniciando executar()...");

        // o ambiente é estático e determinístico.
        // portanto, a solução calculada em deliberar() pode ser executada completamente de uma vez
        while (!solucao.isEmpty()) // executa a solução
        {
            irPara(solucao.remove(0));
        }
        System.out.println("Distância total: " + distanciaTotal);
    }

    public void mostrarCrencaProblema()
    {
        System.out.println("mostrarCrencaProblema():");
        es.imprimirEspaco();
    }

    public void mostrarCrencaEstadoAtual()
    {
        System.out.println("mostrarCrencaEstadoAtual(): Agente está em " + atual + ".");
    }

    public void mostrarCrencaSolucao()
    {
        System.out.println("mostrarCrencaSolucao():");
        if (!solucao.isEmpty()) {
            System.out.println("A solução atual, partindo do meu estado atual, é composta pelas seguintes arestas:");
            for (int i = 0; i < solucao.size(); i++)
                System.out.println(solucao.get(i));
        }
        else
            System.out.println("A solução está vazia, ou o agente ainda não deliberou sobre o problema... ou ele já resolveu o problema e alcançou o objetivo!");
    }

    public Estado getEstado()
    {
        return atual;
    }
}
