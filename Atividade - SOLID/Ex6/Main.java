package Ex6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Normal: ");
        Produto produto = new Produto(5, "normal");
        System.out.println(produto.calcular(produto));

        System.out.println("\nExpress: ");
        Produto produto2 = new Produto(6, "expressa");
        System.out.println(produto.calcular(produto2));
    }
}
