package gestorfinanceiro.model.usuario;
import java.util.ArrayList;
import java.util.List;

public class Grupo extends Usuario {

    private List<UsuarioIndividual> membros;

    public Grupo(String nome, String emailGrupo) {
        super(nome, emailGrupo);
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(UsuarioIndividual membro) {
        if (membro != null) {
            this.membros.add(membro);
        }
    }

    public List<UsuarioIndividual> getMembros() {
        return this.membros;
    }
}