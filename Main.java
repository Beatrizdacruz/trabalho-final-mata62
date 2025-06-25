package simulado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Repositorio repo = Repositorio.getInstancia();

        // Adicionando usuários
        repo.getUsuarios().add(new Usuario(123, "Aluno Graduação", "João da Silva"));
        repo.getUsuarios().add(new Usuario(456, "Aluno Pós-Graduação", "Luiz Fernando Rodrigues"));
        repo.getUsuarios().add(new Usuario(789, "Aluno Graduação", "Pedro Paulo"));
        repo.getUsuarios().add(new Usuario(100, "Professor", "Carlos Lucena"));

        // Adicionando livros
        repo.getLivros().add(new Livro(100, "Engenharia de Software", "Addison Wesley",
                Arrays.asList("Ian Sommervile"), "6ª", 2000));
        repo.getLivros().add(new Livro(101, "UML - Guia do Usuário", "Campus",
                Arrays.asList("Grady Booch", "James Rumbaugh", "Ivar Jacobson"), "7ª", 2000));
        repo.getLivros().add(new Livro(200, "Code Complete", "Microsoft Press",
                Arrays.asList("Steve McConnell"), "2ª", 2014));
        repo.getLivros().add(new Livro(201, "Agile Software Development, Principles, Patterns and Practices", "Prentice Hall",
                Arrays.asList("Robert Martin"), "1ª", 2002));
        repo.getLivros().add(new Livro(300, "Refactoring: Improving the Design of Existing Code", "Addison Wesley Professional",
                Arrays.asList("Martin Fowler"), "1ª", 1999));
        repo.getLivros().add(new Livro(301, "Software Metrics: A rigorous and Practical Approach", "CRC Press",
                Arrays.asList("Norman Fenton", "James Bieman"), "3ª", 2014));
        repo.getLivros().add(new Livro(400, "Design Patterns: Element of Reusable Object-Oriented Software", "Addison Wesley Professional",
                Arrays.asList("Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides"), "1ª", 1994));
        repo.getLivros().add(new Livro(401, "UML Distilled: A Brief Guide to the Standard Object Modeling Language", "Addison Wesley Professional",
                Arrays.asList("Martin Fowler"), "3ª", 2003));


        Livro livro100 = repo.getLivros().stream().filter(l -> l.getCodigo() == 100).findFirst().orElse(null);
        Livro livro101 = repo.getLivros().stream().filter(l -> l.getCodigo() == 101).findFirst().orElse(null);
        Livro livro200 = repo.getLivros().stream().filter(l -> l.getCodigo() == 200).findFirst().orElse(null);
        Livro livro201 = repo.getLivros().stream().filter(l -> l.getCodigo() == 201).findFirst().orElse(null);
        Livro livro300 = repo.getLivros().stream().filter(l -> l.getCodigo() == 300).findFirst().orElse(null);
        Livro livro400 = repo.getLivros().stream().filter(l -> l.getCodigo() == 400).findFirst().orElse(null);

        List<Exemplar> exemplares = new ArrayList<>();
        exemplares.add(new Exemplar("01", livro100));
        exemplares.add(new Exemplar("02", livro100));
        exemplares.add(new Exemplar("03", livro101));
        exemplares.add(new Exemplar("04", livro200));
        exemplares.add(new Exemplar("05", livro201));
        exemplares.add(new Exemplar("06", livro300));
        exemplares.add(new Exemplar("07", livro300));
        exemplares.add(new Exemplar("08", livro400));
        exemplares.add(new Exemplar("09", livro400));

        Usuario usuario = repo.buscarUsuarioPorCodigo(456);
        if (usuario != null) {
            System.out.println("Usuário encontrado: " + usuario.getNome());
        } else {
            System.out.println("Usuário não encontrado.");
        }

        System.out.println("\nExemplares cadastrados:");
        for (Exemplar ex : exemplares) {
            System.out.println(ex);
        }


        // Exibindo os dados
        System.out.println("Usuários:");
        for (Usuario u : repo.getUsuarios()) {
            System.out.println(u);
        }

        System.out.println("\nLivros:");
        for (Livro l : repo.getLivros()) {
            System.out.println(l);
        }
    }
}
