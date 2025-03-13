package br.com.giovanni.antipadrao.estruturais.composite;

/**
 *
 * @author giovanni.5160
 */
public class Fardo {
    private String nome;
    private Caixa caixa;
    private int quantidade;

    public Fardo(String nome, Caixa caixa, int quantidade) {
        this.nome = nome;
        this.caixa = caixa;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return caixa.getPreco() * quantidade;
    }

    public String getNome() {
        return nome;
    }
}