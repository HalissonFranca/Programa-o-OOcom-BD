package Ex8;

public class ContaSomenteDeposito implements Conta {
    @Override
    public void depositar(double valor) {
        System.out.println("Depositando: " + valor);
    }
}
