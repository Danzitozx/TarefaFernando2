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
public class Exercicio370 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int nv;
        int voos[] = new int[1000];
        String nome[] = new String[1000];
        String id, nvd;
        int d;
 
        System.out.println("\nEtre com o numero de voos:");
        nv = input.nextInt();
        for(int i = 0; i<nv; i++){
            System.out.println("\nEntre com a identificacao de voo" + i + i + ": ");
            nome[i] = input.nextLine();
            System.out.println("\nEntre com a quantidade de lugares disponiveis no voo" + nome[i] + ": ");
            voos[i] = input.nextInt();
        }
        System.out.println("\nEntre com o numero do voo desejado ou @ para terminar: ");
        nvd = input.nextLine();
        while(nvd == "@"){
            d = 0;
            while(nvd == nome[i] && i < nv-1){
                i = i ++;
            }
            if(nome[i] == nvd){
                if(voos[i] > 0){
                    voos[i] = voos[i] - 1;
                    System.out.println("\nQual o numero da identidade do cliente?");
                    id = input.nextLine();
                    System.out.println("\nIdentidade:" + id + "Voo: " + nvd + "\n");
                }
                else{
                    System.out.println("\nNao existe mais lugares neste voo.\n");
                }
            }
            else{
                System.out.println("\nNao existe este voo\n");
            }
            System.out.println("\n\nEntre com o numero do voo desejado ou @ para terminar: ");
            nvd = input.nextLine();
            
        }
        System.out.println("\n");
    }
}
