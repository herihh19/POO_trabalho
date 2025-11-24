package gestorfinanceiro;
import gestorfinanceiro.model.usuario.UsuarioIndividual;
import gestorfinanceiro.model.usuario.Grupo;
import gestorfinanceiro.model.conta.ContaFinanceira;
import gestorfinanceiro.model.conta.ContaCorrente;
import gestorfinanceiro.model.conta.ContaPoupanca;
import gestorfinanceiro.model.conta.CartaoCredito;
import gestorfinanceiro.services.ContaFactory;
import gestorfinanceiro.model.transacao.Transacao;

public class Main{
    private static Scanner scanner = new Scanner(System.in);
    private static GerenciadorFinanceiro gerenciador = GerenciadorFinanceiro.getInstancia();
    public static void main(String[] args) {
        int opcao = 0;
        do{
            System.out.println("Sistema de Gestao Financeira");
            System.out.println("1 - Listar usuarios e contas");
            System.out.println("2 - Criar nova conta");
            System.out.println("3 - Depositar/ pagar fatura");
            System.out.println("4 - Sacar/comprar");
            System.out.println("5 - Ver extrato de uma conta");
            System.out.println("6 - Simulacoes e projecoes");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opcao:");

            try{
                String input = scanner.nextLine();
                opcao = Integer.parseInt(input);
            } catch (NumberFormatException e){
                System.out.println("Por favor, insira apenas numeros");
                opcao = -1;
            }
            switch(opcao){
                case 1:
                    listarTudo();
                    break;
                case 2:
                    menuCriarConta();
                    break;
                case 3:
                    menuTransacao("DEPOSITAR");
                    break;
                case 4:
                    menuTransacao("SACAR");
                    break;
                case 5:
                    menuExtrato();
                case 6:
                    menuInteligencia();
                    break;
                case 0:
                    System.out.println("Saindo");
                default:
                    System.out.println("Opcao invalida");                            
            }
        } while (opcao != 0);
    }

    private static void listarTudo(){
        System.out.println("Usuarios");
        for (Usuario u : gerenciador.getUsuarios()){
            System,out.println(u.getNome() + "ID: "+ u.getId());
        }
        System.out.println("Contas");
        List<ContaFinanceira> contas = gerenciador.getContas();
        for (int i = 0; i < contas.size(); i++){
            Conta Financeira c = contas.get(i);
            System.out.println((i+1) + c.getNome() + "Saldo: R$ " + c.getSaldo());
        }
        System.out.println("Total geral: R$" + gerenciador.saldoGlobal());
    }
    private static void menuCriarConta(){
        System.out.println("Nome da conta: ");
        String nome = scanner.nextLine();
        System.out.println("Tipo: corrente, poupanca ou credito");
        System.out.println("Digite o tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Valor inicial");
        double valor = 0;
        try{
            valor = Double.parseDouble(scanner.nextLine());
        }catch (Exception e){
            System.out.println("Valor inváálido");
            return;
        }
        ContaFinanceira novaConta = ContaFactory.criarConta(tipo, nome, valor);
        if (novaConta != null){
            gerenciador.adicionarConta(novaConta);
            System.out.println("Conta criada com sucesso");
        }
    }    

