import java.util.Scanner;

public class maior {

    public static int maiorvalor(int a, int b){

        int _maior;

        _maior = (a + b + Math.abs(a - b)) / 2;

        return _maior; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int a = scanner.nextInt(); 
        int b = scanner.nextInt(); 
        int c = scanner.nextInt(); 
        // Identifica o maior entre a e b
        System.out.printf("%d eh o maior\n", maiorvalor(c, maiorvalor(a, b)));

        

        scanner.close();
        
    }
    
}
