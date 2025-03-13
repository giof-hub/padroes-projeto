package br.com.giovanni.estruturais.composite;

/**
 *
 * @author giovanni.5160
 */
public class Principal {
    public static void main(String[] args) {
        Produto cerveja = new Produto("Cerveja 350ml", 3.99);
        
        Embalagem caixaCerveja = new Embalagem("Caixa Cerveja (12 unidades)");
        for (int i = 0; i < 12; i++) {
            caixaCerveja.adicionarItem(cerveja);
        }
        
        Embalagem fardoCerveja = new Embalagem("Fardo Cerveja (24 unidades)");
        for (int i = 0; i < 24; i++) {
            fardoCerveja.adicionarItem(caixaCerveja);
        }
        
        Embalagem carrinho = new Embalagem("Carrinho de Compra");
        carrinho.adicionarItem(cerveja);
        carrinho.adicionarItem(caixaCerveja);
        carrinho.adicionarItem(fardoCerveja);
        
        carrinho.listarItens();
        
        System.out.println("Total da compra: " + carrinho.getPreco());
        
        Produto leite = new Produto("Leite 1L", 5.49);
        Embalagem caixaLeite = new Embalagem("Carrinho de compras leite");
        for (int i = 0; i < 24; i++) {
            caixaLeite.adicionarItem(leite);
        }
        
        Embalagem carrinho2 = new Embalagem("Carrinho de compras leite");
        carrinho2.adicionarItem(caixaLeite);
        carrinho2.adicionarItem(caixaLeite);
        carrinho2.adicionarItem(caixaLeite);
        
        carrinho2.listarItens();
        
        System.out.println("Total carrinho2: " + carrinho2.getPreco());
    }
}
