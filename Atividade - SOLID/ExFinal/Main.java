package ExFinal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Notebook", 3000);

        Desconto desconto = new DescontoEstudante();
        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new EmailNotificacao());
        notificacoes.add(new SMSNotificacao());

        Exibicao exibicao = new ConsoleExibicao();

        ProcessadorPedido processador = new ProcessadorPedido(desconto, notificacoes, exibicao);
        processador.processar(pedido);
    }
}
