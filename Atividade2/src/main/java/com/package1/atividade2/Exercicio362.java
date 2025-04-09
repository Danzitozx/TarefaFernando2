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
public class Exercicio362 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int vet1[] = new int[10];
        int vet2[] = new int[20];
        int vetc[] = new int[10];
        int L = 0;
        int c;
        int d;
        System.out.println("\nentrada de dados do vetor1 com 10 elementos");
        for(int i = 0; i <= 9; i++){
            System.out.println("\nentre com " + i + 1 + "elemento: ");
            vet1[i] = input.nextInt();
        }
        System.out.println("\nentrada de dador do vetor 2 com 20 elementos");
        for(int i = 0; i <= 19; i++){
            System.out.println("\nentre com " + i + 1 + "elemento: ");
            vet2[i] = input.nextInt(); 
        }
        for(int i = 0; i<=9; i++){
            vetc[i] = -99999999;
        }
        for(int i = 0; i<=9; i++){
            c = 0;
            while(vet1[i] == vet2[c] && c<19){
                c = c + 1;
            }
            if(vet1[i] == vet2[c])
                d = 0;
            while(vet1[i] == vetc[d] && d<L){
                d = d + 1;     
            }
            if(d == L){
                vetc[d] = vet1[i];
                L = L + 1;
            }
        }
        if(L == 0){
            System.out.println("\n\nElementos comuns\n\n");
            for(int i = 0; i<= L - 1; i++){
                System.out.println("\n" + vetc[i]);
            }
        }
        else{
            System.out.println("\nNao existem elementos comuns");
        }
        System.out.println("\n");
    }
}
