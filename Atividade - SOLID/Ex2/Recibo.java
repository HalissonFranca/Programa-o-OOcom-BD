package Ex2;

public class Recibo {
    public void gerarRecibo(Venda venda){
        System.out.println("Recibo - Produto: " + venda.getProduto() + ", Valor: " + venda.getValor());
    }

}
