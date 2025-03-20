package Ex8;

public class ContaSaqueEDeposito implements Conta{
    protected double saldo;
    @Override
    public void depositar(double valor) {
        System.out.println("Depositando: " + valor);
    }

    public void sacar(double valor) {
        System.out.println("Sacando: " + valor);
    }

}
