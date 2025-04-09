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
public class Exercicio358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double precocompra[] = new double[100];
        double precovenda[] = new double[100];
        double lucro;
        int totlucromenor10, totlucromenor20, totlucromaior20;
        totlucromenor10 = 0;
        totlucromenor20 = 0;
        totlucromaior20 = 0;
        
        for(int A = 0; A<100; A++){
            System.out.println("\n|Preco de compra: ");
            precocompra[A] = input.nextDouble();
            System.out.println("\nPreco de venda: ");
            precovenda[A] = input.nextDouble();
        }
        for(int A = 0; A<100; A++){
            lucro = precovenda[A] - precocompra[A];
            if(lucro<10){
                totlucromenor10 = totlucromenor10 + 1;
            }
            else{
                if(lucro <= 20){
                    totlucromenor20 = totlucromenor20 + 1;
                }
                else{
                    totlucromaior20 = totlucromaior20 + 1;
                }
            }
            System.out.println("\ntotal de mercadorias com lucro menor que 10%: " + totlucromenor10);
            System.out.println("\ntotal de mercadorias com 10% menor ou igual 20%: " + totlucromenor20);
            System.out.println("\ntotal de mercadorias com lucro menor que 20%: " + totlucromaior20);
            
            System.out.println("\n");
        }
        

        
    }
}
