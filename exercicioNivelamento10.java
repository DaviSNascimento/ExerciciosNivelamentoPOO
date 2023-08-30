package ExerciciosNivelamento;

import java.util.Scanner;
// Escreva um algoritmo em Java que leia um vetor de 10 números inteiros e imprima o maiorValor número do vetor.

public class exercicioNivelamento10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ola");
        int valor[] = new int[10];
        int maiorValor = 0;
        for (int i = 0; i < valor.length; i++) {
            System.out.println("digite um valor: ");
            valor[i] = scan.nextInt();
        }
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > maiorValor) {
                maiorValor = valor[i];
            }
        }
        System.out.println("O maior valor e: " + maiorValor + "    ");
    }
}
