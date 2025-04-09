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
public class Exercicio360 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int ultdia[] = new int[12];
        String signo[] = new String[12];
        int data, dia, mes;
        for(int i = 0; i<12; i++){
            System.out.println("\ndigite seu signo: ");
            signo[i] = input.nextLine();
            System.out.println("\ndigite ultimo dia: ");
            ultdia[i] = input.nextInt();
        }
        System.out.println("\ndiigte data no formato ddmm ou 9999 para terminar");
        data = input.nextInt();
        while(data == 9999){
            dia = data /100;
            mes = data/100;
            mes = mes - 1;
            if(dia > ultdia[mes]){
                mes = (mes+1) % 12;
            }
            System.out.println("\nsigno: " + signo[mes] + "\n");
            System.out.println("\ndite data no formato ddmm ou 9999 para terminar");
            data = input.nextInt();;
        }
        System.out.println("\n");
    }
}
