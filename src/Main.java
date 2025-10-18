
public class Main {
    public static void main(String[] args) {
        Livro[] livros = new Livro[50];
        Usuario[] usuarios = new Usuario[50];
        Emprestimo[] emprestimos = new Emprestimo[100];

        usuarios[0] = new Usuario("Iury","iury@gmail.com",581434);
        livros[0] = new Livro("o mais belo carrapato", "Sarapatel", 2013, true);
        emprestimos[0] = new Emprestimo(livros[0], usuarios[0]);

        emprestimos[0].Devolucao();
    }
}