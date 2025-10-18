import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Usuario usuario) {
        if (livro.getDisponivel()) {
            this.livro = livro;
            this.usuario = usuario;
            this.dataEmprestimo = LocalDate.now();
            this.dataDevolucao = null;
            livro.emprestar();
            System.out.println("Livro emprestado com sucesso");
        }
        System.out.println("Livro já foi emprestado");
    }

    public void registrarDevolucao(){
        if (this.dataDevolucao == null){
            this.dataDevolucao = LocalDate.now();
            livro.devolver();
            System.out.println("Devolução registrada com sucesso");
            return;
        }
        System.out.println("Empréstimo já foi finalizado");

    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
