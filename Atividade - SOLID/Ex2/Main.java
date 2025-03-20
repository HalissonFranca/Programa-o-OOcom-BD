package Ex2;

public class Main {
    public static void main(String[] args) {
        Venda venda1 = new Venda(100, "Coberto");

        Imposto impsoto = new Imposto();
        impsoto.calcularTotalComImposto(venda1);

        Recibo recibo = new Recibo();
        recibo.gerarRecibo(venda1);
    }
}
