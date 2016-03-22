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
    
    public void imprimirEspaco(){
        System.out.println("O Espaço de Estados encontra-se com as seguintes características:");
        System.out.println("Lista de Estados:");
        for (int i = 0; i < this.estados.size(); i++)
            System.out.println(this.estados.get(i).getNome());
        System.out.println("Lista de Arestas e suas características:");
        for (int i = 0; i < this.arestas.size(); i++)
            System.out.println(this.arestas.get(i));
        System.out.println("O Estado Inicial do Problema é: " + this.qi + ".");
        System.out.println("O Estado Final do Problema é: " + this.qf + ".");
    }
}
