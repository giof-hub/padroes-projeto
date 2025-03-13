package br.com.giovanni.antipadrao.estruturais.adapter;

/**
 *
 * @author giovanni.5160
 */
public class Principal {
    public static void main(String[] args) {
        SistemaDePagamento sistemaAntigo = new SistemaDePagamento(false);
        sistemaAntigo.realizarPagamento(100.00);
        
        SistemaDePagamento sistemaNovo = new SistemaDePagamento(true);
        sistemaNovo.realizarPagamento(200.00);
    }
}
