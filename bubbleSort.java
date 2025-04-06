import java.util.*;
public class bubbleSort {

    public static void main(String[] args) {
        int numeros[] = {23, 4, 33, 45, 19, 12, 28, 40};
        int x; 
        for (int i = 1; i < numeros.length; i++){
            for (int j = numeros.length - 1; j >= i; j--){
                if (numeros[j - 1] > numeros[j]){
                    x = numeros[j - 1]; 
                    numeros[j - 1] = numeros[j];
                    numeros[j] = x; 
                }
            }
            System.out.printf("\n %s %2d", "Iteração", i);
            for (int k = 0; k < numeros.length; k++)
            System.out.printf("%5d", numeros[k]);
        }
    }

    
}
