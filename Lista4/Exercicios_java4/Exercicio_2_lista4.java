package Exercicios_java4;

import java.util.Arrays;

public class Exercicio_2_lista4 {
    public static void main(String[] args) {
        int[] V = {5,1,4,2,7,8,3,6};
        int[] V2 = new int[8];

        for (int i = 0; i < V.length; i++) {
            V2[i] = V[i] * 2;

        }
        System.out.println("Desde 2019 desejando meter a porrada no erick: " + Arrays.toString(V2));

    }
}
