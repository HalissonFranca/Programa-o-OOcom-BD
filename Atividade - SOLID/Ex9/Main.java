package Ex9;

public class Main {
    public static void main(String[] args) {
        System.out.println("Impressora que imprime: ");
        Impressora imp1 = new Impressora();
        imp1.imprimir("Boa noite Garela!");

        System.out.println("\nImpressora que somente liga: ");
        ImpressoraBasica imp2 = new ImpressoraBasica();
        imp2.ligar("ligar");
    }
}
