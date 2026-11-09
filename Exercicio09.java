package guiaDidaticoPT4;

import java.util.Scanner;

public class Exercicio09 {
    static class Celular{
        String marca;
        String modelo;
        float preco;

        Celular(String marca, String modelo, float preco){
            this.marca = marca;
            this.modelo = modelo;
            this.preco = preco;
        }

        void mostrarCelular(){
            System.out.printf("Marca: %s\nModelo: %s\nPreço: R$%.2f\n---------------\n", marca,  modelo, preco);
        }
    }

    static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        Celular[] celulares = new Celular[3];
        for (int i = 0; i < celulares.length; i++) {
            System.out.printf("Digite a marca do %d° celular:\n", i + 1);
            String marca = input.nextLine();
            System.out.printf("Digite a modelo do %s:\n", marca);
            String modelo = input.nextLine();
            System.out.printf("Digite o preço do %s %s:\n", marca, modelo);
            float preco = input.nextFloat();
            input.nextLine();
            celulares[i] = new Celular(marca, modelo, preco);
        }

        for(Celular dadosCelular : celulares){
            dadosCelular.mostrarCelular();
        }
    }
}
