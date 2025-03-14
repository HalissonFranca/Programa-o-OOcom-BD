package Pagamento;

public class CartaoCredito extends Pagamento implements MeioPagamento {
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " via cartão");
    }

    @Override
    void confirmarPagamento() {
        System.out.println("Pagamento confirmado");
    }
}