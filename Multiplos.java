import java.util.*;
public class Multiplos {

    public static boolean saoMultiplos(int a, int b){
        if (a % b == 0 || b % a == 0) {
            return true; 
        } else 
        return false; 

    }
    public static void main(String[] args) {
        // Inicialização das variáveis
        int a, b; 
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (saoMultiplos(a, b) == true){
            System.out.println("São Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
        scanner.close();
        
    }
    
}
