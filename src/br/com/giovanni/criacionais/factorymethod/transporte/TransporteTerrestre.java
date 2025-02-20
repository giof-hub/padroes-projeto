package br.com.giovanni.criacionais.factorymethod.transporte;

/**
 *
 * @author giovanni.5160
 */
public class TransporteTerrestre implements Transporte{

    @Override
    public void entregar() {
        System.out.println("Entregando por transporte terrestre.");
    }
    
}
