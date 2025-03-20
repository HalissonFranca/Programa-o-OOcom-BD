package Ex9;

public class Impressora implements Imprimir{
    @Override
    public void imprimir(String texto) {
        System.out.println("Imprimindo: " + texto);
    }
}
