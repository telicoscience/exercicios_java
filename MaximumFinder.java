// MaximunFinder.java 
// Método maximum declarado pelo programador com três parâmetros double
import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Entre com 3 números reais separados por espaços");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        // Determina o valor máximo 
        double result = maximum(number1, number2, number3);
        System.out.println("O máximo é: "+result);
        input.close();

    }
    public static double maximum(double x, double y, double z){
        double maximumValue = x; // Supõe que x é o maior valor inicial 
        if (y > maximumValue)
            maximumValue = y; 
        if (z > maximumValue)
            maximumValue = z; 
        return maximumValue; 
    }

}
