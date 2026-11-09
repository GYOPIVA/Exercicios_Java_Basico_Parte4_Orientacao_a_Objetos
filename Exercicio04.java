package guiaDidaticoPT4;

import java.util.Scanner;

public class Exercicio04 {

    static class Conta {
        private float saldo;

        double depositar(float valor) {
            return saldo += valor;
        }

        double sacar(float valor) {
            return saldo -= valor;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Conta conta = new Conta();
        conta.saldo = 5000.00f;

        boolean ativo = true;

        while (ativo) {

            System.out.println("\nSaldo atual: R$ " + conta.saldo);
            System.out.println("1) Sacar");
            System.out.println("2) Depositar");
            System.out.println("3) Sair");

            int opcao = input.nextInt();

            if (opcao != 1  && opcao != 2 && opcao != 3) {
                System.out.println("\nSaldo atual: R$ " + conta.saldo);
                System.out.println("1) Sacar");
                System.out.println("2) Depositar");
                System.out.println("3) Sair");
                opcao = input.nextInt();
            }

            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor para saque: ");
                    float valorSaque = input.nextFloat();

                    if (conta.saldo < valorSaque) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        conta.sacar(valorSaque);
                        System.out.println("Saque realizado com sucesso!");
                    }
                    break;

                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    float valorDeposito = input.nextFloat();

                    conta.depositar(valorDeposito);

                    System.out.println("Depósito realizado com sucesso!");
                    break;

                case 3:
                    ativo = false;
                    System.out.println("Saldo final: R$ " + conta.saldo);
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        input.close();
    }
}

