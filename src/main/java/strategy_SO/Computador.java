package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class Computador {
    
    private SoStrategy soStrategy;
    
    void setSistemaOperacional(SoStrategy soStrategy){
        this.soStrategy = soStrategy;
    }

    public void instalarSistemaOperacional() {
        if(soStrategy == null){
            System.out.println("O computador ainda não possui SO instalado!");
            return;
        }
        soStrategy.instalarSistemaOperacional();
    }
    
    static{
        System.out.println("Um novo computador foi criado!");
    }
    
}
