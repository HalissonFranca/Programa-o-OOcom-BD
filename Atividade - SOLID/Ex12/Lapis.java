package Ex12;

public class Lapis implements FerramentaEscrever, FerramentaApagar{

    @Override
    public void apagar() {
        System.out.println("Apagando com borracha do lapis");
    }

    @Override
    public void escrever() {
        System.out.println("Escrevendo com lapis");
    }
}
