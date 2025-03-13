package br.com.giovanni.antipadrao.criacionais.factorymethod;

/**
 *
 * @author giovanni.5160
 */
public class Trem extends Transporte{
    @Override
    public void entregar() {
        System.out.println("Entregando via Trem");
    }
}
