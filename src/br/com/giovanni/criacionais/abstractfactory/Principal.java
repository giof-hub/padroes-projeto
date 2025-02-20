package br.com.giovanni.criacionais.abstractfactory;

import br.com.giovanni.criacionais.abstractfactory.ursinho.Ursinho;
import br.com.giovanni.criacionais.abstractfactory.coelho.Coelho;
import br.com.giovanni.criacionais.abstractfactory.tartaruga.Tartaruga;


/**
 *
 * @author giovanni.5160
 */
public class Principal {
    public static void main(String[] args) {
        FabricaDeBrinquedos fabricaPelucia = new FabricaDePelucia();
        
        Coelho coelhoPelucia = fabricaPelucia.criarCoelho();
        
        Ursinho ursinhoPelucia = fabricaPelucia.criarUrsinho();
        
        Tartaruga tartarugaPelucia = fabricaPelucia.criarTartaruga();
        
        coelhoPelucia.exibir();
        ursinhoPelucia.exibir();
        tartarugaPelucia.exibir();
        
        FabricaDeBrinquedos fabricaPlastico = new FabricaDePlastico();
        
        Coelho coelhoPlastico = fabricaPlastico.criarCoelho();
        
        Ursinho ursinhoPlastico = fabricaPlastico.criarUrsinho();
        
        Tartaruga tartarugaPlastico = fabricaPlastico.criarTartaruga();
        
        coelhoPlastico.exibir();
        ursinhoPlastico.exibir();
        tartarugaPlastico.exibir();
    }
}