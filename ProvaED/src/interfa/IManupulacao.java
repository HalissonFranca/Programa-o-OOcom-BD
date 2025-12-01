package interfa;

import model.Usuario;

public interface IManupulacao {
    public void Cadastro(Usuario user);
    public void atendimento(Usuario user);
    public Usuario ultimoAtendiso();
    public void stado();

}
