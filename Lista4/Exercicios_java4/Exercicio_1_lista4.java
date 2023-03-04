package Exercicios_java4;

import java.util.Arrays;

public class Exercicio_1_lista4 {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * i * i;

        }
        System.out.println("Vetor de cubos: " + Arrays.toString(vetor));
    }
}
