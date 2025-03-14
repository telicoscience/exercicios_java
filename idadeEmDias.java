import java.util.Scanner; 

public class idadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = scanner.nextInt();
        System.out.printf("%d ano(s)\n", dias /365);
        dias  = dias % 365; 
        System.out.printf("%d mes(es)\n", dias / 30);
        dias = dias % 30; 
        System.out.printf("%d dia(s)\n", dias);
        scanner.close();
    }
}
