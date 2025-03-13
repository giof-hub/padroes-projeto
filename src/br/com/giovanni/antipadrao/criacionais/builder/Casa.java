package br.com.giovanni.antipadrao.criacionais.builder;

/**
 *
 * @author giovanni.5160
 */
public class Casa {
    private Integer parede;
    private String telhado;
    private Integer porta;
    private Integer janela;
    private String piscina;

    public Casa(Integer parede, String telhado, Integer porta, Integer janela) {
        this.parede = parede;
        this.telhado = telhado;
        this.porta = porta;
        this.janela = janela;
    }
    
    public void mostrarDetalhes() {
        System.out.println("Casa com " + parede + ", telhado " + telhado + ", " + porta + "portas e " + janela + "janelas");
    }
}
