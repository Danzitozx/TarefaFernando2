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

public class Exercicio356 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t;
        int media[] = new int[15];
        String nomes[] = new String[15];
        String sit[] = new String[15];
        double pr1[] = new double[15];
        double pr2[] = new double[15];

        for (int L = 0; L <= 14; L++) {
            System.out.println("\n\nDigite " + (L + 1) + "º nome: ");
            nomes[L] = input.nextLine();

            while (nomes[L].length() > 30) { 
                System.out.println("\nNome deve ter até 30 caracteres. Digite novamente: ");
                nomes[L] = input.nextLine();
            }

            t = 30 - nomes[L].length();
            for (int c = 1; c <= t; c++) {
                nomes[L] = nomes[L] + " ";
            }

            System.out.println("\nDigite 1ª nota: ");
            pr1[L] = input.nextDouble(); 
            System.out.println("\nDigite 2ª nota: ");
            pr2[L] = input.nextDouble(); 
            input.nextLine(); 

            media[L] = (int) ((pr1[L] + pr2[L]) / 2); 

            if (media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
        }

        System.out.println("\n\n\n\t\t\tRelação Final\n");
        for (int i = 0; i <= 14; i++) { 
            System.out.println("\n" + (i + 1) + "- " + nomes[i] + "\t" + pr1[i] + "\t" + pr2[i] + "\t" + media[i] + "\t" + sit[i]);
        }
        System.out.println("\n");

        input.close();
    }
}

