package gestorfinanceiro.services;

import java.util.List;
import gestorfinanceiro.model.conta.ContaFinanceira;
import gestorfinanceiro.model.transacao.Transacao;
import gestorfinanceiro.model.transacao.TipoTransacao;

public class ServicosInteligentes{
    public static void projetarPoupanca(ContaFinanceira conta, double economiaMensal, int meses){
        double saldoAtual = conta.getSaldo();
        double futuro = saldoAtual + (economiaMensal * meses);
        System.out.println("Conta" + conta.getNome);
        System.out.println("Saldo atual: R$ " + saldoAtual);
        System.out.println("Guardando: R$ " + economiaMensal + "por" + meses + "meses");
        System.out.println("Saldo projetado: R$ " + futuro);
    }
    public static void analisarGastos(List<Transacao> transacoes){
        double totalDespesas = 0;
        int qtdDespesas = 0;
        for (Transacao t : transacoes){
            if (t.getTipo() == TipoTransacao.DESPESA){
                totalDespesas += t.getValor();
                qtdDespesas++;
            }
        }
        System.
    }
}