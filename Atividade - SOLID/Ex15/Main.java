package Ex15;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new PagamentoCartao();
        Caixa caixa = new Caixa(pagamento);

        caixa.processar(100.0);
    }
}

