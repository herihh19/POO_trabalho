package gestorfinanceiro.model.conta;

public class ContaPoupanca extends ContaFinanceira {

    public ContaPoupanca(String nome, double){
        super(nome);
    }
    @Override
    public void sacar(double valor){
        if (valor <= (this.saldo + this.limite)){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + "realizado na " + this.nome)
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    
}
    
}
