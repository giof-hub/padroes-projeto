package br.com.giovanni.criacionais.abstractfactory;

import br.com.giovanni.criacionais.abstractfactory.ursinho.UrsinhoDePelucia;
import br.com.giovanni.criacionais.abstractfactory.ursinho.Ursinho;
import br.com.giovanni.criacionais.abstractfactory.coelho.CoelhoDePelucia;
import br.com.giovanni.criacionais.abstractfactory.coelho.Coelho;
import br.com.giovanni.criacionais.abstractfactory.tartaruga.Tartaruga;
import br.com.giovanni.criacionais.abstractfactory.tartaruga.TartarugaDePelucia;

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

    @Override
    public Tartaruga criarTartaruga() {
        return new TartarugaDePelucia();
    }
}
