package Ex4;

public class Main {
    public static void main(String[] args) {

        System.out.println("Estagiario: ");
        Funcionario funcionario = new Funcionario("estagiario", 1390);
        System.out.println(funcionario.calcularSalario(funcionario));

        System.out.println("Gerente");
        Funcionario gerente = new Funcionario("gerente", 1390);
        System.out.println(funcionario.calcularSalario(gerente));
    }

}
