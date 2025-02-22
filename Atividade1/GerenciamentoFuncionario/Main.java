package GerenciamentoFuncionario;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Halisson");
        funcionario.setSalario(5000);
        funcionario.setCargo("Gerente");

        System.out.println("Nome: " + funcionario.getNome() + ", Cargo: " + funcionario.getCargo() + ", Salario: " + funcionario.getSalario());
        funcionario.aumentarSalario(10);
        funcionario.setSalario(-1);
    }
}
