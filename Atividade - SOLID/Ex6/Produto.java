package Ex6;

public class Produto extends CalcularFrete{
    private double peso;
    private String tipoEntrega;

    public Produto(double peso, String tipoEntrega) {
        this.peso = peso;
        this.tipoEntrega = tipoEntrega;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }
}
