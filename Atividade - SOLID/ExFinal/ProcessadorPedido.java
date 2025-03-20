package ExFinal;

import java.util.List;

public class ProcessadorPedido {
    private Desconto desconto;
    private List<Notificacao> notificacoes;
    private Exibicao exibicao;

    public ProcessadorPedido(Desconto desconto, List<Notificacao> notificacoes, Exibicao exibicao) {
        this.desconto = desconto;
        this.notificacoes = notificacoes;
        this.exibicao = exibicao;
    }

    public void processar(Pedido pedido) {
        double precoFinal = desconto.aplicar(pedido.getPreco());
        String mensagem = "Pedido: " + pedido.getProduto() + ", Preço final: R$" + precoFinal;

        exibicao.exibir(mensagem);

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar(mensagem);
        }
    }
}
