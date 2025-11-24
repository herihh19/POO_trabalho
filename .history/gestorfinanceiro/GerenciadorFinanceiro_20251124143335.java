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
    public void SalvarDados(){
        try (objetcOutputStream out = new ObjectOutputStream(new FileOutputStream(new FileOutputStream("dados_banco.bin")))){
            out.writeObject(this.usuarios);
            out.writeObject(this.contas);
            System.out.println("Dados salvos com sucesso");
        } catch (IOException e){
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
        @SuppressWarnings("unchecked")
        public void carregarDados(){
            File arquivo = new File("dados_banco.bin");
            if (!arquivo.exists()){
                System.out.println("Arquivo de dados nao encontrado.");
                return;
            }
            try (Object)
        }
    }
}