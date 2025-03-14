package CalcularArea;
import java.util.Scanner;
public class Circulo implements CalcularArea{
    Scanner sc = new Scanner(System.in);
    @Override
    public void calcularArea() {
        System.out.print("Digite o raio do circulo: ");
        double raio = sc.nextDouble();

        double resultado = 3.14 * (raio * raio);
        System.out.println(resultado);
    }
}
