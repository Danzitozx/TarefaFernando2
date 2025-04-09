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
public class Exercicio354 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[15];
        for(int L = 0; L<=14; L++){
            System.out.println("\ndigite" + L + 1 + " numero ");
            num[L] = input.nextInt();
        }
        System.out.println("Relacao dos numeros\n");
        for(int L = 0; L<=14; L++){
            System.out.println("\n" + L + 1 + "- " + num[L]);
            if(num[L] % 2==0){
                System.out.println("e Par");
            }
            else{
                System.out.println("e impar");
            }
        }
    }
}
