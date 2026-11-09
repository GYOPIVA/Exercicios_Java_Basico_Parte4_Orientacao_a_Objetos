package guiaDidaticoPT4;

import java.util.Scanner;

public class Exercicio02 {

    static class Produto {
        String nomeProduto;
        float precoProduto;

        void mostrarProduto(){
            System.out.printf("Produto: %s\nPreço: R$%.2f\n_____________\n", nomeProduto,  precoProduto);
        }
    }

    static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = new Produto();

            System.out.println("Digite o nome do produto:");
            produtos[i].nomeProduto = sc.nextLine();

            System.out.printf("Digite o valor do produto %s:\n", produtos[i].nomeProduto);
            produtos[i].precoProduto = sc.nextFloat();
            sc.nextLine();
        }
        for (Produto produto : produtos){
            produto.mostrarProduto();
        }

        Produto maisCaro = produtos[0];

        for (int i = 1; i < produtos.length; i++) {
            if (produtos[i].precoProduto > maisCaro.precoProduto) {
                maisCaro = produtos[i];
            }
        }
        System.out.println("\nProduto mais caro:");
        maisCaro.mostrarProduto();

        sc.close();
    }
}
