import java.util.Scanner; 

public class SomadeDoisNumeros {
     
    public static int soma(int a, int b){
            return a + b; 
    
        }
        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in); 
          System.out.println("Digite o primeiro número inteiro: ");
          int n1 = scanner.nextInt();
          System.out.println("Digite o segundo número inteiro");
          int n2 = scanner.nextInt();
          System.out.println(soma(n1, n2));
          scanner.close();
 

    }
}
