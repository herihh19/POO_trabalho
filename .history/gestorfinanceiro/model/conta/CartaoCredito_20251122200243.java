package gestorfinanceiro.model.conta;

public class CartaoCredito extends ContaFinanceira{
    private double limiteTotal;

    public CartaoCredito(String nome., double limite) {
        super(nome);
        this.limiteTotal = limite;
        this.saldo = limite;
    }
    
}
