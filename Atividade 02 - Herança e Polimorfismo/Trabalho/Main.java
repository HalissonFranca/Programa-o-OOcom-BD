package Trabalho;

public class Main {
    public static void main(String[] args) {
        Trabalhador engenheiro = new Engenheiro();
        Trabalhador professor = new Professor();

        System.out.println("Engenheiro");
        System.out.println(engenheiro.trabalho());
        System.out.println(engenheiro.receberSalario());

        System.out.println("\nProfessor");
        System.out.println(professor.trabalho());
        System.out.println(professor.receberSalario());


    }
}
