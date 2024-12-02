/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author madpais
 */
public class BuscaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando o vetor para armazenar 10 nomes
        String[] nomes = new String[10];
        
        System.out.println("Insira 10 nomes:");
        // Inserção dos nomes no vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        
        // Solicitar o nome a ser buscado
        System.out.print("\nDigite o nome que deseja buscar: ");
        String nomeBuscado = scanner.nextLine();
        
        // Realizando a busca no vetor
        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) { // Ignora maiúsculas/minúsculas
                System.out.println("Nome encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        
        // Se o nome não foi encontrado
        if (!encontrado) {
            System.out.println("Nome não encontrado no vetor.");
        }
        
        scanner.close(); // Fechar o scanner
    }
}
    
    

