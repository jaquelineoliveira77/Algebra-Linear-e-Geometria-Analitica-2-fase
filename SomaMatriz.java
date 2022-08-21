/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Jaqueline Oliveira
 */
public class SomaMatriz {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] SomaMatrizAeB = new int[3][3];
        //Preenchendo a Matriz A
        //i = linha
        //j = coluna
        System.out.println("Digite os elementos da Matriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" linha " + i + " e " + "Coluna " + j + " : ");
                matrizA[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        System.out.println(" ");
        //Preenchendo a Matriz B
        System.out.println("Digite os elementos da Matriz B: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" linha " + i + " e " + "Coluna " + j + " : ");
                matrizB[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        System.out.println(" ");
        //Mostrando a Matriz A 
        System.out.println("Elementos da Matriz A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" linha " + i + " e " + "Coluna " + j + " : " + matrizA[i][j]);
            }
        }
        System.out.println(" ");
        //Mostrando a Matriz B 
        System.out.println("Elementos da Matriz B: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" linha " + i + " e " + "Coluna " + j + " : " + matrizB[i][j]);
            }
        }
        System.out.println(" ");
        //Somando a Matriz A com a Matriz B
        System.out.println("Somas das Matrizes: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                SomaMatrizAeB[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println(" ");
        //Mostrando o Resultado da soma da matriz A e B
        System.out.println("Soma da Matriz A com a Matriz B, Resultado: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(" linha " + i + " + " + "Coluna " + j + " = " + SomaMatrizAeB[i][j]);
            }
        }
    }
}
