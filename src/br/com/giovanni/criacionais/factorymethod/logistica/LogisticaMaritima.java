package br.com.giovanni.criacionais.factorymethod.logistica;

import br.com.giovanni.criacionais.factorymethod.transporte.Transporte;
import br.com.giovanni.criacionais.factorymethod.transporte.TransporteMaritimo;

/**
 *
 * @author giovanni.5160
 */
public class LogisticaMaritima extends Logistica{

    @Override
    public Transporte criarTransporte() {
        return new TransporteMaritimo();
    }
}
