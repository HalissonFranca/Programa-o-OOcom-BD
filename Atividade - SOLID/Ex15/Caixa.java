package Ex15;

public class Caixa {
    private Pagamento pagamento;

    public Caixa(Pagamento p) {
        this.pagamento = p;
    }
    public void processar(double valor){
        pagamento.executar(valor);
    }
}
