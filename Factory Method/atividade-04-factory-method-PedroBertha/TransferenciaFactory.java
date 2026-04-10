package pagamento;
public class TransferenciaFactory extends PagamentoFactory {
    private final String banco, agencia, conta;
    public TransferenciaFactory(String banco, String agencia, String conta) {
        this.banco = banco; this.agencia = agencia; this.conta = conta;
    }
    @Override public Pagamento criarPagamento() {
        return new PagamentoTransferencia(banco, agencia, conta);
    }
}
