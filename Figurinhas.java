import java.util.Scanner; 

public class Figurinhas {
    public static int calculaMdc(int a , int b){
        a = Math.abs(a); 
        b = Math.abs(b); 

        while (b != 0){
            int temp = b; // Guarda o valor de b temporariamente
            b = a % b; // atualiza b para o resto da divisão de a por b
            a = temp; // Atualiza o valor anterior de b
        }
        return a; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroDeCasos = scanner.nextInt(); 
        int[] a = new int[numeroDeCasos];
        int[] b = new int[numeroDeCasos]; 
        int[] saida = new int[numeroDeCasos];
        
        for(int i = 0; i < numeroDeCasos; i++){
             a[i] = scanner.nextInt(); 
             b[i] = scanner.nextInt();
             saida[i] = calculaMdc(a[i], b[i]);

        }
        // Loop que printa a saída do programa
        for (int i = 0; i < numeroDeCasos; i++){
            System.out.println(saida[i]);
        }
        
        scanner.close();


    }
}
