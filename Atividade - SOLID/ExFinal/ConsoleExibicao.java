package ExFinal;

public class ConsoleExibicao implements Exibicao {
    public void exibir(String mensagem) {
        System.out.println("Console: " + mensagem);
    }
}