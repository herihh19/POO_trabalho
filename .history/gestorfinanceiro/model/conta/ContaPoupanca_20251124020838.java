package gestorfinanceiro.model.conta;
import gestorfinanceiro.model.transacao.TipoTransacao;
import gestorfinanceiro.model.transacao.Transacao;

public class ContaPoupanca extends ContaFinanceira {

    public ContaPoupanca(String nome){
        super(nome);
    }
    @Override
    public void sacar(double valor){
        if (valor <= (this.saldo)){
            this.saldo -= valor;
            Transacao t= n
            System.out.println("Saque de R$ " + valor + " realizado na poupanca " + this.nome);
        }else {
            System.out.println("Saldo insuficiente na poupanca");
        }
    }
}

