package br.com.giovanni.antipadrao.estruturais.bridge;

/**
 *
 * @author giovanni.5160
 */
public class Principal {
    public static void main(String[] args) {
        TvComControleBasico tvBasica = new TvComControleBasico();
        tvBasica.ligar();
        
        RadioComControleAvancado radioBasico = new RadioComControleAvancado();
        radioBasico.sintonizarEstacao(103.7);
    }
}
