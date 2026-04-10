package pagamento;
public enum TipoPagamento {
    CARTAO_CREDITO, CARTAO_DEBITO, BOLETO, TRANSFERENCIA, PIX;

    public PagamentoFactory getFactory(String chaveOuTipo, String... dadosBancarios) {
        return switch (this) {
            case CARTAO_CREDITO  -> new CartaoCreditoFactory();
            case CARTAO_DEBITO   -> new CartaoDebitoFactory();
            case BOLETO          -> new BoletoFactory();
            case TRANSFERENCIA   -> new TransferenciaFactory(
                dadosBancarios[0], dadosBancarios[1], dadosBancarios[2]);
            case PIX             -> new PixFactory(chaveOuTipo);
        };
    }
}
