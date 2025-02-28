import java.util.Scanner;

public class ePrimo {

     
    public static void main(String[] args) {
        boolean primo = true; 
        System.out.println("Digite um número inteiro positivo");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long tempoInicial = System.currentTimeMillis();
        for(int i = 2; i < n; i++){
            if (n % i == 0){
                 primo = false; 
                 break;
            } else {
                primo = true; 
            }
        }
        System.out.println(primo);
        scanner.close();
        System.out.println(System.currentTimeMillis() - tempoInicial);
    }
    
}
