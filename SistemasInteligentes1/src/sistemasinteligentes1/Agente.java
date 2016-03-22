package sistemasinteligentes1;

import java.util.ArrayList;

/**
 *
 * @author André, Jorge
 */
public class Agente {
    
    private Estado qi, qf, qa;
    private EspacoEstados es;

    public Agente(EspacoEstados es)
    {
        this.es = es;
    }
    
    public void perceber(EspacoEstados es, Estado qi,Estado qf)
    {
        this.es = es;
        this.qi = qi;
        this.qf = qf;
    }
   
    public void perceber(Estado qi, Estado qf)
    {
        this.qi = qi;
        this.qf = qf;
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
}
