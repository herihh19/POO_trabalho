package gestorfinanceiro;
import gestorfinanceiro.model.usuario.UsuarioIndividual;
import gestorfinanceiro.model.usuario.Grupo;
import gestorfinanceiro.model.conta.ContaCorrente;
import gestorfinanceiro.model.conta.ContaPoupanca;
import gestorfinanceiro.model.conta.CartaoCredito;

public class Main{
    public static void main(String[] args) {
        System.out.println("Sistema de gestão financeira");
        UsuarioIndividual usuario = new UsuarioIndividual("Herica Becker","herica@gmail.com");
        System.out.println("Usuario criado: " + usuario.getNome() + " e-mail: " + usuario.getEmail() + "ID: " + usuario.getId());
        
        Grupo republica = new Grupo("Republica teste", "republica@gmail.com");
        republica.adicionarMembro(usuario);
        System.out.println("Grupo criado: " + republica.getNome());
        System.out.println("Membros do grupo: " + republica.getMembros().size());  
        
        ContaCorrente cc = new ContaCorrente("Nubank", 1000);
        System.out.println("Conta Corrente criada com limite de R$ 1000");
        cc.depositar(100);
        cc.sacar(250);
        System.out.println("Saldo atual da conta corrente: R$ " + cc.getSaldo())
    }   
}
