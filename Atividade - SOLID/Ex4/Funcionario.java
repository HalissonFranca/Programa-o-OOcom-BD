package Ex4;

public class Funcionario extends Calculos{
    private String tipoFuncionario;
    private double salarioBase;

    public Funcionario(String tipoFuncionario, double salarioBase) {
        this.tipoFuncionario = tipoFuncionario;
        this.salarioBase = salarioBase;
    }

    public String getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}
