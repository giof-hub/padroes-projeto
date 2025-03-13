package br.com.giovanni.estruturais.bridge;

/**
 *
 * @author giovanni.5160
 */
public class Projetor implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Ligando Projetor");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Projetor");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando Volume");
    }
    
}
