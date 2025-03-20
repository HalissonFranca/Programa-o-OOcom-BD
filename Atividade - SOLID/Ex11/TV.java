package Ex11;

public class TV implements Dispositivo, DispositivosConectavel{
    @Override
    public void ligar() {
        System.out.println("Dispositivo TV Ligado");
    }

    @Override
    public void conectarInternet() {
        System.out.println("Dispositivo TV conectado a internet");
    }
}
