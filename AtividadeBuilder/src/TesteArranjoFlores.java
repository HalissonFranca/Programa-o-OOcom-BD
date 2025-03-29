import model.ArranjoFlores;

public class TesteArranjoFlores {
    public static void main(String[] args) {
        // Criando um arranjo simples (apenas obrigatórios)
        ArranjoFlores arranjoSimples = new ArranjoFlores.Builder("Buquê", 12).build();

        // Criando um arranjo completo (todos os opcionais)
        ArranjoFlores arranjoCompleto = new ArranjoFlores.Builder("Cesta", 24)
                .tipoFlorPrincipal("Rosas Vermelhas")
                .embalagem("Papel")
                .cartaoMensagem("Feliz Aniversário!")
                .entregaExpressa(true)
                .build();

        // Exibindo os arranjos
        System.out.println(arranjoSimples);
        System.out.println(arranjoCompleto);
    }
}

