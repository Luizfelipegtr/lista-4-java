package Exercicios_java4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_3_lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insira X: ");
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int[] M = new int[10];
        int X = input.nextInt();

        for (int i = 0; i < 10; i++) {
            M[i] = A[i] * X;
        }
        System.out.println("A int : " + Arrays.toString(M));
    }
}
