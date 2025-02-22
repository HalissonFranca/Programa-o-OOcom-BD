package RegistroAluno;

public class Aluno {
    private int atricula;
    private String nome;
    private double notaFinal;

    public Aluno() {
    }

    public int getAtricula() {
        return atricula;
    }

    public void setAtricula(int atricula) {
        this.atricula = atricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        if(notaFinal >= 0 && notaFinal <= 10){
            this.notaFinal = notaFinal;
        }else System.out.println("Tentativaded definir nota " + notaFinal + ": Nota inválida");
    }
    public void verificarAprovacao(){
        if (notaFinal >= 7){
            System.out.println("Situação Aprovado");
        }else System.out.println("Situação Aprovado");
    }
}
