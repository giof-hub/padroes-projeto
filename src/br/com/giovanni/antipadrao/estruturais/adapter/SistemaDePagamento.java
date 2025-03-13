package br.com.giovanni.antipadrao.estruturais.adapter;

/**
 *
 * @author giovanni.5160
 */
public class SistemaDePagamento {

    private boolean usarSistemaNovo;
    private PagamentoAntigo pagamentoAntigo = new PagamentoAntigo();
    private PagamentoNovo pagamentoNovo = new PagamentoNovo();

    public SistemaDePagamento(boolean usarSistemaNovo) {
        this.usarSistemaNovo = usarSistemaNovo;
    }
    
    public void realizarPagamento(double valor) {
        if (usarSistemaNovo) {
            System.out.println("Convertendo valor para sistema");
            pagamentoNovo.pagar(valor);
        } else {
            pagamentoAntigo.processarPagamento(valor);
        }
    }
}
