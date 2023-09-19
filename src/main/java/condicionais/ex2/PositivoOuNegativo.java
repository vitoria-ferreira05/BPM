package condicionais.ex2;

import java.util.Scanner;

//2.	Faça um algoritmo que receba um número inteiro e retorne se o número é positivo ou negativo
public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println(numero + " é negativo");
        } else {
            System.out.println(numero + " é positivo");
        }
    }
}
