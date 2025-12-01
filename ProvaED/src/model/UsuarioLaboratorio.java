package model;

public class UsuarioLaboratorio extends Usuario{
    private String nomeProjeto;
    private int id;

    public UsuarioLaboratorio(String nome, int idade, String nomeProjeto, int id) {
        super(nome, idade);
        this.nomeProjeto = nomeProjeto;
        this.id = id;
    }

    public UsuarioLaboratorio() {
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
