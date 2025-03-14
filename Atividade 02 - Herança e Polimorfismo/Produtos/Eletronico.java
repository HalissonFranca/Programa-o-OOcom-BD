package Produtos;

public class Eletronico extends Produto implements Descontavel {
    private double precoBase = 500.0;

    @Override
    public double calcularPreco() {
        return precoBase;
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        precoBase -= precoBase * (porcentagem / 100);
    }
}
