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
    private Estado estadoInicial;
    private Estado estadoFinal;
    
    public EspacoEstados(ArrayList<Estado> estados, ArrayList<Aresta> arestas, Estado i, Estado f)
    {
        this.estados = estados;
        this.arestas = arestas;
        this.estadoInicial = i;
        this.estadoFinal = f;
    }

    public ArrayList<Estado> getEstados() {
        return estados;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public Estado getEstadoInicial() {
        return estadoInicial;
    }

    public Estado getEstadoFinal() {
        return estadoFinal;
    }
    
    
}
