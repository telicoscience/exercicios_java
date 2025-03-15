import java.util.*;

public class Estiagem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a entrada - ela sera um array de inteiros que, quando for digitado um valor zero, ela termina de iterar a leitura. 
        int entrada[] = new int[50];
        for (int i = 0; i < 50; i++){
            do{
                entrada[i] = scanner.nextInt();
            } while(entrada[i] != 0);
            break;
    
        }
       
        scanner.close();
    }
    
}
