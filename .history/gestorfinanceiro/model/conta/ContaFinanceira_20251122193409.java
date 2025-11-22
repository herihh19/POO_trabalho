package gestorfinanceiro.model.conta;

public  abstract class ContaFinanceira {
    protected String nome;
    protected double saldo;

    public ContaFinanceira(String nome, double saldoInicial) {
        this.nome = nome;
        this.saldo = saldoInicial;
    }
}
