package gestorfinanceiro;
import gestorfinanceiro.model.usuario.Usuario;
import gestorfinanceiro.model.ContaFinanceira;


public class GerenciadorFinanceiro{
    private static GerenciadorFinanceiro instancia;
    private list<Usuario> usuarios;
    private list<ContaFinanceira> contas;

    private GerenciadorFinanceiro(){
        this.usuarios = new ArrayList<>();
        this.contas = new ArrayList<>();
    }
    public static GerenciadorFinanceiro getInstancia()

}