package gestorfinanceiro.model.conta;
import gestorfinanceiro.model.transacao.TipoTransacao;
import gestorfinanceiro.model.transacao.Transacao;

public class CartaoCredito extends ContaFinanceira{
    private double limiteTotal;

    public CartaoCredito(String nome, double limite) {
        super(nome);
        this.limiteTotal = limite;
        this.saldo = limite;
    }

    @Override
    public void sacar(double valor){
        if (valor <= this.saldo){
            this.saldo -= valor;
            Transacao t= new Transacao("Compra cartao credito", valor, TipoTransacao.DESPESA);
            this.transacoes.add(t);
            System.out.println("Compra de R$  " + valor + "  aprovada no cartao " + this.nome);
        }else {
            System.out.println("Compra negada pois o limite é insuficiente");
        }
    }
    @Override

    public void depositar(double valor){
        if ((this.saldo + valor) <= this.limiteTotal){
            this.saldo += valor;
            Transacao t= new Transacao("Pagamento realizado: R$", valor, TipoTransacao.RECEITA);
            this.transacoes.add(t);
            System.out.println("Pagamento realizado, R$ " + valor + " O limite foi atualizado");

        }else{
            double troco = (this.saldo + valor) - this.limiteTotal;
            this.saldo = this.limiteTotal;
            this.transacoes.add
            System.out.println("Pagamento realizado com troco de R$ " + troco);
        }
    }
}