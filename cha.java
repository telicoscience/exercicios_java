import java.util.*;

public class cha {

    public static void main(String[] args) {
        int[] respostas = new int[10];
        
        int i;
        // Entrada de dados: o programa lê duas linhas. A primeira é um número inteiro de 1 a 4 que indica 
        // o tipo de chá e o segundo, um vetor de 4 entradas, que indica a resposta de 5 participantes. 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha após o número inteiro
        System.out.println("Digite o vetor de 5 entradas em linha: ");
        String part = scanner.nextLine(); // Lê a linha inteira
        String _part = part.replaceAll("\\s+", ""); // Remove todos os espaços

        int acertos = 0; 
       for(i = 0; i < 5 ; i++){
        int resposta = Character.getNumericValue(_part.charAt(i));
        if(resposta == n) {
            acertos++;

        }

       }
       System.out.println(acertos);
        scanner.close();
    }
}
