package gestorfinanceiro;
import gestorfinanceiro.model.usuario.Usuario;
import gestorfinanceiro.model.conta.ContaFinanceira;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class GerenciadorFinanceiro{
    private static GerenciadorFinanceiro instancia;
    private List<Usuario> usuarios;
    private List<ContaFinanceira> contas;

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
    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }
    public void adicionarConta(ContaFinanceira conta){
        this.contas.add(conta);
        System.out.println("Conta cadastrada:"+ conta.getNome());
    }
    public List<ContaFinanceira> getContas(){
        return this.contas;
    }
    public double saldoGlobal(){
        double total = 0;
        for (ContaFinanceira conta : contas){
            total += conta.getSaldo();
        }
        return total;
    }
    public void salvarDados(){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("dados_banco.bin"))){
            out.writeObject(this.usuarios);
            out.writeObject(this.contas);
            System.out.println("Dados salvos com sucesso");
        } catch (IOException e){
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
        try (PrintWriter writer = new PrintWriter("relatorio_backup.txt")) {
            writer.println("=== BACKUP LEGÍVEL DO SISTEMA ===");
            writer.println("Data do salvamento: " + java.time.LocalDateTime.now());
            
            writer.println("USUARIOS CADASTRADOS:");
            for (Usuario u : usuarios) {
                writer.println("- " + u.getNome() + " (ID: " + u.getId() + ")");
            }
            
            writer.println("CONTAS BANCÁRIAS:");
            for (ContaFinanceira c : contas) {
                writer.println("- " + c.getNome() + " | Tipo: " + c.getClass().getSimpleName() + " | Saldo: R$" + c.getSaldo());
            }
            writer.println("Saldo Total do Sistema: R$" + saldoGlobal());
            
            System.out.println("[Persistencia] Relatório TEXTO salvo em 'relatorio_backup.txt'");
    }    
        @SuppressWarnings("unchecked")
        public void carregarDados(){
            File arquivo = new File("dados_banco.bin");
            if (!arquivo.exists()){
                System.out.println("Arquivo de dados nao encontrado.");
                return;
            }
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(arquivo))){
                this.usuarios = (List<Usuario>) in.readObject();
                this.contas = (List<ContaFinanceira>) in.readObject();
                System.out.println("Dados carregados com sucesso.");
            } catch (IOException | ClassNotFoundException e){
                System.out.println("Erro ao carregar dados: " + e.getMessage());
            }
        }
    }
