import java.util.Scanner;

public class InversaoDeString {
    public static void main(String[] args) {
        // Leia uma string e armazene em uma variável 
        System.err.println("Entre com uma string: ");
        Scanner scanner = new Scanner(System.in);
        String frase  = scanner.nextLine();
        // Crie uma string vazia para armazenar a string invertida 
        String resultado = "";
        for (int i = frase.length() - 1; i >= 0 ; i--)
        {
            resultado = resultado + frase.charAt(i);
        }
        System.out.println(resultado);
        scanner.close();
    }    
}
