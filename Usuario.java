package simulado;

public class Usuario {
    private int codigo;
    private String tipo;
    private String nome;

    public Usuario(int codigo, String tipo, String nome) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return codigo + " - " + tipo + " - " + nome;
    }
}
