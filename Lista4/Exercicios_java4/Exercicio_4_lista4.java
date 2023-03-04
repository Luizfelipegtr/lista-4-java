package Exercicios_java4;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio_4_lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira 10 nomes: ");

        String[] Nm = new String[10];
        String Ts;

        for (int i = 0; i < Nm.length; i++) {
            Nm[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(Nm));
        Ts = input.nextLine();
        boolean achei = false;

        for (String Nomes : Nm){
            if (Ts.equals(Nm)) {
                achei = true;
            }

        }

        if (achei == true) {
            System.out.println("Achei");

        }else {
            System.out.println("Não Achei");
        }



    }
}
