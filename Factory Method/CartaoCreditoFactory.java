package pagamento;
public class CartaoCreditoFactory extends PagamentoFactory {
    @Override public Pagamento criarPagamento() { return new PagamentoCartao("crédito"); }
}
