package br.com.giovanni.estruturais.composite;

/**
 *
 * @author giovanni.5160
 */
public class Produto implements Item{

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
