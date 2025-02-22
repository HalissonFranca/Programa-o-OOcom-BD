package GerenciamentoFuncionario;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0){
            this.salario = salario;
        }else System.out.println("Tentativa de definir salário negativo: Salário inválido");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void aumentarSalario(double percentual){
        salario += salario * (percentual/100);
        System.out.println("Aumento de " + percentual + "% : Novo salario = R$" + salario);
    }
}
