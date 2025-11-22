package gestorfinanceiro.model.conta;

public  abstract class ContaFinanceira {
    protected String nome;
    protected double saldo;

    public ContaFinanceira(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = 0.0;
    }
    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + "na conta " + this.nome);
        } else{
            System.out.println("Valor inválido para depósito.");
        }
    }
    public abstract void sacar(double valor);

    public double 
}
