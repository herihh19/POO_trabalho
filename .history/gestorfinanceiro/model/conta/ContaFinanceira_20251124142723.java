package gestorfinanceiro.model.conta;
import gestorfinanceiro.model.transacao.TipoTransacao;
import gestorfinanceiro.model.transacao.Transacao;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

public abstract class ContaFinanceira {
    protected String nome;
    protected double saldo;

    protected List<Transacao> transacoes;
    public ContaFinanceira(String nome) {
        this.nome = nome;
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }
    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            Transacao t= new Transacao("Deposito", valor, TipoTransacao.RECEITA); 
            System.out.println("Depósito de R$" + valor + "na conta " + this.nome);
        } else{
            System.out.println("Valor inválido para depósito.");
        }
    }
    public List<Transacao> getTransacoes() {
        return transacoes;
    }
    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
    public String getNome() {
        return nome;
    }
}
