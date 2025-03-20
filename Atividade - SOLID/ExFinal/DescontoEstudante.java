package ExFinal;

public class DescontoEstudante implements Desconto {
    public double aplicar(double preco) {
        return preco * 0.9; // 10% de desconto
    }
}
