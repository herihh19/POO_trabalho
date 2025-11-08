package br.com.gestorfinanceiro.model;

import br.com.gestorfinanceiro.exception.SaldoInsuficienteException;

public class ContaCorrente extends ContaFinanceira {

    public ContaCorrente(String nome, double saldoInicial, Usuario proprietario) {
        super(nome, saldoInicial, proprietario);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            // Poderíamos criar outra exceção, ex: ValorInvalidoException
            System.out.println("Valor de saque deve ser positivo.");
            return;
        }
        
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            throw new SaldoInsuficienteException(this.saldo, valor);
        }
    }
}