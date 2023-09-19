package condicionais.ex5;

import java.util.ArrayList;
import java.util.Collections;

//5.	Faça um algoritmo que receba uma lista de número e retorne a mesma lista ordenada de forma decrescente (maior para o menor).
public class Descrescente {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(2);
        listaNumeros.add(1);
        listaNumeros.add(5);
        listaNumeros.add(8);
        listaNumeros.add(3);
        listaNumeros.add(10);
        listaNumeros.add(6);
        listaNumeros.add(4);

        Collections.sort(listaNumeros, Collections.reverseOrder());

        System.out.println(listaNumeros);
    }
}
