package Ex2;

public class Imposto {
    public void calcularTotalComImposto(Venda venda){
        double imposto = venda.getValor() * 0.1;
        System.out.println("Total com impsoto: " + (venda.getValor() + imposto));

    }

}
