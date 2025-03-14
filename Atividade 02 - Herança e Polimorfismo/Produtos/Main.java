package Produtos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Livro livro = new Livro();
        Eletronico eletronico = new Eletronico();

        produtos.add(livro);
        produtos.add(eletronico);

        System.out.println("Preços originais:");
        for (Produto produto : produtos) {
            System.out.println(produto.getClass().getSimpleName() + ": R$ " + produto.calcularPreco());
        }


        livro.aplicarDesconto(10);
        eletronico.aplicarDesconto(20);

        System.out.println("\nPreços após desconto:");
        for (Produto produto : produtos) {
            System.out.println(produto.getClass().getSimpleName() + ": R$ " + produto.calcularPreco());
        }
    }
}