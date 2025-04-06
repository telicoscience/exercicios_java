import java.util.*;
public class numerosPositivos {
    public static void main(String[] args) {
        double[] numeros = new double[6];
        Scanner scanner = new Scanner(System.in);
        int cont = 0; // Inicializando o contador em zero
        // Escaneie os dados de numeros
        for (int i = 0; i < 6; i ++){
            numeros[i] = scanner.nextDouble();
            if (numeros[i] > 0){
                cont = cont + 1; 
            }
        }
        System.out.println(cont +" valores positivos");
        scanner.close();

    }
}
