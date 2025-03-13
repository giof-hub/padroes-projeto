package br.com.giovanni.estruturais.adapter;

/**
 *
 * @author giovanni.5160
 */
public class PagamentoAntigoAdapter implements Pagamento {

    private PagamentoAntigo sistemaAntigo = new PagamentoAntigo();
    
    @Override
    public void pagar(double valor) {
        sistemaAntigo.processarPagamento(valor);
    }
}
