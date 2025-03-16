import java.util.*;

public class quadradosDeFeynman {
    public static int quadrados(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++){
             sum += (int) Math.pow(i, 2);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            System.out.println(quadrados(n));
            n = scanner.nextInt();
        }
        scanner.close();
        
    }
}
