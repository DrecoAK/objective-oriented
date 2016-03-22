package sistemasinteligentes1;

import java.util.ArrayList;

/**
 *
 * @author André, Jorge
 */
public class Agente {
    
    private Estado qi, qf, atual;
    private EspacoEstados es;
    private ArrayList<Aresta> solucao = new ArrayList<Aresta>();
    private double distanciaTotal = 0;
    private double tempoTotal = 0;

    public Agente(EspacoEstados es)
    {
        this.es = es;
        atual = es.getEstadoInicial();
    }
    
    public void perceber()
    {
        this.qi = es.getEstadoInicial();
        this.qf = es.getEstadoFinal();
    }
   
    public void perceber(Estado qi, Estado qf)
    {
        this.qi = qi;
        this.qf = qf;
    }
    
    public void perceber(EspacoEstados es)
    {
        this.es = es;
    }
    
    
    public void addToSolucao(Aresta a)
    {
        solucao.add(a);
        System.out.println("\tAdicionada aresta " + a.getOrigem().getNome() + " - " + a.getDestino().getNome() + " (d: " + a.getDistancia() + ", t: " + a.getTempo() + ") à solução.");
    }
    
    // escolha da próxima ação
    public void deliberar()
    {
        System.out.println("Deliberar... Solução hardcoded.");
        addToSolucao(es.getArestas().get(0));
        addToSolucao(es.getArestas().get(1));
        addToSolucao(es.getArestas().get(4));
        System.out.println("");
    }


    public void irPara(Aresta a)
    {
        System.out.println("\tIndo de " + a.getOrigem().getNome() + " até " + a.getDestino().getNome() + " d: " + a.getDistancia() + ", t: " + a.getTempo() + ".");
        atual = a.getDestino();
        distanciaTotal += a.getDistancia();
        tempoTotal += a.getTempo();
    }
    
    // executar ação no ambiente (em resposta a uma ação, o ambiente deve mudar de estado)
    public void executar()
    {
        System.out.println("Executar...");

        // o ambiente é estático e determinístico.
        // portanto, a solução calculada em deliberar() pode ser executada completamente de uma vez
        
        while(!solucao.isEmpty()) // executa a solução
        {
            irPara(solucao.remove(0));
        }
        System.out.println("\tDistância total: " + distanciaTotal + ", Tempo total: " + tempoTotal);
    }
    
    public void mostrarCrencaProblema()
    {

    }
}
