package application;

import java.util.Scanner;

import entities.Banc;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int numConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String nome = sc.nextLine();


        System.out.println("Is there na initial deposit (y/n)?");
        char resp = sc.next().charAt(0);
        double deposito = 0;
        if (resp == 'y') {
            System.out.println("Enter initial deposit value: ");
            deposito = sc.nextDouble();
        }

        Banc conta = new Banc(numConta, nome, deposito);

        System.out.println("Account data: ");
        System.out.println(conta.getAccountInfo());

        System.out.println("Enter a deposit value: ");
        double novoDeposito = sc.nextDouble();
        conta.deposit(novoDeposito);
        System.out.println("Uptaded account data: ");
        System.out.println(conta.getAccountInfo());

        System.out.println("Enter a withdraw value: ");
        novoDeposito = sc.nextDouble();
        conta.withdraw(novoDeposito);
        System.out.println("Uptaded account data: ");
        System.out.println(conta.getAccountInfo());

    }
}