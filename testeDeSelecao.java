import java.util.Scanner;

public class testeDeSelecao {

    public static String teste(int a, int b, int c, int d){
        if (b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0 && a % 2 == 0) {
            return "Valores aceitos";
        } else {
            return "Valores nao aceitos";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(teste(a, b, c, d));
        scanner.close();
    }
}
