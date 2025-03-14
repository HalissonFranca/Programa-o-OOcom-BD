package Mensagem;

public class Main {
    public static void main(String[] args){
        Mensagem msg = new Mensagem();

        System.out.println("Mensagem sem parametros: ");
        msg.exibirMensagem();

        System.out.println("Mensagem com parametro de texto 'Bem vindo': ");
        msg.exibirMensagem("Bem vindo");

        System.out.println("Mensagem com parametros de texto 'Ola Halisson' e 10 repetições: ");
        msg.exibirMensagem("Ola! Halisson", 10);
    }
}
