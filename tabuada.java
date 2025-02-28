import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número natural entre 1 e 10");
        int n = scanner.nextInt();
        for (int i = 1; i < 11; i ++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
        scanner.close();
    }

    
}
