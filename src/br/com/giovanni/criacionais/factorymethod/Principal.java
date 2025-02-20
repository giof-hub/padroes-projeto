/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giovanni.criacionais.factorymethod;

import br.com.giovanni.criacionais.factorymethod.logistica.Logistica;
import br.com.giovanni.criacionais.factorymethod.logistica.LogisticaFerroviaria;
import br.com.giovanni.criacionais.factorymethod.logistica.LogisticaMaritima;
import br.com.giovanni.criacionais.factorymethod.logistica.LogisticaTerrestre;

/**
 *
 * @author giovanni.5160
 */
public class Principal {
    public static void main(String[] args) {
        Logistica logisticaFerroviaria = new LogisticaFerroviaria();
        
        logisticaFerroviaria.organizarEntrega();
        
        Logistica logisticaMaritima = new LogisticaMaritima();
        
        logisticaMaritima.organizarEntrega();
        
        Logistica logisticaTerrestre = new LogisticaTerrestre();
        
        logisticaTerrestre.organizarEntrega();
    }
}