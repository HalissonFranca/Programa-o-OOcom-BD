package Ex1;

import Ex1.Banco;
import Ex1.Estudante;
import Ex1.Exibir;

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Halisson", 21);

        Banco banco = new Banco();
        banco.salvarNoBanco(estudante1);

        Exibir exibir = new Exibir();
        exibir.exibir(estudante1);

    }
}