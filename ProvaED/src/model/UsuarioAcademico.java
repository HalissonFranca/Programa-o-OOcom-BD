package model;

public class UsuarioAcademico extends Usuario{
    private int matricula;
    private String curso;

    public UsuarioAcademico(String nome, int idade, int matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public UsuarioAcademico() {

    }

}
