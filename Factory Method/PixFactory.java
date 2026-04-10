package pagamento;
public class PixFactory extends PagamentoFactory {
    private final String chavePix;
    public PixFactory(String chavePix) { this.chavePix = chavePix; }
    @Override public Pagamento criarPagamento() { return new PagamentoPix(chavePix); }
}
