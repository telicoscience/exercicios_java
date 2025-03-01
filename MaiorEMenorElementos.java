import java.util.Scanner;
import java.util.Arrays;

public class MaiorEMenorElementos {
    /*
     * Encontrar o Maior e o Menor Número em um Array**
    - Escreva um programa que encontre o maior e o menor número em um array de números inteiros.
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = scanner.nextInt(); 
        int[] vetor = new int[tamanho];

        for (int i = 0 ; i < tamanho; i++){
            System.out.printf("Digite o %dº elemento do vetor: \n", i + 1);
            vetor[i] = scanner.nextInt();

        }
        // Ordena o vetor do menor para o maior
        Arrays.sort(vetor);
        // Obtem o primeiro e o último elemento (maior e menor)
        int menor = vetor[0]; 
        int maior = vetor[vetor.length - 1];
        // Imprime o maior e o menor elemento do vetor 
        System.out.printf("O menor elemento do vetor é: %d", menor);
        System.out.printf("\nO maior elemento do vetor é: %d\n", maior);
        System.out.printf("[ ");
        for(int i = 0 ; i < tamanho ; i++){
            System.out.printf("%d ", vetor[i]);

        }
        System.out.println("]\n");
        // Fecha o scanner
        scanner.close();
    }
    
}
