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
    public static GerenciadorFinanceiro getInstancia(){
        if (instancia == null){
            instancia = new GerenciadorFinanceiro();
        }
        return instancia;
    }
    public void adicionarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
        System.out.println("Usuario cadastrado:"+ usuario.getNome());
    }
    public list<Usuario> getUsuarios(){
        return this.usuarios;
    }
    public void adicionarConta(ContaFinanceira conta){
        this.contas.add(conta);
        System.out.println("Conta cadastrada:"+ conta.getNome();)
    }
    public list<ContaFinanceira> getContas(){
        return this.contas;
    }
    public double saldoGlobal(){
        double total = 0
    }

}