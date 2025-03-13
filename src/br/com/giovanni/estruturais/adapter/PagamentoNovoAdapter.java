package br.com.giovanni.estruturais.adapter;

/**
 *
 * @author giovanni.5160
 */
public class PagamentoNovoAdapter implements Pagamento {

    private PagamentoNovo sistemaNovo = new PagamentoNovo();
    
    @Override
    public void pagar(double valor) {
        sistemaNovo.pagar(valor);
    }
    
}
