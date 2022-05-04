package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class SistemaMac implements SoStrategy{
    
    @Override
    public void instalarSistemaOperacional() {
        System.out.println("Instalando MacOS!");
        System.out.println("MacOs instalado com sucesso!");
    }
}
