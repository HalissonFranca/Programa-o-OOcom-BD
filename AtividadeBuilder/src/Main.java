import model.*;
public class Main {
    public static void main(String[] args) {
// Teste 1: Pizza simples
        Pizza pizzaSimples = new Pizza.Builder("média", "fina")
                .comMolho("tomate")
                .comIngredientes(new String[]{"queijo", "calabresa"})
                .comQuantasFatias(6)
                .comQueijoExtra("Mussarela")
                .build();
        System.out.println("Pizza Simples: " + pizzaSimples);
// Teste 2: Pizza completa
        Pizza pizzaCompleta = new Pizza.Builder("grande", "grossa")
                .comMolho("branco")
                .comIngredientes(new String[]{"queijo", "frango", "catupiry"})
                .comBordaRecheada(true)
                .comBebida("refrigerante")
                .comQuantasFatias(4)
                .comQueijoExtra("Gorgonzola")
                .build();
        System.out.println("Pizza Completa: " + pizzaCompleta);
    }
}



