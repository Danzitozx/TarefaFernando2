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
public class Exercicio419 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] A = new int[5][5];
        int[][] B = new int[5][5];
        int[][] DIF = new int[5][5];

        System.out.println("Digite os elementos da matriz A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento A[" + (i + 1) + "][" + (j + 1) + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nDigite os elementos da matriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento B[" + (i + 1) + "][" + (j + 1) + "]: ");
                B[i][j] = scanner.nextInt();
                DIF[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("\nMatriz Diferença:");
        for (int[] linha : DIF) {
            for (int elemento : linha) {
                System.out.print(elemento + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
    

