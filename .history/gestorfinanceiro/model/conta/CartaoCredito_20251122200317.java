package gestorfinanceiro.model.conta;

public class CartaoCredito extends ContaFinanceira{
    private double limiteTotal;

    public CartaoCredito(String nome., double limite) {
        super(nome);
        this.limiteTotal = limite;
        this.saldo = limite;
    }

    @Override
    public void sacar(double valor){
        if (valor <= th)
    }
    
}
