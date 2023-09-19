package desafio3;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

// Descrição: Você deve calcular o consumo médio de um automóvel onde será informada a
//  distância total percorrida (em Km) e o total de combustível consumido (em
//  litros).
//- Entrada
//  Você receberá dois valores: um valor inteiro X com a distância total percorrida
//  (em Km, e um valor real Y que representa o total de combustível consumido, com
//  um dígito após o ponto decimal.
//  - Saída
//  Exiba o valor que representa o consumo médio do automóvel (3 casas após a
//  vírgula), incluindo no final a mensagem "km/l".
public class ConsumoMedioCombustivel {
    private static int distanciaTotalPercorrida;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite a distância percorrida: ");
        try {
            distanciaTotalPercorrida = sc.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Digite números inteiros para a distância percorrida em km");
        }
        System.out.print("Digite o combustivel consumido: ");
        double totalCombustivelConsumido = sc.nextDouble();

        double calculoConsumoMedio = distanciaTotalPercorrida / totalCombustivelConsumido;

        System.out.printf("\nConsumo médio do automóvel: %.3f km/l%n", calculoConsumoMedio);

    }
}
