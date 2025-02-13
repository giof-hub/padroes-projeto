package br.com.giovanni.criacionais.abstractfactory;

/**
 *
 * @author giovanni.5160
 */
class FabricaDePelucia implements FabricaDeBrinquedos {

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoDePelucia();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePelucia();
    }
    
}
