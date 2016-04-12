package si;

/**
 *
 * @author André, Jorge
 */

public class Estado
{
    private String nome;
    private int minHopsToSolution;

    public Estado(String nome)
    {
        this.nome = nome;
    }
    
    public Estado(String nome, int minHopsToSolution)
    {
        this.nome = nome;
        this.minHopsToSolution = minHopsToSolution;
    }

    public String getNome()
    {
        return nome;
    }
    
    public int getMinHopsToSolution()
    {
        return minHopsToSolution;
    }

    @Override
    public String toString()
    {
        return nome;
    }
}
