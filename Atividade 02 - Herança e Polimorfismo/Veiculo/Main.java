package Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        System.out.println("Moto: ");
        System.out.println(moto.acelerar());

        System.out.println("Carro: ");
        System.out.println(carro.acelerar());
    }
}
