package SimuladorCarro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setModelo("Mustang");
        carro.setVelocidadeMaxima(200);

        System.out.println("Carro: " + carro.getModelo() + ", Velocidade maxima: " + carro.getVelocidadeMaxima());
        carro.acelerar(50);
        carro.acelerar(160);
        carro.frear(100);
    }
}
