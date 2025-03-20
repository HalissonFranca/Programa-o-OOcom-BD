package Ex15;

public class PagamentoCartao implements Pagamento{
    @Override
    public void executar(double valor) {
        System.out.println("Pagamentode R$" + valor+ " via cartão");
    }
}
