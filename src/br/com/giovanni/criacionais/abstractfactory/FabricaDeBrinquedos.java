package br.com.giovanni.criacionais.abstractfactory;

import br.com.giovanni.criacionais.abstractfactory.ursinho.Ursinho;
import br.com.giovanni.criacionais.abstractfactory.coelho.Coelho;
import br.com.giovanni.criacionais.abstractfactory.tartaruga.Tartaruga;

/**
 *
 * @author giovanni.5160
 */
public interface FabricaDeBrinquedos {
    Ursinho criarUrsinho();
    Coelho criarCoelho();
    Tartaruga criarTartaruga();
}
