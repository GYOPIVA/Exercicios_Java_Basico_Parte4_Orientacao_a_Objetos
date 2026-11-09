package guiaDidaticoPT4;

import java.util.Scanner;

public class Exercicio09IA {

    static class Celular {

        private String marca;
        private String modelo;
        private float preco;

        public Celular(String marca, String modelo, float preco) {
            this.marca = marca;
            this.modelo = modelo;
            this.preco = preco;
        }

        @Override
        public String toString() {
            return String.format(
                    "Marca: %s%nModelo: %s%nPreço: R$ %.2f%n---------------",
                    marca,
                    modelo,
                    preco
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Celular[] celulares = new Celular[3];

        for (int i = 0; i < celulares.length; i++) {

            System.out.printf("Celular %d%n", i + 1);

            System.out.print("Marca: ");
            String marca = input.nextLine();

            System.out.print("Modelo: ");
            String modelo = input.nextLine();

            System.out.print("Preço: ");
            float preco = input.nextFloat();
            input.nextLine();

            celulares[i] = new Celular(marca, modelo, preco);
        }

        System.out.println("\nCELULARES CADASTRADOS\n");

        for (Celular celular : celulares) {
            System.out.println(celular);
        }

        input.close();
    }
}