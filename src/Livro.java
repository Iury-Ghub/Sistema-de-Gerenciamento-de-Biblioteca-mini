public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponivel;

    public Livro(String titulo, String autor, int ano, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if (this.disponivel){
            this.disponivel = false;
            System.out.println("Livro emprestado");
            return;
        }
        System.out.println("Esse livro já foi emprestado");
    }

    public void info(){
        System.out.println(this.titulo + ", " + this.autor + ", " + this.ano + ", " + this.disponivel);
    }

    public void devolver(){
        if (this.disponivel){
            System.out.println("Este livro já está no acervo");
            return;
        }
        this.disponivel = true;
        System.out.println("Livro devolvido com sucesso");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
