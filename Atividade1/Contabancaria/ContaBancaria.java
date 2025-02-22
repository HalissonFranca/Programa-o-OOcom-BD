package Contabancaria;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria() {

    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
        System.out.println("Conta " + numeroConta + " criado com sucesso!\n");
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
            this.saldo = saldo;

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
        System.out.println("Titular " + titular + " criado com sucesso!\n");
    }
    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
            System.out.println(valor + " realizado com sucesso\n");
        } else {
            System.out.println("\nSaldo tem que ser positivo");
        }

    }
    public void saques(double valor) {
        if (valor < saldo){
            this.saldo -= valor;
            System.out.println(valor + " saque com sucesso\n");
        }else{
            System.out.println("\nSaldo insuficiente");
        }

    }
    public void info(){
        System.out.println("\nNumero Conta: " + numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: R$" + this.saldo);


    }
}
