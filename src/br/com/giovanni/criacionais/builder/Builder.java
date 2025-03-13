package br.com.giovanni.criacionais.builder;

/**
 *
 * @author giovanni.5160
 */
public class Builder {
    
    String parede;
    String telhado;
    int porta;
    int janela;
    Integer piscina;
    
    
    
    public Builder comParedes(String parede) {
        this.parede = parede;
        return this;
    }
    
    public Builder comTelhado(String telhado) {
        this.telhado = telhado;
        return this;
    }
    
    public Builder comPorta(int porta) {
        this.porta = porta;
        return this;
    }
    
    public Builder comJanela(int janela) {
        this.janela = janela;
        return this;
    }
    
    public Builder comPiscina(Integer piscina) {
        this.piscina = piscina;
        return this;
    }
    
    public Casa build() {
        return new Casa(this);
    }
}
