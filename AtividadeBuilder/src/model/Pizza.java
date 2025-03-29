package model;

public class Pizza {
    // Atributos obrigatórios
    private final String tamanho; // "pequena", "média", "grande"
    private final String tipoMassa; // "fina", "grossa"
    // Atributos opcionais
    private final String molho; // "tomate", "branco", null se não houver
    private final String[] ingredientes; // array de ingredientes
    private final boolean bordaRecheada; // true ou false
    private final String bebida; // bebida acompanhante ou null
    private final int quantidadeFatia; //quantidade fatia
    private final String tipoQueijoExtra; // queijo extra?
    private Pizza(Builder builder) {
        this.tamanho = builder.tamanho;
        this.tipoMassa = builder.tipoMassa;
        this.molho = builder.molho;
        this.ingredientes = builder.ingredientes;
        this.bordaRecheada = builder.bordaRecheada;
        this.bebida = builder.bebida;
        this.quantidadeFatia = builder.quantidadeFatia;
        this.tipoQueijoExtra = builder.tipoQueijoExtra;
    }
    // Getters
    public String getTamanho() { return tamanho; }
    public String getTipoMassa() { return tipoMassa; }
    public String getMolho() { return molho; }
    public String[] getIngredientes() { return ingredientes; }
    public boolean isBordaRecheada() { return bordaRecheada; }
    public String getBebida() { return bebida; }
    public int getQuantidadeFatia() { return quantidadeFatia; }

    public String getTipoQueijoExtra() {
        return tipoQueijoExtra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza [Tamanho: ").append(tamanho)
                .append(", Massa: ").append(tipoMassa)
                .append(", Molho: ").append(molho != null ? molho : "sem molho")
                .append(", Ingredientes: ").append(String.join(", ", ingredientes))
                .append(", Borda Recheada: ").append(bordaRecheada ? "sim" : "não")
                .append(", Bebida: ").append(bebida != null ? bebida : "sem bebida")
                .append(", Quantidade Fatias: ").append(quantidadeFatia)
                .append(", Queijo Extra: ").append(tipoQueijoExtra)
                .append("]");

        return sb.toString();
    }
    // Classe Builder interna
    public static class Builder {
        // Obrigatórios
        private final String tamanho;
        private final String tipoMassa;
        // Opcionais (valores padrão)
        private String molho = null;
        private String[] ingredientes = new String[]{};
        private boolean bordaRecheada = false;
        private String bebida = null;
        private int quantidadeFatia = 0;
        private String tipoQueijoExtra = null;
        public Builder(String tamanho, String tipoMassa) {
            this.tamanho = tamanho;
            this.tipoMassa = tipoMassa;
        }
        public Builder comMolho(String molho) {
            this.molho = molho;
            return this;
        }
        public Builder comIngredientes(String[] ingredientes) {
            this.ingredientes = ingredientes;
            return this;
        }
        public Builder comBordaRecheada(boolean bordaRecheada) {
            this.bordaRecheada = bordaRecheada;
            return this;
        }
        public Builder comBebida(String bebida) {
            this.bebida = bebida;
            return this;
        }
        public Builder comQuantasFatias(int fatia){
            this.quantidadeFatia = fatia;
            return this;
        }
        public Builder comQueijoExtra(String tipoQueijoExtra){
            this.tipoQueijoExtra = tipoQueijoExtra;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }
}