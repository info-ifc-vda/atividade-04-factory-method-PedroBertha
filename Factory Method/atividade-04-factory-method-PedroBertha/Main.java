package pagamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║     SISTEMA DE PAGAMENTO — Factory Method    ║");
        System.out.println("╚═════════a═════════════════════════════════════╝\n");

        executar(new CartaoCreditoFactory(),   199.90, "Pedido #1001 — Tênis Esportivo");
        executar(new CartaoDebitoFactory(),     49.90, "Pedido #1002 — Livro Java Efetivo");
        executar(new BoletoFactory(),          850.00, "Pedido #1003 — Notebook Acessório");
        executar(new TransferenciaFactory("341","0001","123456-7"), 1500.00, "Pedido #1004 — Smartphone");
        executar(new PixFactory("pagamentos@loja.com.br"), 320.00, "Pedido #1005 — Fone Bluetooth");

        System.out.println("\n>>> Seleção dinâmica via enum:\n");
        TipoPagamento tipo = TipoPagamento.PIX;
        executar(tipo.getFactory("cliente@email.com"), 99.99, "Pedido #1006 — Capa para Tablet");
    }

    private static void executar(PagamentoFactory f, double valor, String desc) {
        f.executarPagamento(valor, desc);
        System.out.println();
    }
}
