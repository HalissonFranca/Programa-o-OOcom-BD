package Ex5;

public class Texto extends FormatarTexto{
    private String texto;
    private String estilo;

    public Texto(String texto, String estilo) {
        this.texto = texto;
        this.estilo = estilo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
}
