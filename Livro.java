package simulado;

import java.util.List;

public class Livro {
    private int codigo;
    private String titulo;
    private String editora;
    private List<String> autores;
    private String edicao;
    private int anoPublicacao;

    public Livro(int codigo, String titulo, String editora, List<String> autores, String edicao, int anoPublicacao) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public List<String> getAutores() {
        return autores;
    }

    public String getEdicao() {
        return edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return codigo + " - " + titulo + " (" + anoPublicacao + ")";
    }
}

