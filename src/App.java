import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Ebook livro = new Ebook("Código Limpo", "Robert C. Martin", 456);
        Scanner tec = new Scanner(System.in);
        int paginaAtual, paginaInformada;

        System.out.println(livro.dadosLivro());
        livro.proximaPagina();

        System.out.println(livro.getpaginaAtual());
        livro.voltarPagina();

        System.out.println("Insira a página desejada: ");
        paginaInformada = tec.nextInt();

        paginaAtual = livro.getpaginaAtual();

        boolean irpara = livro.gotoPagina(paginaInformada);
        if (irpara) {
            paginaAtual = paginaInformada;
            System.out.println("Você está na página " + paginaAtual);
        } else {
            System.out.println("Página inválida");
        }
    tec.close();
    
    }
}
