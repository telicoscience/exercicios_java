import java.util.Scanner;
public class fatorial {
   public static long calcularFatorial(int n){
    if (n == 0){
        return 1; 

    } else if (n == 1) {
        return 1;
    } else {
        return n * calcularFatorial(n - 1);
    }
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();
        long tempoInicial = System.currentTimeMillis();
        System.out.println("O fatorial de " + n + " é: " + calcularFatorial(n));
        scanner.close();
        System.out.println(System.currentTimeMillis() - tempoInicial);

    }
}
