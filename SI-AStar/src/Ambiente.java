package si;

/**
 *
 * @author André, Jorge
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ambiente
{
    private ArrayList<Estado> estados;
    private ArrayList<Aresta> arestas;
    private ArrayList<Agente> agentes;
    Map<Agente, Estado> agentesEstados; // mapa que relaciona os agentes aos estados onde eles estão

    public Ambiente()
    {
        estados = new ArrayList<>();
        arestas = new ArrayList<>();
        agentes = new ArrayList<>();
        agentesEstados = new HashMap<>();
    }
    
    public void addEstado(Estado e)
    {
        estados.add(e);
    }

    public void addAresta(Aresta a)
    {
        arestas.add(a);
    }
    
    public void addAgente(Agente a)
    {
        agentes.add(a);
        agentesEstados.put(a, a.getEstado());
    }

    public ArrayList<Estado> cloneEstados()
    {
        return (ArrayList<Estado>) estados.clone();
    }
    
    public ArrayList<Aresta> cloneArestas()
    {
        return (ArrayList<Aresta>) arestas.clone();
    }
    
    public void moveAgente(Agente ag, Aresta ar)
    {
        if(ag.getEstado() == ar.getOrigem())
        {
            agentesEstados.replace(ag, ar.getDestino());
            System.out.println("Ambiente.moveAgente(): movendo o agente de " + ar.getOrigem() + " até " + ar.getDestino() + " (d: " + ar.getDistancia() + ")");
        }
        else if(ag.getEstado() == ar.getDestino() && ar.getIdaVolta())
        {
            agentesEstados.replace(ag, ar.getOrigem());
            System.out.println("Ambiente.moveAgente(): movendo o agente de " + ar.getDestino() + " até " + ar.getOrigem() + " (d: " + ar.getDistancia() + ")");
        }
        else
        {
            System.out.print("Ambiente.moveAgente(): o agente não pode utilizar esta aresta!");
            System.out.println(" (Agente.getEstado() = " + ag.getEstado() + ", Aresta.getOrigem() = " + ar.getOrigem() + ", Aresta.getDestino() = " + ar.getDestino() + ")");
        }
    }
    
    public Estado getPosAgente(Agente a)
    {
        return agentesEstados.get(a);
    }
}
