package br.com.giovanni.criacionais.builder;

/**
 *
 * @author giovanni.5160
 */
public class Casa {
    
    private String parede;
    private String telhado;
    private int porta;
    private int janela;
    private Integer piscina;
    
    public Casa () {
        
    }

    public String getParede() {
        return parede;
    }

    public void setParede(String parede) {
        this.parede = parede;
    }

    public String getTelhado() {
        return telhado;
    }

    public void setTelhado(String telhado) {
        this.telhado = telhado;
    }

    public int getPorta() {
        return porta;
    }

    public void setPorta(int porta) {
        this.porta = porta;
    }

    public int getJanela() {
        return janela;
    }

    public void setJanela(int janela) {
        this.janela = janela;
    }

    public Integer getPiscina() {
        return piscina;
    }

    public void setPiscina(Integer piscina) {
        this.piscina = piscina;
    }

    public Casa(Builder builder) {
        this.parede = builder.parede;
        this.telhado = builder.telhado;
        this.porta = builder.porta;
        this.janela = builder.janela;
        this.piscina = builder.piscina;
    }

    @Override
    public String toString() {
        return "Casa com parede: " + parede + 
                ", telhado: " + telhado + 
                ", porta: " + porta + 
                ", janela: " + janela + 
                ", piscina: " + piscina;
    }
}
