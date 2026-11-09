package guiaDidaticoPT4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercicio03 {

    static class Retangulo{
        float largura;
        float altura;

        float area(float altura, float largura){
            return (altura*largura);
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura do retangulo: ");
        float largura = sc.nextFloat();
        System.out.println("Digite a altura do retangulo: ");
        float altura = sc.nextFloat();
        Retangulo retangulo01 = new Retangulo();
        retangulo01.largura = largura;
        retangulo01.altura = altura;
        System.out.printf("A area do retangulo é %.2f²cm",  retangulo01.area(largura, altura));
    }
}
