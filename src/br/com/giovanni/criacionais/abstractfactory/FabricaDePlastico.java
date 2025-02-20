package br.com.giovanni.criacionais.abstractfactory;

import br.com.giovanni.criacionais.abstractfactory.ursinho.Ursinho;
import br.com.giovanni.criacionais.abstractfactory.ursinho.UrsinhoDePlastico;
import br.com.giovanni.criacionais.abstractfactory.coelho.Coelho;
import br.com.giovanni.criacionais.abstractfactory.coelho.CoelhoDePlastico;
import br.com.giovanni.criacionais.abstractfactory.tartaruga.Tartaruga;
import br.com.giovanni.criacionais.abstractfactory.tartaruga.TartarugaDePlastico;

/**
 *
 * @author giovanni.5160
 */
class FabricaDePlastico implements FabricaDeBrinquedos {

    @Override
    public Ursinho criarUrsinho() {
        return new UrsinhoDePlastico();
    }

    @Override
    public Coelho criarCoelho() {
        return new CoelhoDePlastico();
    }

    @Override
    public Tartaruga criarTartaruga() {
        return new TartarugaDePlastico();
    } 
}
