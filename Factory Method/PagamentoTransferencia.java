package pagamento;
import java.time.LocalTime;

class PagamentoTransferencia implements Pagamento {
    private final String banco, agencia, conta;

    PagamentoTransferencia(String banco, String agencia, String conta) {
        this.banco = banco; this.agencia = agencia; this.conta = conta;
    }
    @Override
    public void processar(double valor, String descricao) {
        String tipo = valor >= 1000 ? "TED" : "DOC";
        System.out.printf("  Tipo        : %s%n", tipo);
        System.out.printf("  Descrição   : %s%n", descricao);
        System.out.printf("  Valor       : R$ %.2f%n", valor);
        System.out.printf("  Banco       : %s  Agência: %s  Conta: %s%n", banco, agencia, conta);
        System.out.println("  → Verificando saldo e limites...");
        System.out.println("  → Processando junto ao Banco Central...");
        System.out.printf("  ✔ %s autorizada! Comprovante nº: %d%n", tipo, (int)(Math.random()*900_000+100_000));
    }
    @Override public String getNome() { return "Transferência Bancária"; }
    @Override public boolean isDisponivel() {
        int h = LocalTime.now().getHour(); return h >= 7 && h <= 17;
    }
}
