
package gestorfinanceiro.model.usuario;
import br.com.gestorfinanceiro.exception.SaldoInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public abstract class ContaFinanceira {
    protected String nome;
    protected double saldo;
    protected Usuario proprietario;
    protected List<Lancamento> lancamentos;

    public ContaFinanceira(String nome, double saldoInicial, Usuario proprietario) {
        this.nome = nome;
        this.saldo = saldoInicial;
        this.proprietario = proprietario;
        this.lancamentos = new ArrayList<>();
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor) throws SaldoInsuficienteException;

    public void adicionarLancamento(Lancamento lancamento) {
        this.lancamentos.add(lancamento);
    }
    
    public double getSaldo() { return saldo; }
    public String getNome() { return nome; }
    public Usuario getProprietario() { return proprietario; }
    public List<Lancamento> getLancamentos() { return lancamentos; }

    @Override
    public String toString() {
        return nome + ": R$" + String.format("%.2f", saldo);
    }
}