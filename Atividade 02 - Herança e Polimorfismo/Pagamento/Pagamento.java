package Pagamento;

public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    abstract void confirmarPagamento();
}
