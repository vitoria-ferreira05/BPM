package condicionais.ex4;

import java.util.Locale;
import java.util.Scanner;

//4.	Faça um algoritmo que receba uma nota entre 0 e 10, e retorne no console o valor conforme regras abaixo:
//  a.	Aprovado – caso a nota seja maior ou igual a 8
//  b.	Em recuperação – caso a nota seja maior ou igual que 6 e menor que 8
//  c.	Reprovado – caso a nota seja inferior a 6
public class Nota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite uma nota de 0 a 10: ");
        double nota = sc.nextDouble();

        if (nota >= 8) {
            System.out.println("Aprovado!");
        } else if (nota >= 6) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
