package Ex10;

public class Main {
    public static void main(String[] args) {
        System.out.println("Maquina");
        Maquina m1 = new Maquina();
        m1.ligar();
        m1.processarMaterial();

        System.out.println("\nMaquina Manual");
        MaquinaManual m2 = new MaquinaManual();
        m2.ligar();

    }
}
