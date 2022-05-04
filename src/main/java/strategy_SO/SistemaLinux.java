package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class SistemaLinux implements SoStrategy{

    @Override
    public void instalarSistemaOperacional() {
        System.out.println("Instalando Linux!");
        System.out.println("Linux instalado com sucesso!");
    }
    
}
