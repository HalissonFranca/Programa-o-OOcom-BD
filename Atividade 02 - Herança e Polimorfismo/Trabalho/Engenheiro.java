package Trabalho;

public class Engenheiro implements Trabalhador{
    @Override
    public String trabalho() {
        return "Projetando Sistema";
    }

    @Override
    public String receberSalario() {
       return "Salario: R$ 10.000,00";
    }
}
