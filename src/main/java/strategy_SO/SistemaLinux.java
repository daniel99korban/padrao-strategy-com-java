package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class SistemaLinux implements SoStrategy{

    @Override
    public String instalarSistemaOperacional() {
        System.out.println("Linux instalado com sucesso!");
        return "Linux";
    }
    
}
