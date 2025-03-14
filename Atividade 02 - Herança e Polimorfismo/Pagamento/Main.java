package Pagamento;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MeioPagamento> pagamentos = new ArrayList<>();

        MeioPagamento pagamentoCartao = new CartaoCredito(100.0);
        MeioPagamento pagamentoBoleto = new Boleto(200.0);
        MeioPagamento pagamentoPix = new Pix(300.0);

        pagamentos.add(pagamentoCartao);
        pagamentos.add(pagamentoBoleto);
        pagamentos.add(pagamentoPix);

        for (MeioPagamento pagamento : pagamentos) {
            pagamento.processarPagamento(((Pagamento) pagamento).valor);
            ((Pagamento) pagamento).confirmarPagamento();
            System.out.println("------------------------");
        }
    }
}
