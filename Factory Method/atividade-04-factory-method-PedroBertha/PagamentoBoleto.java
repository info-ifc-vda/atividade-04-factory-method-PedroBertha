package pagamento;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class PagamentoBoleto implements Pagamento {
    @Override
    public void processar(double valor, String descricao) {
        String venc = LocalDate.now().plusDays(3).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf("  Descrição   : %s%n", descricao);
        System.out.printf("  Valor       : R$ %.2f%n", valor);
        System.out.printf("  Vencimento  : %s%n", venc);
        System.out.println("  Código      : 34191.09008 16930.130042 09832.700000 8 98890000025000");
        System.out.println("  → Boleto gerado e enviado por e-mail.");
        System.out.println("  ✔ Aguardando compensação bancária (até 3 dias úteis).");
    }
    @Override public String getNome() { return "Boleto Bancário"; }
    @Override public boolean isDisponivel() { return true; }
}
