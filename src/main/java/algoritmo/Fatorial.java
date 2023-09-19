package algoritmo;

import java.util.Scanner;

// Desafio 2: Algoritmo
//  Descrição: Escreva um algoritmo que receba um valor N e retorne o seu fatorial (N!)
public class Fatorial {
    private static int numeroFatorial = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            numeroFatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + numeroFatorial);
    }
}
