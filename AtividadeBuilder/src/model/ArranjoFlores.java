package model;

public class ArranjoFlores {
    // Atributos obrigatórios
    private final String tipoArranjo;
    private final int quantidadeFlores;

    // Atributos opcionais
    private final String tipoFlorPrincipal;
    private final String embalagem;
    private final String cartaoMensagem;
    private final boolean entregaExpressa;

    private ArranjoFlores(Builder builder) {
        this.tipoArranjo = builder.tipoArranjo;
        this.quantidadeFlores = builder.quantidadeFlores;
        this.tipoFlorPrincipal = builder.tipoFlorPrincipal;
        this.embalagem = builder.embalagem;
        this.cartaoMensagem = builder.cartaoMensagem;
        this.entregaExpressa = builder.entregaExpressa;
    }

    @Override
    public String toString() {
        return "ArranjoFlores [" +
                "tipoArranjo='" + tipoArranjo + '\'' +
                ", quantidadeFlores=" + quantidadeFlores +
                ", tipoFlorPrincipal='" + (tipoFlorPrincipal != null ? tipoFlorPrincipal : "Não especificado") + '\'' +
                ", embalagem='" + (embalagem != null ? embalagem : "Nenhuma") + '\'' +
                ", cartaoMensagem='" + (cartaoMensagem != null ? cartaoMensagem : "Nenhuma") + '\'' +
                ", entregaExpressa=" + entregaExpressa +
                ']';
    }

    // Classe interna Builder
    public static class Builder {
        // Atributos obrigatórios
        private final String tipoArranjo;
        private final int quantidadeFlores;

        // Atributos opcionais (valores padrão nulos ou falsos)
        private String tipoFlorPrincipal;
        private String embalagem;
        private String cartaoMensagem;
        private boolean entregaExpressa;

        public Builder(String tipoArranjo, int quantidadeFlores) {
            this.tipoArranjo = tipoArranjo;
            this.quantidadeFlores = quantidadeFlores;
        }

        public Builder tipoFlorPrincipal(String tipoFlorPrincipal) {
            this.tipoFlorPrincipal = tipoFlorPrincipal;
            return this;
        }

        public Builder embalagem(String embalagem) {
            this.embalagem = embalagem;
            return this;
        }

        public Builder cartaoMensagem(String cartaoMensagem) {
            this.cartaoMensagem = cartaoMensagem;
            return this;
        }

        public Builder entregaExpressa(boolean entregaExpressa) {
            this.entregaExpressa = entregaExpressa;
            return this;
        }

        public ArranjoFlores build() {
            return new ArranjoFlores(this);
        }
    }
}