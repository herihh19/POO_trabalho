package gestorfinanceiro.model.conta;
import gestorfinanceiro.model.transacao.TipoTransacao;
import gestorfinanceiro.model.transacao.Transacao;

public class ContaCorrente extends ContaFinanceira {
    private double limite;
    public ContaCorrente(String nome, double limite){
        super(nome);
        this.limite = limite;
    }
    @Override
    public void sacar(double valor){
        if (valor <= (this.saldo + this.limite)){
            this.saldo -= valor;
            Traansacao t= new Transacao("Saque conta corrente", valor, Tipo)
            System.out.println("Saque de R$ " + valor + " realizado na " + this.nome);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
}
