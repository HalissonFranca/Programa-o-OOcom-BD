package Calculadora;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        System.out.println("CALCULADORA");

        Calculadora c = new Calculadora();

        System.out.println("Soma 2 inteiro:");
        System.out.println(c.somar(5, 7));

        System.out.println("\nSoma 2 double:");
        System.out.println(c.somar(6.1, 4.2));

        System.out.println("\nSomar 3 inteiros");
        System.out.println(c.somar(4,7,9));
    }
}