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
public class Exercicio351 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
       int num;
       String nomes[] = new String[5];
       for(int L = 0; L<=4; L++){
           System.out.println("\nnome" + L + 1 + ": ");
           nomes[L] = input.nextLine();
       }
        System.out.println("\nDigite o numero da pessoa: ");
        num = input.nextInt();
        while(num < 1 || num > 5){
            System.out.println("\nNumero fora do intervalo");
            System.out.println("\nDigite o numero da pessoa");
            num = input.nextInt();
        }
        System.out.println("\n" + nomes[num - 1]);
        System.out.println("\n");
    }
    
}
