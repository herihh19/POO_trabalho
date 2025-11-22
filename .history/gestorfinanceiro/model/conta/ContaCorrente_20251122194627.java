package gestorfinanceiro.model.conta;

public class ContaCorrente extends ContaFinanceira {
    private double limite;
    public ContaCorrente(String nome, double limite){
        super(nome);
        this.limite = limite;
    }
    
    
}
