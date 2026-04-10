package pagamento;

public interface Pagamento {
    void processar(double valor, String descricao);
    String getNome();
    boolean isDisponivel();
}
