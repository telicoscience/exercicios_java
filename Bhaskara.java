import java.util.*;
public class Bhaskara {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if (a == 0) {
            System.out.println("Impossivel calcular\n");
        } else {
            // Cálculo do Delta 
            float Delta = (float) (Math.pow(b, 2) - 4 * a * c); 
            if (Delta < 0){
                System.out.println("Impossivel calcular\n");
            } else {
               float R1 = (float) (-1 * b + Math.sqrt(Delta)) / (2 * a);
               float R2 = (float) (-1 * b - Math.sqrt(Delta)) / (2 * a);
               System.out.printf("R1 = %.5f\nR2 = %.5f", R1, R2);
            }
        }
        scanner.close();
        
    }
}
