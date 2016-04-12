package si;

/**
 *
 * @author André, Jorge
 */

public class Main
{
    public static void main(String[] args)
    {
        Ambiente amb = new Ambiente();
        
        Estado a = new Estado("A", 2);
        Estado b = new Estado("B", 2);
        Estado c = new Estado("C", 1);
        Estado d = new Estado("D", 2);
        Estado e = new Estado("E", 1);
        Estado f = new Estado("F", 1);
        Estado g = new Estado("G", 1);
        Estado h = new Estado("H", 0);
        
        Aresta ab = new Aresta(a, b, 20, true);
        Aresta ac = new Aresta(a, c, 20, true);
        Aresta bd = new Aresta(b, d, 10, true);
        Aresta bf = new Aresta(b, f, 19, true);
        Aresta ch = new Aresta(c, h, 25, true);
        Aresta cg = new Aresta(c, g, 12, true);
        Aresta de = new Aresta(d, e, 5, true);
        Aresta df = new Aresta(d, f, 7, true);
        Aresta eh = new Aresta(e, h, 8, true);
        Aresta fh = new Aresta(f, h, 6, true);
        Aresta gh = new Aresta(g, h, 12, true);
        
        amb.addEstado(a);
        amb.addEstado(b);
        amb.addEstado(c);
        amb.addEstado(d);
        amb.addEstado(e);
        amb.addEstado(f);
        amb.addEstado(g);
        amb.addEstado(h);
        
        amb.addAresta(ab);
        amb.addAresta(ac);
        amb.addAresta(bd);
        amb.addAresta(bf);
        amb.addAresta(ch);
        amb.addAresta(cg);
        amb.addAresta(de);
        amb.addAresta(df);
        amb.addAresta(eh);
        amb.addAresta(fh);
        amb.addAresta(gh);
        
        Agente agenteH1 = new Agente(amb, a, h, 5);
        amb.addAgente(agenteH1);
        Agente agenteH2 = new Agente(amb, a, h, 0);
        amb.addAgente(agenteH2);
        
        // teste
        agenteH1.perceber();
        agenteH1.mostrarCrencaProblema();
        agenteH1.deliberar();
        agenteH1.executar();
        
        agenteH2.perceber();
    }
}
