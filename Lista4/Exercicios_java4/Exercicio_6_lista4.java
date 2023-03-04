package Exercicios_java4;

import java.util.Scanner;

public class Exercicio_6_lista4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] temperaturas = new double[7];
        double somaTemperaturas = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura média do dia " + (i+1) + ": ");
            temperaturas[i] = input.nextDouble();
            somaTemperaturas += temperaturas[i];
        }

        double temperaturaMedia = somaTemperaturas / temperaturas.length;

        double menorTemperatura = temperaturas[0];
        double maiorTemperatura = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }

        int numDiasInferioresMedia = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < temperaturaMedia) {
                numDiasInferioresMedia++;
            }
        }

        System.out.println("Menor temperatura da semana: " + menorTemperatura);
        System.out.println("Maior temperatura da semana: " + maiorTemperatura);
        System.out.println("Temperatura média da semana: " + temperaturaMedia);
        System.out.println("Número de dias com temperatura inferior à média: " + numDiasInferioresMedia);
    }
}
