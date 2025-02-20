package br.com.giovanni.criacionais.factorymethod.logistica;

import br.com.giovanni.criacionais.factorymethod.transporte.Transporte;
import br.com.giovanni.criacionais.factorymethod.transporte.TransporteFerroviario;

/**
 *
 * @author giovanni.5160
 */
public class LogisticaFerroviaria extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteFerroviario();
    }
}
