package RegistroAluno;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Halisson Franca");
        aluno.setAtricula(12345);
        aluno.setNotaFinal(8);

        System.out.println("Aluno: " + aluno.getNome() + ", Matrícula: " + aluno.getAtricula() + ", Nota: " + aluno.getNotaFinal());
        aluno.verificarAprovacao();

        aluno.setNotaFinal(11);

    }
}
