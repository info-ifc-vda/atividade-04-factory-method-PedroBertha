package pagamento;

public abstract class PagamentoFactory {
    public abstract Pagamento criarPagamento();

    public void executarPagamento(double valor, String descricao) {
        Pagamento pagamento = criarPagamento();
        System.out.println("=".repeat(50));
        System.out.println("Iniciando pagamento via " + pagamento.getNome());
        System.out.println("=".repeat(50));
        if (!pagamento.isDisponivel()) {
            System.out.println("[ERRO] Forma de pagamento indisponível.");
            return;
        }
        pagamento.processar(valor, descricao);
        System.out.println("Pagamento finalizado com sucesso.");
        System.out.println("=".repeat(50));
    }
}
