import java.util.Scanner; 

public class numerosImpares {
    // Função que conta os números ímpares menores ou iguais a num
    public static void contar(int numero)
    {
       
        for(int i = 1; i <= numero; i = i + 2)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // Scanner para ler o valor de um número num
        Scanner scanner = new Scanner(System.in); 
        int num = scanner.nextInt();
        contar(num);
        scanner.close();
    }
    
}
