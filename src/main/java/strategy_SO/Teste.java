package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class Teste {
    public static void main(String[] args) {
        // instanciar estrategias
        var windows = new SistemaWindows();
        var linux = new SistemaLinux();
        var mac = new SistemaMac();
        
        // criar o computador
        var computador = new Computador();
        // escolher um SO
        computador.setSistemaOperacional(windows);
        computador.instalarSistemaOperacional();
        // ======================================
        // escolher um outro SO
        computador.setSistemaOperacional(mac);
        computador.instalarSistemaOperacional();
        // ======================================
        // escolher um outro SO
        computador.setSistemaOperacional(linux);
        computador.instalarSistemaOperacional();
        // ======================================
        
    }
}
