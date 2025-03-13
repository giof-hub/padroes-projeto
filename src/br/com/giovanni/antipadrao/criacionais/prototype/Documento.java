package br.com.giovanni.antipadrao.criacionais.prototype;

/**
 *
 * @author giovanni.5160
 */
public class Documento {
    public String titulo;
    public String conteudo;

    public Documento(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }
    
    public void exibir() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Conteúdo: " + this.conteudo);
    }
    
    public Documento clonar() {
        return this;
    }
}
