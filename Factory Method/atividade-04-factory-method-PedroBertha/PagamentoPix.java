package pagamento;

class PagamentoPix implements Pagamento {
    private final String chavePix;

    PagamentoPix(String chavePix) { this.chavePix = chavePix; }

    @Override
    public void processar(double valor, String descricao) {
        System.out.printf("  Descrição   : %s%n", descricao);
        System.out.printf("  Valor       : R$ %.2f%n", valor);
        System.out.printf("  Chave PIX   : %s%n", chavePix);
        System.out.printf("  EndToEndId  : E%d%n", System.currentTimeMillis());
        System.out.println("  → Consultando chave no DICT (Banco Central)...");
        System.out.println("  → Transmitindo ao SPI...");
        System.out.println("  ✔ PIX realizado! Crédito imediato ao destinatário.");
    }
    @Override public String getNome() { return "PIX"; }
    @Override public boolean isDisponivel() { return true; }
}
