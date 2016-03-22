package sistemasinteligentes1;

import java.util.ArrayList;

/**
 *
 * @author André, Jorge
 */
public class Main
{
    public static void main(String[] args)
    {
        Estado p = new Estado("Portal da Graciosa");
        Estado s = new Estado("São João");
        Estado b = new Estado("Bufara");
        Estado m = new Estado("Morretes");
        Estado a = new Estado("Antonina");
        
        Aresta ps = new Aresta(p, s, 19.1, 18, true);
        Aresta sb = new Aresta(s, b, 17.7, 18, true);
        Aresta sm = new Aresta(s, m, 13.2, 14, true);
        Aresta mb = new Aresta(m, b, 7.0, 8, true);
        Aresta ba = new Aresta(b, a, 6.9, 8, true);
        
        ArrayList<Estado> estados = new ArrayList<>();
        estados.add(p);
        estados.add(s);
        estados.add(b);
        estados.add(m);
        estados.add(a);
        
        ArrayList<Aresta> arestas = new ArrayList<>();
        arestas.add(ps);
        arestas.add(sb);
        arestas.add(sm);
        arestas.add(mb);
        arestas.add(ba);
        
        EspacoEstados es = new EspacoEstados(estados, arestas, p, a);
        
        Agente agente = new Agente(es);
        
        // teste
        agente.perceber(es);
        agente.mostrarCrencaProblema();
        agente.deliberar();
        agente.executar();
        
    }
}
