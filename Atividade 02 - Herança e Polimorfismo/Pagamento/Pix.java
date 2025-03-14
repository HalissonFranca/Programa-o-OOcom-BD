package Pagamento;

public class Pix extends Pagamento implements MeioPagamento {
    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " via Pix");
    }

    @Override
    void confirmarPagamento() {
        System.out.println("Pagamento instantâneo confirmado");
    }
}
