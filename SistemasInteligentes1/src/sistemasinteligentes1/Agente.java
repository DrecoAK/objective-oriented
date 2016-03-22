package sistemasinteligentes1;

import java.util.ArrayList;

/**
 *
 * @author André, Jorge
 */
public class Agente {
    
    private Estado estadoInicial, estadoFinal, estadoAtual;
    private EspacoEstados es;

    public Agente(EspacoEstados es)
    {
        this.es = es;
    }
    
    public void perceber()
    {
        this.estadoInicial = es.getEstadoInicial();
        this.estadoFinal = es.getEstadoFinal();
    }
   
    public void perceber(Estado qi, Estado qf)
    {
        this.estadoInicial = qi;
        this.estadoFinal = qf;
    }
    
    public void perceber(EspacoEstados es)
    {
        this.es = es;
    }
    
    // escolha da próxima ação
    public void deliberar()
    {
        
    }
    
    // executar ação no ambiente (em resposta a uma ação, o ambiente deve mudar de estado)
    public void executar()
    {
    }
    
    public void mostrarCrencaProblema()
    {

    }
}
