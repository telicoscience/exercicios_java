import java.io.IOException;
import java.util.Scanner; 
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class volta {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in); 
        int v = scanner.nextInt(); 
        int t = scanner.nextInt();
        System.out.println(2*v*t);
        scanner.close();
 
    }
 
} 

