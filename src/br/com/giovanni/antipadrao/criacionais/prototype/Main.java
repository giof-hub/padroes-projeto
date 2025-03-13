package br.com.giovanni.antipadrao.criacionais.prototype;

/**
 *
 * @author giovanni.5160
 */
public class Main {
    public static void main(String[] args) {
        Documento doc1 = new Documento("Titulo", "Conteudo");
        Documento doc2 = doc1.clonar();
        
        doc2.titulo = "Titulo 2";
        doc2.conteudo = "Conteudo 2";
        
        doc2.exibir();
        doc1.exibir();
    }
}
