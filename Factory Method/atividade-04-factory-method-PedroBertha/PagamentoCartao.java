package pagamento;

class PagamentoCartao implements Pagamento {
    private final String tipoCartao;

    PagamentoCartao(String tipoCartao) { this.tipoCartao = tipoCartao; }

    @Override
    public void processar(double valor, String descricao) {
        System.out.printf("  Tipo        : Cartão de %s%n", tipoCartao);
        System.out.printf("  Descrição   : %s%n", descricao);
        System.out.printf("  Valor       : R$ %.2f%n", valor);
        System.out.println("  → Enviando dados ao operador de cartão...");
        System.out.println("  → Aguardando autorização da bandeira...");
        System.out.println("  ✔ Transação aprovada! NSU: 123456");
    }
    @Override public String getNome() { return "Cartão de " + tipoCartao; }
    @Override public boolean isDisponivel() { return true; }
}
