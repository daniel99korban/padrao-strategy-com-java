package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class Computador {
    
    private SoStrategy soStrategy;
    private String sistemaOperacional;
    
    public Computador(){
        System.out.println("Um novo computador foi criado!");
    }
    
    void setSistemaOperacional(SoStrategy soStrategy){
        this.soStrategy = soStrategy;
    }

    public void instalarSistemaOperacional() {
        
        if(soStrategy == null){
            System.out.println("O computador ainda não possui SO instalado!");
            return;
        }
        
        this.setSistemaOperacional(soStrategy.instalarSistemaOperacional());
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    
}
