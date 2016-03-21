package sistemasinteligentes1;

import java.util.ArrayList;

/**
 *
 * @author André, Jorge
 */
public class Agente {
    
    private String[] q;
    // private float[][] pesoCaminhos; // talvez
    private String qf;
    private String qi;
    
    private EspacoEstados es;

    public Agente()
    {
    }
    
    public void capturar()
    {
        // se o cálculo é simulado, o agente ainda precisa fazer a busca?
        // em todo caso, esse é o código de criação do ambiente
        // cria a parada toda e coloca tudo no espaço de estados
        
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
        
        ArrayList<Estado> estados = new ArrayList<Estado>();
        estados.add(p);
        estados.add(s);
        estados.add(b);
        estados.add(m);
        estados.add(a);
        
        ArrayList<Aresta> arestas = new ArrayList<Aresta>();
        arestas.add(ps);
        arestas.add(sb);
        arestas.add(sm);
        arestas.add(mb);
        arestas.add(ba);
        
        es = new EspacoEstados(estados, arestas);
    }
    
    // escolha da próxima ação
    public void deliberar()
    {
    }
    
    // executar ação no ambiente (em resposta a uma ação, o ambiente deve mudar de estado)
    public void executar()
    {
    }
}
