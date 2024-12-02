/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;


public class MediaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // canner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Declaração do vetor para armazenar 5 notas
        double[] notas = new double[5];
        double soma = 0;

        // Entrada das notas
        System.out.println("Digite as 5 notas dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i]; // Soma das notas
        }

        // Cálculo da média
        double media = soma / notas.length;

        // Contadores para acima, abaixo e exatamente na média
        int acimaMedia = 0;
        int abaixoMedia = 0;
        int naMedia = 0;

        // Verifica cada nota em relação à média
        for (double nota : notas) {
            if (nota > media) {
                acimaMedia++;
            } else if (nota < media) {
                abaixoMedia++;
            } else {
                naMedia++;
            }
        }

        // Exibe os resultados
        System.out.println("\nResultado:");
        System.out.printf("Média das notas: %.2f\n", media);
        System.out.println("Alunos acima da média: " + acimaMedia);
        System.out.println("Alunos abaixo da média: " + abaixoMedia);
        System.out.println("Alunos exatamente na média: " + naMedia);

        // Fecha o scanner
        scanner.close();
    }
}
    
    

