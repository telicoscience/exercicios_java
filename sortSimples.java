import java.util.*;

/**
 * Classe: sortSimples
 * Autor: ${user}
 * Criado em: ${date}
 * Descrição: ${todo} Descreva brevemente o objetivo da classe.
 */

public class sortSimples {

    public static void main(String[] args) {

        int[] n = new int[3];
        
        Scanner scanner = new Scanner(System.in);
        // Lê 3 inteiros 
        for (int i = 0; i < 3; i++){
            n[i] = scanner.nextInt();
        }
        // Método que ordena o vetor 
        int[] sortedArray = SortVetor(n);
        for (int num : sortedArray) {
            print(num);
        }
        // Imprime uma linha em branco 
        System.out.println("\n");
    
        // Imprime o vetor original 
        for (int i = 0; i < 3; i++){
            print(n[i]);
        }
        scanner.close();

        }
        // Método que ordena o vetor 
        public static int[] SortVetor(int[] a){
            int[] _sort = Arrays.copyOf(a, a.length); // Cria uma cópia do array original
            Arrays.sort(_sort); // ordena a cópia do array
            return _sort;

        }
   

    // Método auxiliar para impressão rápida no console
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // Método auxiliar para ler uma linha completa
    public static String readLine(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    // Método auxiliar para ler um inteiro
    public static int readInt(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Digite novamente:");
            scanner.next(); // limpa a entrada inválida
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha pendente
        return numero;
    }

}
