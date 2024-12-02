/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;


public class SomaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[10]; // Vetor para armazenar 10 números
        int soma = 0; // Variável para a soma dos números
        
        System.out.println("Digite 10 números inteiros:");
        
        // Loop para inserir números no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Adiciona o número à soma
        }
        
        // Calcula a média
        double media = (double) soma / numeros.length;
        
        // Exibe os resultados
        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Média dos números: " + media);
    }
} 

    
    

