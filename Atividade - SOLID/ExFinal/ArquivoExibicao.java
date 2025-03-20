package ExFinal;

public class ArquivoExibicao implements Exibicao {
    public void exibir(String mensagem) {
        System.out.println("(Salvando em arquivo): " + mensagem);
    }
}
