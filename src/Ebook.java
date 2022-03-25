public class Ebook {
    private String titulo, autor;
    private int numeroDePaginas, paginaAtual;

    public Ebook(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        if (numeroDePaginas > 0) {
            this.numeroDePaginas = numeroDePaginas;
        }
    }

    public int getpaginaAtual() {
        return paginaAtual;
    }

    public void proximaPagina() {
        if (paginaAtual < numeroDePaginas) {
            paginaAtual++;
        }
    }

    public void voltarPagina() {
        if (paginaAtual > 0) {
            paginaAtual--;
        }
    }

    public boolean gotoPagina(int pagina) {
        if (pagina >= 0 && pagina <= numeroDePaginas) {
            paginaAtual = pagina;
            return true;
        }
        return false;
    }

    public String dadosLivro() {
        return titulo + ", " + autor + ", " + numeroDePaginas;
    }
}
