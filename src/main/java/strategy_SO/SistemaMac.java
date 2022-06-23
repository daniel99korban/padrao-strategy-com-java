package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class SistemaMac implements SoStrategy{
    
    @Override
    public String instalarSistemaOperacional() {
        System.out.println("MacOs instalado com sucesso!");
        return "MacOs";
    }
}
