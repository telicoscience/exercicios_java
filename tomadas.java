import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class tomadas {
    public static int _tomadas(int t1, int t2, int t3, int t4)
    {
        return t1 + t2 + t3 + t4 - 3; 
    }
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(_tomadas(a, b, c, d));
        scanner.close();
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
    }
 
}