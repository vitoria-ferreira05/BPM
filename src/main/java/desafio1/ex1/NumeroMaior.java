package desafio1.ex1;

import java.util.Scanner;

//1.	Faça um algoritmo que dados 2 números inteiros seja informado na saída do console qual número é o maior
public class NumeroMaior {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = sc.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("Primeiro número é maior");
        } else {
            System.out.println("Segundo numero é maior");
        }
    }
}
