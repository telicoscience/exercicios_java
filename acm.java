import java.util.*;

public class acm {

    public static int fatorial(int a) {
        if (a == 0) {
            return 1;
        }
        return a * fatorial(a - 1);
    }

    public static int acm2decimal(int a) {
        String numeroString = Integer.toString(a);
        int sum = 0;
        for (int i = 0; i < numeroString.length(); i++) {
            sum += Character.getNumericValue(numeroString.charAt(i))*fatorial(numeroString.length() - i);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0 ){
            System.out.println(acm2decimal(n));
            n = scanner.nextInt();
        }
        
        scanner.close();
    }
}
