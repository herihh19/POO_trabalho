package gestorfinanceiro.model.conta;

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
            System.out.println("Saque de R$ " + valor + "realizado na " + this.nome)
        }else {
            System.out.println("Saldo insuficiente")
        }
    }
    
}
