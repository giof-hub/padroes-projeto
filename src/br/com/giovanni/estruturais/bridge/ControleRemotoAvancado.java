package br.com.giovanni.estruturais.bridge;

/**
 *
 * @author giovanni.5160
 */
public class ControleRemotoAvancado extends ControleRemoto {

    public ControleRemotoAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }
    
    public void silenciar() {
        System.out.println("Dispositivo Silenciado");
    }
}
