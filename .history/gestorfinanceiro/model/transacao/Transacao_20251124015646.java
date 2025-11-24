package gestorfinanceiro.model.transacao;
import java.time.LocalDate;

public class Transacao{
    private String descricao;
    private double valor;
    private TipoTransacao tipo;
    private LocalDate data;

    public Transacao(String descricao, double valor, TipoTransacao tipo){
        this.descricao = descricao;
        this.valor = valor;
        this.tipo = tipo;
        this.data = LocalDate.now();
    }
    public double getValor(){
        return valor;
    }
    public TipoTransacao getTipo(){
        return tipo;
    }
    public String getDescricao(){
        return descricao;
    }
    public LocalDate getData(){
        return data;
    }
    @Override
    public String toString(){
        DateTimeFormatter formatoBr = DateTimeFormatter.of
}