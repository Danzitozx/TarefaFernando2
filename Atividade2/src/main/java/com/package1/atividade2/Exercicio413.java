/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.package1.atividade2;

import java.util.Scanner;

/**
 *
 * @author okmen
 */
public class Exercicio413 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int somaQuadrados = 0;

        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
                if (j > 4 - i && matriz[i][j] % 2 != 0) {
                    somaQuadrados += Math.pow(matriz[i][j], 2);
                }
            }
        }

        System.out.println("\nMatriz digitada:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        System.out.println("\nRaiz quadrada da soma dos quadrados dos ímpares abaixo da diagonal secundária: " + Math.sqrt(somaQuadrados));

        scanner.close();
    }
}
    

