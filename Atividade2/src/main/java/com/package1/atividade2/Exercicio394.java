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
import java.util.Scanner;

public class Exercicio394 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int tam, flag, flag1, flag2;
        int nota1[] = new int[50];
        int nota2[] = new int[50];
        int media[] = new int[50];
        String op;
        String nomes[] = new String[50];
        flag = 0;
        flag1 = 0;
        flag2 = 0;

        do {
            System.out.println("\n\n\n");
            System.out.println("\nMenu\n");
            System.out.println("1 - Entrar nomes");
            System.out.println("2 - Entrar nota 1");
            System.out.println("3 - Entrar nota 2");
            System.out.println("4 - Calcular média");
            System.out.println("5 - Listar no display");
            System.out.println("6 - Sair");
            System.out.print("\nOpção: ");
            
            op = input.nextLine();

            if (op.equals("1")) {
                flag = 1;
                for (int L = 0; L < 50; L++) {
                    System.out.println("\nDigite o nome " + (L + 1) + " (até 30 caracteres, MAIÚSCULAS): ");
                    nomes[L] = input.nextLine().toUpperCase();

                    while (nomes[L].length() > 30) {
                        System.out.println("\nNome deve ter até 30 caracteres. Digite novamente:");
                        nomes[L] = input.nextLine().toUpperCase();
                    }

                    tam = 30 - nomes[L].length();
                    for (int k = 0; k < tam; k++) {
                        nomes[L] += " ";
                    }
                }
            } else if (op.equals("2")) {
                if (flag == 0) {
                    System.out.println("\nNenhum nome cadastrado.");
                } else {
                    for (int i = 0; i < 50; i++) {
                        System.out.print("\nDigite a 1ª nota para " + nomes[i].trim() + ": ");
                        nota1[i] = input.nextInt();
                    }
                    input.nextLine();
                    flag1 = 1;
                }
            } else if (op.equals("3")) {
                if (flag == 0) {
                    System.out.println("\nNenhum nome cadastrado.");
                } else {
                    for (int i = 0; i < 50; i++) {
                        System.out.print("\nDigite a 2ª nota para " + nomes[i].trim() + ": ");
                        nota2[i] = input.nextInt();
                    }
                    input.nextLine();
                    flag2 = 1;
                }
            } else if (op.equals("4")) {
                if (flag == 0 || flag1 == 0 || flag2 == 0) {
                    System.out.println("\nNem todos os dados foram cadastrados.");
                } else {
                    for (int i = 0; i < 50; i++) {
                        media[i] = (3 * nota1[i] + 7 * nota2[i]) / 10;
                    }
                    System.out.println("\nMédias calculadas com sucesso!");
                }
            } else if (op.equals("5")) {
                if (flag == 0 || flag1 == 0 || flag2 == 0) {
                    System.out.println("\nNem todos os dados foram cadastrados.");
                } else {
                    System.out.println("\nNome\t\t\tNota1\tNota2\tMédia\n");
                    for (int i = 0; i < 50; i++) {
                        System.out.println(nomes[i] + "\t" + nota1[i] + "\t" + nota2[i] + "\t" + media[i]);
                    }
                }
            } else if (op.equals("6")) {
                System.out.println("\nSaindo...");
            } else {
                System.out.println("\nOpção não disponível.");
            }

        } while (!op.equals("6"));

        input.close();
    }
}
