package Ex8;

public class Main {
    public static void main(String[] args) {
        System.out.println("Conta com saque e deposito: ");
        ContaSaqueEDeposito saqueEDeposito = new ContaSaqueEDeposito();
        saqueEDeposito.depositar(100);
        saqueEDeposito.sacar(50);

        System.out.println("\nConta somente com deposito: ");
        ContaSomenteDeposito somenteDeposito = new ContaSomenteDeposito();
        somenteDeposito.depositar(200);

    }
}
