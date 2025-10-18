import java.util.Scanner;

public class paresEntreCinco {
    
    public static isPar(int a){
        if (a % 2 == 0){
            return true; 
        } else {
            return false; 
        }
    }
    public static void main(String[] args) {
        int[] num = new int[5];
        int i; 
        Scanner scanner = new Scanner(System.in);
        int contador = 0; // Inicializa o contador com 0
        // Lê os dados dos 5 números

        for ( i = 0; i < 5; i++){
            num[i] = scanner.nextInt();
        }

        for (i = 0; i < 5; i ++ ){
           System.out.println(isPar(num[i]));
        }
        scanner.close();

    }
    
}
