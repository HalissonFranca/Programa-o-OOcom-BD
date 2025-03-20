package Ex2;

public class Venda {
    private double valor;
    private String produto;

    public Venda(double valor, String produto) {
        this.valor = valor;
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
