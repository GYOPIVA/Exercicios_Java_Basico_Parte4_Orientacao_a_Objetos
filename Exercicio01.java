package guiaDidaticoPT4;

import java.util.Scanner;

public class Exercicio01 {

    static class Pessoa{
        String nome;
        String idade;

        void mostrarPessoa(){
            System.out.printf("Nome: %s\nIdade: %s\n______________\n", nome, idade);
        }
    }
    static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();
            System.out.printf("Digite o nome da %d° pessoa:\n", i+1);
            pessoas[i].nome = sc.nextLine();
            System.out.printf("Digite a idade de %s:\n", pessoas[i].nome);
            pessoas[i].idade = sc.nextLine();
        }

        for(Pessoa mostrar : pessoas){
            mostrar.mostrarPessoa();
        }

    }
}
