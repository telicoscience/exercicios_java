import java.util.Scanner;
import java.util.Arrays; 

public class ordenaTresNumeros {
    public static int[] ordena(int a, int b, int c)
    {
    int[] maior = {a, b, c};
    Arrays.sort(maior);     
    return maior;

   }
    public static void main(String[] args){
        // Crie um programa que ordene três números fornecidos pelo usuário em ordem crescente.
        int a, b, c; 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com três números inteiros seguidos de enter.");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt(); 
        System.out.println(Arrays.toString(ordena(a, b, c)));
        scanner.close();
    }
}
