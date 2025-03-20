package Ex3;

public class FormatarMensagem {
    public void formatarMensagem(Notificacao notificacao) {
        notificacao.setMensagem("[NOTIFICAÇÃO] " +  notificacao.getMensagem());
    }
}
