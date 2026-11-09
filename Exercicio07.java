package guiaDidaticoPT4;

public class Exercicio07 {
    static class Livro{
        String titulo;
        boolean disponivel;

        Livro(String titulo, boolean disponivel){
            this.titulo = titulo;
            this.disponivel = disponivel;
            titulo = "Sem nome";
            disponivel = true;
        }

        void emprestar(){
            disponivel = false;
        }

        void devolver(){
            disponivel = true;
        }

        void dadosLivro(){
            System.out.printf("-----------------\nNome do livro: %s\nDisponivel: %s\n-----------------\n", titulo, disponivel);
        }
    }

    static void main(String[] args) {
        Livro[]  livros = new Livro[3];
        livros[0] = new Livro("Palavra Cantada",true);
        livros[0].emprestar();
        livros[0].dadosLivro();
        livros[0].devolver();
        livros[0].dadosLivro();
    }
}
