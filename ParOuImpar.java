import java.util.Scanner; 

public class ParOuImpar {
    public static String parouimpar(int a){
        if (a % 2 ==0) { 
            return "Par"; 
        } else {
            return "Ímpar"; 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();
        System.out.println(parouimpar(n));  

        scanner.close();

    }
}
