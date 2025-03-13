package br.com.giovanni.antipadrao.estruturais.composite;

/**
 *
 * @author giovanni.5160
 */
public class Caixa {
    private String nome;
    private Produto produto;
    private int quantidade;

    public Caixa(String nome, Produto produto, int quantidade) {
        this.nome = nome;
        this.produto = produto;
        this.quantidade = quantidade;
    }    
    
    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return produto.getPreco() * quantidade;
    }
}
