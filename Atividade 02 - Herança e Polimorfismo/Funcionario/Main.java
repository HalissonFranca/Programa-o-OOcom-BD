package Funcionario;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Treinavel gerent = new Gerente();

        Funcionario desenvolvedor = new Desenvolvedor();
        Treinavel desenvolvedo = new Desenvolvedor();

        System.out.println("Gerente");
        gerente.calcularBonus(1500);
        gerent.realizarTreinamento();

        System.out.println("\nDesenvolvedor ");
        desenvolvedor.calcularBonus(1500);
        desenvolvedo.realizarTreinamento();
    }
}
