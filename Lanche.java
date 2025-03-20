import java.util.*;

public class Lanche {

    public static void main(String[] args) {
        // Instancia o scanner 
        Scanner scanner = new Scanner(System.in);
        
        // Lê dois inteiros a e b
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.printf("Total: R$ %.2f\n", b * 4.00);
                break;
            case 2:  
                System.out.printf("Total: R$ %.2f\n", b * 4.50);
                break;
            case 3: 
                System.out.printf("Total: R$ %.2f\n", b * 5.00);
                break;
            case 4: 
                System.out.printf("Total: R$ %.2f\n", b * 2.00);
                break;
            case 5: 
                System.out.printf("Total: R$ %.2f\n", b * 1.50);
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }

        // Encerra o scanner 
        scanner.close();
    }
}
