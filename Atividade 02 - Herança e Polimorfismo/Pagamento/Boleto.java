package Pagamento;

public class Boleto extends Pagamento implements MeioPagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$ " + valor);
    }

    @Override
    void confirmarPagamento() {
        System.out.println("Aguardando compensação");
    }
}
