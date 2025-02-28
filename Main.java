import java.io.IOException;
import java.util.Scanner;

 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
    public static int calculaTempo(int distancia) {
        int tempo = 2*distancia;
        return tempo;
    }
    public static void main(String[] args) throws IOException {
        int distancia; 
        Scanner scanner = new Scanner(System.in);
        distancia = scanner.nextInt();
        System.out.println(calculaTempo(distancia) + " minutos.");
        scanner.close();
 
       
 
    }
 
} 