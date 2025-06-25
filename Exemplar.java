package simulado;

public class Exemplar {
    private String codigoExemplar;
    private Livro livro;
    private StatusExemplar status;
    private Emprestimo emprestimoAtual;

    public Exemplar(String codigoExemplar, Livro livro) {
        this.codigoExemplar = codigoExemplar;
        this.livro = livro;
        this.status = StatusExemplar.DISPONIVEL;
        this.emprestimoAtual = null;
    }

    public String getCodigoExemplar() {
        return codigoExemplar;
    }

    public Livro getLivro() {
        return livro;
    }

    public StatusExemplar getStatus() {
        return status;
    }

    public Emprestimo getEmprestimoAtual() {
        return emprestimoAtual;
    }

    public void emprestarPara(Emprestimo emprestimo) {
        this.emprestimoAtual = emprestimo;
        this.status = StatusExemplar.EMPRESTADO;
    }

    public void devolver() {
        this.emprestimoAtual = null;
        this.status = StatusExemplar.DISPONIVEL;
    }

    @Override
    public String toString() {
        return "Exemplar " + codigoExemplar + " do livro: " + livro.getTitulo() + " - " + status;
    }
}
