package strategy_SO;
/**
 * @author Daniel_Korban
 */
public class Teste {
    public static void main(String[] args) {
        
        // instanciar Sistemas Operacionais(estrategias)
        SoStrategy windows = new SistemaWindows();
        SoStrategy linux = new SistemaLinux();
        SoStrategy mac = new SistemaMac();

        var computador1 = new Computador();
        // escolher um SO
        computador1.setSistemaOperacional(windows);
        computador1.instalarSistemaOperacional();
        System.out.println("computador com : " + computador1.getSistemaOperacional() + " instalado");
        // escolher um outro SO
        // ======================================
        computador1.setSistemaOperacional(linux);
        computador1.instalarSistemaOperacional();
        System.out.println("computador agora com : " + computador1.getSistemaOperacional() + " instalado");
        
        var macbook = new Computador();
        // escolher um SO
        // ======================================
        macbook.setSistemaOperacional(mac);
        macbook.instalarSistemaOperacional();
        System.out.println("computador2 com : " + macbook.getSistemaOperacional() + " instalado");
        // ======================================
        
    }
}
