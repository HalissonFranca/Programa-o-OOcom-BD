package SimuladorCarro;

public class Carro {
    private String modelo;
    private int velocidadeAtual = 0;
    private int velocidadeMaxima;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;

    }

    public int getVelocidadeAtual() {

        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;

    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void acelerar(int incremento){
        if (incremento > 0 && incremento <= 150) {
            this.velocidadeAtual += incremento;
            System.out.println("Acelerando " + incremento + "Km/h: Velocidade atual = " + velocidadeAtual + "Km/h");

        }else if (velocidadeAtual <= velocidadeMaxima) {
            this.velocidadeAtual = velocidadeMaxima;
            System.out.println("Acelerando " + incremento + "Km/h: Velocidade atual = " + velocidadeAtual + "Km/h" + "(Limite atingido)");

        }else System.out.println("não entrou");
    }
    public void frear(int incremento){
        this.velocidadeAtual -= incremento;
        System.out.println("Freando " + incremento + "Km/h: Velocidade atual = " + velocidadeAtual);
    }
}
