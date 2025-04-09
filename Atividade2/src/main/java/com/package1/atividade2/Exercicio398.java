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

public class Exercicio398 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = 0, codi, cod[] = new int[50], quant[] = new int[50], i;
        double preco[] = new double[50];

        System.out.print("\nDigite o código do produto ou 0 para acabar: ");
        codi = input.nextInt();

        while (k < 50 && codi != 0) {
            cod[k] = codi;
            System.out.print("\nDigite a quantidade do produto: ");
            quant[k] = input.nextInt();
            System.out.print("\nDigite o preço do produto: ");
            preco[k] = input.nextDouble();
            k++;

            if (k < 50) {
                System.out.print("\nDigite o código do produto ou 0 para acabar: ");
                codi = input.nextInt();
            } else {
                System.out.println("\nCentral completa");
            }
        }

        int op;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar novo produto");
            System.out.println("2 - Atualizar telefone");
            System.out.println("3 - Remover cadastro");
            System.out.println("4 - Listar cadastros");
            System.out.println("5 - Buscar por nome");
            System.out.println("6 - Sair");
            System.out.print("\nOpção: ");
            op = input.nextInt();
            input.nextLine(); 

            switch (op) {
                case 2:
                    System.out.print("\nDigite o nome: ");
                    String nnome = input.nextLine();
                    i = 0;
                    while (i < k && !nnome.equalsIgnoreCase(nnome)) {
                        i++;
                    }
                    if (i < k) {
                        System.out.print("\nDigite o novo telefone: ");
                        String ntel = input.nextLine();
                        System.out.println("\nTelefone atualizado com sucesso!");
                    } else {
                        System.out.println("\nNome não cadastrado.");
                    }
                    break;

                case 3:
                    System.out.print("\nDigite o nome: ");
                    nnome = input.nextLine();
                    i = 0;
                    while (i < k && !nnome.equalsIgnoreCase(nnome)) {
                        i++;
                    }
                    if (i < k) {
                        System.out.println("\nCadastro removido.");
                    } else {
                        System.out.println("\nNome não cadastrado.");
                    }
                    break;

                case 4:
                    System.out.println("\nRelação dos telefones:");
                    for (i = 0; i < k; i++) {
                        System.out.println("\nNome: " + cod[i]);
                        System.out.println("\nQuantidade: " + quant[i]);
                        System.out.println("\nPreço: " + preco[i]);
                        System.out.println("\n");
                    }
                    break;

                case 5:
                    System.out.print("\nDigite o nome: ");
                    nnome = input.nextLine();
                    i = 0;
                    while (i < k && !nnome.equalsIgnoreCase(nnome)) {
                        i++;
                    }
                    if (i < k) {
                        System.out.println("\nNome: " + nnome);
                    } else {
                        System.out.println("\nNome não cadastrado.");
                    }
                    break;

                case 6:
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nOpção não disponível.");
                    break;
            }
        } while (op != 6);

        input.close();
    }
}

