package br.com.giovanni.estruturais.bridge;

/**
 *
 * @author giovanni.5160
 */
public class Radio implements Dispositivo{

    @Override
    public void ligar() {
        System.out.println("Ligando Rádio");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando Rádio");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando Volume do Rádio");
    }
    
}
