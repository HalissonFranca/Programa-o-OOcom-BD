package Funcionario;

public class Gerente extends Funcionario implements Treinavel{
    @Override
    public void calcularBonus(float salario) {
        float bonus = (float) (salario * 0.2);
        System.out.println(bonus);
    }

    @Override
    public void realizarTreinamento() {

        System.out.println("Treinamento de liderança");
    }
}
