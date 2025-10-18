import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario cadastrado: "+ usuario.getNome());
    }

    public void emprestarLivro(String titulo, Usuario usuario){
        for (Livro livro : livros){
            if(livro.getTitulo().equalsIgnoreCase(titulo)){
                if(livro.getDisponivel()){
                    Emprestimo emprestimo = new Emprestimo(livro,usuario);
                    emprestimos.add(emprestimo);
                    System.out.println("Empréstimo realizado com sucesso!");
                    return;
                }else {
                    System.out.println("O livro: "+ livro.getTitulo() + " Já está emprestado.");
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado");
    }

    public void listarLivros(){
        System.out.println("Lista: ");
        for(Livro livro : livros){
            System.out.println(livro.getTitulo() + ";");
        }
        System.out.println("=======");
    }

}
