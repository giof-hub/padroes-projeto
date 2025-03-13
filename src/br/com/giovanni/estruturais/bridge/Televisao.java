package br.com.giovanni.estruturais.bridge;

/**
 *
 * @author giovanni.5160
 */
public class Televisao implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("Ligando TV");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando Volume da TV");
    }
    
}
