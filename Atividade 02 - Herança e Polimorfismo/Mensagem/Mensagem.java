package Mensagem;

public class Mensagem {

    public void exibirMensagem(){
        System.out.println("Olá, mundo");
    }

    public void exibirMensagem(String texto){
        System.out.println(texto);
    }

    public void exibirMensagem(String texto, int repeticao){
        for (int i = 0; i < repeticao; i++){
            System.out.println(texto);
        }
    }
}
