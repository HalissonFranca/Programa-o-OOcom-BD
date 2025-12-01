package estrutura;

import interfa.Estruturas;
import model.Usuario;

public class Fila implements Estruturas {
    private Usuario usuarios[];
    private int tamanho;
    private int inicio;
    private int fim;

    public Fila(int capacidade) {
        this.usuarios = new Usuario[capacidade];
        this.tamanho = 0;
        this.inicio = -1;
        this.fim = 0;
    }

    @Override
    public Usuario adicionar(Usuario user) {
        if (tamanho == usuarios.length -1){
            throw new RuntimeException("Fila cheia");
        }
        fim++;
        usuarios[fim] = user;
        tamanho++;
        return user;
    }

    @Override
    public int tamanho() {
        return tamanho;
    }

    @Override
    public boolean estavazio() {
        return tamanho == 0;
    }

    @Override
    public void remover() {
        if (estavazio()){
            throw new RuntimeException("Estavazia");
        }
        Usuario usu = usuarios[inicio];
        for (int i = 0;  usuarios.length < tamanho; i++){
            usuarios[i] = usuarios[i + 1];
        }

    }

    @Override
    public Usuario peek() {
        return usuarios[inicio];
    }
}
