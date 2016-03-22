package sistemasinteligentes1;

import java.util.ArrayList;

/**
 *
 * @author André, Jorge
 */
public class EspacoEstados
{
    private ArrayList<Estado> estados;
    private ArrayList<Aresta> arestas;
    private Estado qi;
    private Estado qf;
    
    public EspacoEstados(ArrayList<Estado> estados, ArrayList<Aresta> arestas, Estado qi, Estado qf)
    {
        this.estados = estados;
        this.arestas = arestas;
        this.qi = qi;
        this.qf = qf;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public Estado getEstadoInicial() {
        return qi;
    }

    public Estado getEstadoFinal() {
        return qf;
    }
}
