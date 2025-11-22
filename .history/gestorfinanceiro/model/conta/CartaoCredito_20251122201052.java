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
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Compra de R$ " + valor + "aprovada no cartão" + this.nome);
        }else {
            System.out.println("Compra negada pois o limite é insuficiente");
        }
    }
    @Override

    public void depositar(double valor){
        if ((this.saldo + valor) <= this.limiteTotal){
            this.saldo += valor;
            System.out.println("Pagamento realizado, R$" + valor + "O limite foi atualizado")

        }else{
            double troco = (this.saldo + valor) - this.limiteTotal;
            this.saldo = this.limiteTotal;
            System.out.printlin
        }
    }

}