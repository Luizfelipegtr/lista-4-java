package Exercicios_java4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_7_lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = input.nextInt();
        }

        Arrays.sort(vetor);

        System.out.print("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
