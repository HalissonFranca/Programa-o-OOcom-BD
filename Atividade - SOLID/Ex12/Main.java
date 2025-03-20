package Ex12;

public class Main {
    public static void main(String[] args) {
        System.out.println("Caneta");
        Caneta caneta = new Caneta();
        caneta.escrever();

        System.out.println("\nLapis");
        Lapis lapis = new Lapis();
        lapis.escrever();
        lapis.apagar();
    }
}
