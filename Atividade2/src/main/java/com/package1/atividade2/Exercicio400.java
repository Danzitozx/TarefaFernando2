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
public class Exercicio400 {

    /**
     * @param args the command line arguments
     */
    static final int NUM_QUARTOS = 50;
    static String[] situacao = new String[NUM_QUARTOS];
    static int[] leitos = new int[NUM_QUARTOS];
    static double[] preco = new double[NUM_QUARTOS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < NUM_QUARTOS; i++) {
            System.out.println("Digite o número de leitos do quarto " + (i + 1) + ": ");
            leitos[i] = scanner.nextInt();
            System.out.println("Digite o preço do quarto " + (i + 1) + ": ");
            preco[i] = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Situação do quarto (livre/alugado/reservado): ");
            situacao[i] = scanner.nextLine();
        }

        System.out.println("\nLista de Quartos:");
        for (int i = 0; i < NUM_QUARTOS; i++) {
            System.out.println("Quarto " + (i + 1) + " - Leitos: " + leitos[i] + ", Preço: " + preco[i] + ", Situação: " + situacao[i]);
        }

        System.out.println("\nQuartos Livres:");
        for (int i = 0; i < NUM_QUARTOS; i++) {
            if (situacao[i].equalsIgnoreCase("livre")) {
                System.out.println("Quarto " + (i + 1) + " - Leitos: " + leitos[i] + ", Preço: " + preco[i]);
            }
        }

        scanner.close();
    }
}
