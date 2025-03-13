package br.com.giovanni.antipadrao.estruturais.composite;

/**
 *
 * @author giovanni.5160
 */
public class Main {
    public static void main(String[] args) {
        Produto cerveja = new Produto("", 3.99);
        Caixa caixa = new Caixa("", cerveja, 12);
        Fardo fardo = new Fardo("", caixa, 24);
        
        double total = fardo.getPreco();
        System.out.println(total);
    }
}
