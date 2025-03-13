package br.com.giovanni.estruturais.bridge;

/**
 *
 * @author giovanni.5160
 */
public class Principal {
    
    public static void main(String[] args) {
        Dispositivo tv = new Televisao();
        Dispositivo radio = new Radio();
        Dispositivo projetor = new Projetor();
        
        ControleRemoto controleBasicoTV = new ControleRemotoBasico(tv);
        ControleRemoto controleAvancadoRadio = new ControleRemotoAvancado(radio);
        ControleRemoto controleBasicoProjetor = new ControleRemotoBasico(projetor);
        
        controleBasicoTV.ligar();
        controleBasicoTV.aumentarVolume();
        
        controleAvancadoRadio.ligar();
        controleAvancadoRadio.aumentarVolume();
        
        ((ControleRemotoAvancado) controleAvancadoRadio).silenciar();
        
        controleBasicoProjetor.ligar();
        controleBasicoProjetor.desligar();
    }
}
