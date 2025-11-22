package gestorfinanceiro.model.conta;

public class CartaoCredito extends ContaFinanceira{
    private double limiteCredito;

    public CartaoCredito(String nome, double limiteCredito){
        super(nome);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor){
        if (valor <= (this.saldo + this.limiteCredito)){
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado no cartão de crédito " + this.nome);
        }else {
            System.out.println("Limite de crédito excedido no cartão de crédito");
        }
    }
    
}
