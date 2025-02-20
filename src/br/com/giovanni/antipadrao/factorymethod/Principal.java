package br.com.giovanni.antipadrao.factorymethod;

/**
 *
 * @author giovanni.5160
 */
public class Principal {
    public static void main(String[] args) {
        Logistica logistica = new Logistica();
        
        logistica.planejarEntrega("caminhao");
        logistica.planejarEntrega("trem");
    }
}
