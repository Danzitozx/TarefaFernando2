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
public class Exercicio348 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String nomes[] = new String[5];
        double pr1[] = new double[5];
        double pr2[] = new double[5];
        double media[] = new double[5];
        
        for(int L = 0; L<=4; L++){
            System.out.println("\ndigite " + L + 1 + " nome: ");
            nomes[L] = input.nextLine();
            System.out.println("digite a 1 nota: ");
            pr1[L] = input.nextDouble();
            System.out.println("digite a 2 nota: ");
            pr2[L] = input.nextDouble();
            media[L] = (pr1[L] + pr2[L])/2;
        }
        System.out.println("\n\nRelacao final\n");
        for(int L = 0; L<=4; L++){
            System.out.println("\n" + L + 1 + "- " + nomes[L]);
            System.out.println("\n" + pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
            
        }
        System.out.println("\n");
    }
}
