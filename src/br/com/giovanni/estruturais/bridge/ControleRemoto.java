package br.com.giovanni.estruturais.bridge;

/**
 *
 * @author giovanni.5160
 */
public abstract class ControleRemoto {
    protected Dispositivo dispositivo;
    
    public ControleRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    
    public void ligar() {
        dispositivo.ligar();
    }

    public void desligar() {
        dispositivo.desligar();
    }

    public void aumentarVolume() {
        dispositivo.aumentarVolume();
    }
}
