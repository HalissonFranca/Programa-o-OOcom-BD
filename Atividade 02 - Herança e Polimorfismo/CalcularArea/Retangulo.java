package CalcularArea;
import java.util.Scanner;

public class Retangulo implements CalcularArea{
    Scanner sc = new Scanner(System.in);
    @Override
    public void calcularArea() {
        System.out.print("Digite a largura do retangulo: ");
        double largura = sc.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double altura = sc.nextDouble();

        double resultado = 3.14 * (largura * altura);
        System.out.println(resultado);
    }
}
