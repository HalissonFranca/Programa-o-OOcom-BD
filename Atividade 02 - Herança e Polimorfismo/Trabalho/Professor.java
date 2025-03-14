package Trabalho;

public class Professor implements Trabalhador{
    @Override
    public String trabalho() {
        return "Ensinando aulas";
    }

    @Override
    public String receberSalario() {
        return "Salario: R$ 5.000,00";
    }
}
