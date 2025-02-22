package ControleEstoqueProduto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        if (preco > 0){
            this.preco = preco;
        }else System.out.println("preço não pode ser negativo.");
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public void adicionarEstoque(int qtd) {
        this.quantidadeEstoque += qtd;
        System.out.println("Adicionado " + qtd + " ao estoque: Estoque atual = " + this.quantidadeEstoque);
    }
    public void removerEstoque(int qtd) {
        if (qtd < this.quantidadeEstoque){
            this.quantidadeEstoque -= qtd;
            System.out.println("Removendo " + qtd + " unidades: Estoque atual = " + this.quantidadeEstoque);
        }else System.out.println("Tentativa de remover " + qtd + " unidades: Estoque insuficiente");

    }
}
