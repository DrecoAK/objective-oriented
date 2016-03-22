package sistemasinteligentes1;

/**
 *
 * @author André, Jorge
 */
public class Aresta
{
    private Estado origem, destino;
    private double distancia;
    private double tempo;
    private boolean idaVolta;
    
    public Aresta(Estado origem, Estado destino, double distancia, double tempo, boolean idaVolta)
    {
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.tempo = tempo;
        this.idaVolta = idaVolta;
    }
    
    public Estado getOrigem()
    {
        return origem;
    }
    
    public Estado getDestino()
    {
        return destino;
    }
    
    public double getDistancia()
    {
        return distancia;
    }
    
    public double getTempo()
    {
        return tempo;
    }
    
    public boolean getIdaVolta()
    {
        return idaVolta;
    }
    
    public void setOrigem(Estado origem)
    {
        this.origem = origem;
    }
    
    public void setDestino(Estado destino)
    {
        this.destino = destino;
    }

    public void setDistancia(double distancia)
    {
        this.distancia = distancia;
    }

    public void setTempo(double tempo)
    {
        this.tempo = tempo;
    }
    
    public void setIdaVolta(boolean idaVolta)
    {
        this.idaVolta = idaVolta;
    }
    
    @Override
    public String toString(){
        String resposta = ("Aresta conectando as Cidades " + this.origem.getNome() + " e " + this.destino.getNome() + 
                " de tamanho " + this.distancia + " e com tempo de percurso de " + this.tempo + ". ");
        if(idaVolta)
            resposta = resposta + "Esta aresta permite fluxo em ambos os sentidos!";
        else
            resposta = resposta + "Esta aresta não permite fluxo em ambos os sentidos!";
        return resposta;
    }
}
