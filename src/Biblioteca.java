import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarLivros(Livro livro) {
        livros.add(livro);
        try {
            System.out.println("Livro: " + livro.getTitulo() + "%-s" + " adicionado com sucesso");
        } catch (Exception e) {
            System.err.println("Informação inválida");
        }
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    public List<Livro> listarlivrosDisponiveis() {
    List<Livro> livrosDisponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }

    public Livro buscaLivroPorId(long id) {
        for (Livro livro : livros) {
            if (livro.getIdLivro() == id) {
                return livro;
            }
        }
        return null;
    }

    public void emprestimo(Livro livro, String nomeUsuario) {
        if (livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, nomeUsuario);
            emprestimos.add(emprestimo);
            livro.setDisponivel(false);
        } else {
            System.out.println("Livro não disponível para empréstimo.");
        }
    }
    public void atualizarLivro(int id, String novoTitulo) {
        for (Livro livro : livros) {
            if (livro.getIdLivro() == id) {
                livro.setTitulo(novoTitulo);
                break;
            }
        }
    }

    public void removerLivro(int id) {
        livros.removeIf(livro -> livro.getIdLivro() == id);
    }

    // Métodos para gerenciar autores
    public void adicionarAutor(Autor autor) {
        autores.add(autor);
    }

    public List<Autor> listarAutores() {
        return autores;
    }

    public void atualizarAutor(int idAutor, String novoNome) {
        for (Autor autor : autores) {
            if (autor.getIdAutor() == idAutor) {
                autor.setNome(novoNome);
                break;
            }
        }
    }

    public void removerAutor(Long idAutor ) {
        autores.removeIf(autor -> autor.getIdAutor() == idAutor);
    }
    public void devolverLivro(Long idEmprestimo) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getIdEmprestimo() == idEmprestimo && emprestimo.isAtivo()) {
                emprestimo.devolucao();
                break;
            }
        }
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimos;
    }
}



