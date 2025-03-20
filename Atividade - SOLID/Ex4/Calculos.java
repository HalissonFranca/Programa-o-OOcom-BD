package Ex4;

public abstract class Calculos {
    public double calcularSalario(Funcionario funcionario) {
        if (funcionario.getTipoFuncionario().equals("estagiario")) {
            return funcionario.getSalarioBase() * 0.8;
        }else if (funcionario.getTipoFuncionario().equals("gerente")) {
            return funcionario.getSalarioBase() * 1.2;
        }
        return 0;
    }
}
