package gestorfinanceiro.services;

import gestorfinanceiro.model.conta.ContaFinanceira;
import gestorfinanceiro.model.conta.ContaCorrente;
import gestorfinanceiro.model.conta.ContaPoupanca;
import gestorfinanceiro.model.conta.CartaoCredito;

public class ContaFactory{
    public static ContaFinanceira criarConta(String tipo, String nome, double limiteOuSaldoInicial){
        switch (tipo.toLowerCase()){
            case "corrente":
                return new ContaCorrente(nome, limiteOuSaldoInicial);
            case "poupanca":
                ContaPoupanca cp = new ContaPoupanca(nome);
                cp.depositar(limiteOuSaldoInicial);
                return cp;    
            case "credito":
                return new CartaoCredito(nome, limiteOuSaldoInicial);
            default:
                System.out.println("Tipo de conta desconhecido: " + tipo);
                return null;        
        }

    }
}