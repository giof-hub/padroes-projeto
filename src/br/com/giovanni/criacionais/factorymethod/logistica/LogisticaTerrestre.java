package br.com.giovanni.criacionais.factorymethod.logistica;

import br.com.giovanni.criacionais.factorymethod.transporte.Transporte;
import br.com.giovanni.criacionais.factorymethod.transporte.TransporteTerrestre;

/**
 *
 * @author giovanni.5160
 */
public class LogisticaTerrestre extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteTerrestre();
    }
}
