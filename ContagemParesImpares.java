/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class ContagemParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[15];
        int pares = 0, impares = 0;

        // Solicitar entrada de 15 números inteiros
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Verificar se o número é par ou ímpar
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibir resultados
        System.out.println("\nQuantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}