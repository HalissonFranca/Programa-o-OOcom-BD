package model;

public class UsuarioSuporte extends Usuario{
    private String descricaoProblema;
    private int id;

    public UsuarioSuporte(String nome, int idade, String descricaoProblema, int id) {
        super(nome, idade);
        this.descricaoProblema = descricaoProblema;
        this.id = id;
    }

    public UsuarioSuporte() {

    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