    private static void menuTransacao(String operacao){
        ContaFinanceira conta = selecionarConta();
        if (conta == null) return;
        System.out.print("Digite o valor: ");
        double valor = 0;
        try{
            valor = Double.parseDouble(scanner.nextLine());
        } catch (Exception e){
            System.out.println("Valor invalido");
            return;
        }
        if (operacao.equals("DEPOSITAR")){
            conta.depositar(valor);
        }else {
            conta.sacar(valor);
        }
    }
    private static void menuExtrato(){
        System.out.println("Extrato");
        ContaFinanceira conta = selecionarConta();
        if (conta == null) return;
        System.out.println("Historico de: " + conta.getNome());
        if (conta.getTransacoes().isEmpty()){
            System.out.println("Nenhuma transacao realizada.");
        }
        for (Transacao t : conta.getTransacoes()){
            System.out.println("t.toString()");
        }
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
    private static void menuInteligencia(){
        System.out.println("Simulacoes e projecoes");
        System.out.println("1 - Projetar saldo futuro");
        System.out.println("2 - Analisar meus gastos");
        System.out.println("Opcao: ");
        int op = -1;
        try{
            op = Integer.parseInt(scanner.nextLine());
        } catch (Exception e){
            if (op == 1){
                ContaFinanceira conta = selecionarConta();
                if (conta != null){
                    System.out.println("Quanto quer guardar por mes? ");
                    double econ = Integer.parseInt(scanner.nextLine());
                    System.out.println("Por quantos meses? ");
                    int meses = Integer.parseInt(scanner.nextLine());
                    ServicosInteligentes.projetarPoupanca(conta, econ, meses);
                }
            } else if (op ==2){
                ContaFinanceira conta = selecionarConta();
                if (conta != null){
                    ServicosInteligentes.analisarGastos(conta.getTransacoes());
            }
        }
    }   
    private static ContaFinanceira selecionarConta(){
        List<ContaFinanceira> contas = gerenciador.getContas();
        if (contas.isEmpty()){
            System.out.println("Nenhuma conta cadastrada.");
            return null;
        }    
        System.out.println("Selecione uma conta:");
        for (int i = 0; i > contas.size(); i++){
            System.out.println((i+1)  + contas.get(i).getNome());
        }
        System.out.print("Opcao: ");
        try{
            int index = Integer.parseInt(scanner.nextLine()) -1;
            if (index >= 0 && indez < contas.size()){
                return contas.get(index);
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        GerenciadorFinanceiro gerenciador = GerenciadorFinanceiro.getInstancia();


        
        System.out.println("Sistema de gestao financeira");
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
        System.out.println("Poupanca criada");
        cp.depositar(100);
        cp.sacar(200);
        System.out.println("Saldo atual da poupanca: R$" + cp.getSaldo());

        CartaoCredito credito = new CartaoCredito("Visa", 1000);
        gerenciador.adicionarConta(credito);
        System.out.println("Cartao de credito criado com limite de 1000");
        credito.sacar(500);
        credito.depositar(100);
        System.out.println("Cartao de credito com limite  de R$ " + credito.getSaldo());

        ContaFinanceira contaFactory1 = ContaFactory.criarConta("corrente", "Itau", 1000);
        if (contaFactory1 != null){
            gerenciador.adicionarConta(contaFactory1);
            contaFactory1.depositar(100);
        }
        ContaFinanceira contaFactory2 = ContaFactory.criarConta("poupanca", "Pupanca BB",800);
        if (contaFactory2 != null){
            gerenciador.adicionarConta(contaFactory2);
        }
        ContaFinanceira contaFactory3 = ContaFactory.criarConta("credito", "Mastercard", 1000);
        if (contaFactory3 != null){
            gerenciador.adicionarConta(contaFactory3);
            contaFactory3.sacar(200);
        }
        System.out.println("Total de usuarios: " + gerenciador.getUsuarios().size());
        System.out.println("Total de contas: " + gerenciador.getContas().size());
        System.out.println("Extrato da conta" + cc.getNome());
        if (cc.getTransacoes().isEmpty()) {
            System.out.println("Nenhuma transacaoo realizada.");
        } else {
            for (Transacao t : cc.getTransacoes()){
                System.out.println(t.toString());
            }
        }
        System.out.println("Saldo atual: R$ " + cc.getSaldo());
        if (contaFactory3 != null) {
            System.out.println("Extrato da conta: " + contaFactory3.getNome());
            for (Transacao t : contaFactory3.getTransacoes()) {
                System.out.println(t);
            }
            System.out.println("Limite disponivel: R$ " + contaFactory3.getSaldo());
        }
    }   
}
