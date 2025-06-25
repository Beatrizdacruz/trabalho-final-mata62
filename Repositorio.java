package simulado;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    private static Repositorio instancia;
    private List<Usuario> usuarios;
    private List<Livro> livros;

    // Construtor privado para impedir instâncias externas
    private Repositorio() {
        usuarios = new ArrayList<>();
        livros = new ArrayList<>();
    }

    // Acesso global à instância única
    public static Repositorio getInstancia() {
        if (instancia == null) {
            instancia = new Repositorio();
        }
        return instancia;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Usuario buscarUsuarioPorCodigo(int codigoUsuario) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCodigo() == codigoUsuario) {
                return usuario;
            }
        }
        return null;
    }
}
