package desafio1.ex3;

import java.util.Objects;
import java.util.Scanner;

//3.	Faça um algoritmo que receba uma letra e retorne se a letra informada é vogal ou consoante.
public class VogalOuConsoante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String letra = sc.next();

        if (Objects.equals(letra, "a") || Objects.equals(letra, "e") || Objects.equals(letra, "i") || Objects.equals(letra, "o") || Objects.equals(letra, "u")) {
            System.out.println("A letra " + letra + " é uma vogal");
        } else {
            System.out.println("A letra " + letra + " é uma consoante");
        }
    }
}
