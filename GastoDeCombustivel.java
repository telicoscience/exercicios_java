import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      */

public class GastoDeCombustivel {

    public static float combustivel(int a , int b){
        float gasto; 
        gasto = (float) (a*b / 12.0);
        return gasto;
    }
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int velocidade; 
        int tempo;
        tempo = scanner.nextInt();
        velocidade = scanner.nextInt(); 
        System.out.printf("%.3f\n", combustivel(tempo, velocidade));
        scanner.close(); 
     
 
    }
 
}