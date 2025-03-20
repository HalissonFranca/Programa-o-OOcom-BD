package Ex11;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dispositivo comun");
        Radio radio = new Radio();
        radio.ligar();

        System.out.println("\nDispositivo conectado a internet");
        TV tv = new TV();
        tv.ligar();
        tv.conectarInternet();
    }
}
