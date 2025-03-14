package Produtos;

class Livro extends Produto implements Descontavel {
    private double precoBase = 50.0;

    @Override
    public double calcularPreco() {
        return precoBase;
    }

    @Override
    public void aplicarDesconto(double porcentagem) {
        precoBase -= precoBase * (porcentagem / 100);
    }
}
