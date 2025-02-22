package ControleEstoqueProduto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Camiseta");

        produto.setPreco(29.90);
        produto.setQuantidadeEstoque(10);

        System.out.println("Produto: " + produto.getNome() + ", Preço: " + produto.getPreco() + ", Quantidade: " + produto.getQuantidadeEstoque());
        produto.adicionarEstoque(5);
        produto.removerEstoque(12);
        produto.removerEstoque(3);
        System.out.println();

    }
}
