package br.com.giovanni.criacionais.factorymethod.logistica;

import br.com.giovanni.criacionais.factorymethod.transporte.Transporte;

/**
 *
 * @author giovanni.5160
 */
public abstract class Logistica {
    public abstract Transporte criarTransporte();
    
    public void organizarEntrega() {
        Transporte transporte = criarTransporte();
        
        transporte.entregar();
    }
}
