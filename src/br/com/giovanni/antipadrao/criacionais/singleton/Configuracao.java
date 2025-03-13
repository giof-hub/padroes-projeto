package br.com.giovanni.antipadrao.criacionais.singleton;

/**
 *
 * @author giovanni.5160
 */
public class Configuracao {
    
    public static Configuracao configuracao = new Configuracao();
    
    public String configuracaoSistema;
    
    public Configuracao() {
        this.configuracaoSistema = "Modo Escuro";
    }
}
