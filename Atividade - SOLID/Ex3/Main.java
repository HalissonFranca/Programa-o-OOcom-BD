package Ex3;

public class Main {
    public static void main(String[] args) {
        Notificacao nt = new Notificacao("Boa noite!");

        FormatarMensagem formatar = new FormatarMensagem();
        formatar.formatarMensagem(nt);

        EvnviarMensagem enviar = new EvnviarMensagem();
        enviar.enviarMensagem(nt);
    }
}
