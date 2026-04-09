import java.util.Scanner;

public class SeisImpares {

    public static void main(String[] args) {
        int numero, termo;
        Scanner scanner = new Scanner(System.in);

        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            termo = numero + 1;
        } else {
            termo = numero;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(termo);
            termo = termo + 2;
        }

        scanner.close();
    }
}