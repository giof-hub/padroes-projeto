package br.com.giovanni.antipadrao.factorymethod;

/**
 *
 * @author giovanni.5160
 */
public class Caminhao extends Transporte{
    
    @Override
    public void entregar() {
        System.out.println("Entregando via caminhão");
    }
}
