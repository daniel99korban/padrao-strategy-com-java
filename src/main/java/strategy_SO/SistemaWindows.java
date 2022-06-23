package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class SistemaWindows implements SoStrategy{

    @Override
    public String instalarSistemaOperacional() {
        System.out.println("Windows instalado com sucesso!");
        return "Windows";
    }
    
}
