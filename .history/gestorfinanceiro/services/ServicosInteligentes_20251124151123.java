package gestorfinanceiro.services;

import java.util.List;
import gestorfinanceiro.model.conta.ContaFinanceira;
import gestorfinanceiro.model.transacao.Transacao;
import gestorfinanceiro.model.transacao.TipoTransacao;

public class ServicosInteligentes{
    public static void projetarPoupanca(ContaFinanceira conta, double economiaMensal, int meses){
        double saldoAtual = conta.getSaldo();
        double futuro = saldoAtual + (economiaMensal * meses);
        System.out.println("Saldo atual: R$ " + conta.);
        System.out.println("Saldo atual: R$ " + saldoAtual);
    }
}