package br.com.giovanni.estruturais.adapter;

/**
 *
 * @author giovanni.5160
 */
public class Principal {
    public static void main(String[] args) {
        SistemaDePagamento sistema1 = new SistemaDePagamento(new PagamentoAntigoAdapter());
        
        sistema1.realizarPagamento(100.00);
        
        SistemaDePagamento sistema2= new SistemaDePagamento(new PagamentoNovoAdapter());
        
        sistema2.realizarPagamento(100.00);
    }
}
