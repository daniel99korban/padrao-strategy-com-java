package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class SistemaWindows implements SoStrategy{

    @Override
    public void instalarSistemaOperacional() {
        System.out.println("Instalando Windows!");
        System.out.println("Windows instalado com sucesso!");
    }
    
}
