package interfa;

import model.Usuario;

public interface Estruturas {
    public Usuario adicionar(Usuario user);
    public int tamanho();
    public boolean estavazio();
    public void remover();
    public Usuario peek();
}
