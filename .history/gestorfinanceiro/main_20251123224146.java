package gestorfinanceiro;
import gestorfinanceiro.model.usuario.UsuarioIndividual;
import gestorfinanceiro.model.usuario.Grupo;
import gestorfinanceiro.model.conta.ContaCorrente;
import gestorfinanceiro.model.conta.ContaPoupanca;
import gestorfinanceiro.model.conta.CartaoCredito;
import gestorfinanceiro.services.ContaFactory;

public class Main{
    public static void main(String[] args) {

        GerenciadorFinanceiro gerenciador = GerenciadorFinanceiro.getInstancia();

        System.out.println("Sistema de gestão financeira");
        UsuarioIndividual usuario = new UsuarioIndividual("Herica Becker","herica@gmail.com");
        System.out.println("Usuario criado: " + usuario.getNome() + " e-mail: " + usuario.getEmail() + "ID: " + usuario.getId());
        gerenciador.adicionarUsuario(usuario); 

        Grupo republica = new Grupo("Republica teste", "republica@gmail.com");
        republica.adicionarMembro(usuario);
        System.out.println("Grupo criado: " + republica.getNome());
        System.out.println("Membros do grupo: " + republica.getMembros().size());  
        gerenciador.adicionarUsuario(republica);
        
        ContaCorrente cc = new ContaCorrente("Nubank", 1000);
        gerenciador.adicionarConta(cc);
        System.out.println("Conta Corrente criada com limite de R$ 1000");
        cc.depositar(100);
        cc.sacar(250);
        System.out.println("Saldo atual da conta corrente: R$ " + cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca("Minha poupanca");
        gerenciador.adicionarConta(cp);
        System.out.println("Poupança criada");
        cp.depositar(100);
        cp.sacar(200);
        System.out.println("Saldo atual da poupanca: R$" + cp.getSaldo());

        CartaoCredito credito = new CartaoCredito("Visa", 1000);
        gerenciador.adicionarConta(credito);
        System.out.println("Cartao de credito criado com limite de 1000");
        credito.sacar(500);
        credito.depositar(100);
        System.out.println("Cartao de credito com limite  de R$ " + credito.getSaldo());

        ContaFinanceira contaFactor

        System.out.println("Total de usuarios: " + gerenciador.getUsuarios().size());
        System.out.println("Total de contas: " + gerenciador.getContas().size());
    
    }   
}
