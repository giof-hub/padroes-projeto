package br.com.giovanni.criacionais.builder;

/**
 *
 * @author giovanni.5160
 */
public class Main {
    public static void main(String[] args) {
        Casa casaSimples = new Builder()
                .comParedes("Parede de Tijolo")
                .comJanela(5)
                .comTelhado("Telhado de barro")
                .comPorta(3).build();
        
        Casa casaCompleta = new Builder()
                .comParedes("Parede de Tijolo reforçado")
                .comJanela(8)
                .comTelhado("Telhado de concreto")
                .comPorta(9)
                .comPiscina(1).build();
        
        System.out.println(casaSimples.toString());
        System.out.println(casaCompleta.toString());
    }
}
