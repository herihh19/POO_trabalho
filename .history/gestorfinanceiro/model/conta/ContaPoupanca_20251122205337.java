package gestorfinanceiro.model.conta;

public class ContaPoupanca extends ContaFinanceira {

    public ContaPoupanca(String nome){
        super(nome);
    }
    @Override
    public void sacar(double valor){
        if (valor <= (this.saldo)){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na poupança " + this.nome);
        }else {
            System.out.println("Saldo insuficiente na poupanca");
        }
    }
}

