package Contabancaria;

import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class Main {
    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o nome do Titular: ");
        conta.setTitular(dado.nextLine());

        System.out.print("Digite o numero da Conta: ");
        conta.setNumeroConta(dado.nextLine());

        System.out.print("Digite o valor a ser depositado: ");
        conta.depositar(dado.nextDouble());

        System.out.print("Digite o valor a ser sacado: ");
        conta.saques(dado.nextDouble());

        System.out.print("Digite o valor a ser sacado: ");
        conta.saques(dado.nextDouble());


        conta.info();

    }
}