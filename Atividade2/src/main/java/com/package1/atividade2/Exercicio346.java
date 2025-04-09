/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//346, 348, 351, 354, 356, 358, 360, 362, 370, 394, 398, 400, 413, 419
package com.package1.atividade2;

import java.util.Scanner;

/**
 *
 * @author okmen
 */
import java.util.Scanner;

public class Exercicio346 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        
        System.out.println("\nMENU");
        System.out.println("1 - Imprime o comprimento da frase");
        System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
        System.out.println("3 - Imprime a frase espelhada");
        System.out.println("4 - Termina o algoritmo");
        System.out.print("\nOpção: ");
        
        op = input.nextInt();
        input.nextLine(); // Consumir a quebra de linha após nextInt()
        
        if (op == 1) {
            System.out.print("\nDigite uma frase: ");
            String frase = input.nextLine();
            System.out.println("\nComprimento da frase: " + tam1(frase));
        } else if (op == 2) {
            System.out.print("\nDigite uma frase: ");
            String frase = input.nextLine();
            
            if (frase.length() < 2) {
                System.out.println("\nA frase deve ter pelo menos 2 caracteres.");
            } else {
                System.out.println("\nOs dois primeiros caracteres: " + primeiro(frase, 2));
                System.out.println("Os dois últimos caracteres: " + resto(frase, 2));
            }
        } else if (op == 3) {
            System.out.print("\nDigite uma frase: ");
            String frase = input.nextLine();
            System.out.println("\nFrase espelhada: " + inverter(frase));
        } else if (op == 4) {
            System.out.println("\nFim do algoritmo.");
        } else {
            System.out.println("\nOpção não disponível.");
        }
        
        input.close();
    }
    
    //retorna o tamanho da string
    public static int tam1(String frase) {
        return frase.length();
    }

    //retorna os primeiros 'n' caracteres da string
    public static String primeiro(String frase, int n) {
        return frase.substring(0, Math.min(n, frase.length()));
    }

    //retorna os últimos 'n' caracteres da string
    public static String resto(String frase, int n) {
        return frase.substring(Math.max(0, frase.length() - n));
    }

    //inverte a string
    public static String inverter(String frase) {
        StringBuilder sb = new StringBuilder(frase);
        return sb.reverse().toString();
    }
}

