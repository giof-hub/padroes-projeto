package br.com.giovanni.estruturais.adapter;

/**
 *
 * @author giovanni.5160
 */
public class SistemaDePagamento {
    private Pagamento metodoPagamento;

    public SistemaDePagamento(Pagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    public void realizarPagamento(double valor) {
        metodoPagamento.pagar(valor);
    }
}
