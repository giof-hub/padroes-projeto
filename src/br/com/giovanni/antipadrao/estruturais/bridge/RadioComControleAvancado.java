package br.com.giovanni.antipadrao.estruturais.bridge;

/**
 *
 * @author giovanni.5160
 */
public class RadioComControleAvancado {

    public void ligar() {
        System.out.println("Ligando rádio");
    }
    
    public void desligar() {
        System.out.println("Desligando rádio");
    }
    
    public void aumentarVolume() {
        System.out.println("Aumentando volume");
    }
    
    public void sintonizarEstacao(double estacao) {
        System.out.println("Rádio sintonizado na estação " + estacao + "Mhz");
    }
}
