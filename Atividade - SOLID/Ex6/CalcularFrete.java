package Ex6;

public class CalcularFrete {
    public double calcular(Produto produto){
        if (produto.getTipoEntrega().equals("normal")){
            return produto.getPeso() * 5;
        } else if (produto.getTipoEntrega().equals("expressa")){
            return produto.getPeso() * 10;
        }
        return 0;
    }
}
