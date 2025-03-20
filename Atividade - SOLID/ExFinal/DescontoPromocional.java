package ExFinal;

public class DescontoPromocional implements Desconto {
    public double aplicar(double preco) {
        return preco * 0.8; // 20% de desconto
    }
}
