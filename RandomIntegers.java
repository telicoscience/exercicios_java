// RandomIntegers.java
// Inteiros aleatórios deslocados e escalonados
import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        
        // Faz o loop 20 vezes
        for (int counter = 1; counter <=20; counter++){
            // Seleciona o inteiro aleatório entre 1 e 6 
            int face = 1 + randomNumbers.nextInt(6);
            System.out.printf("%d ", face);

            if (counter % 5 == 0) {
                System.out.println();
            }
        }
    }
}
