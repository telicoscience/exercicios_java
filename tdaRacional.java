import java.util.Scanner;

public class tdaRacional {
    public static int mdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static String formatarFracao(int numerador, int denominador) {
        int divisor = mdc(numerador, denominador);
        numerador /= divisor;
        denominador /= divisor;

        if (denominador < 0) {
            numerador *= -1;
            denominador *= -1;
        }

        return numerador + "/" + denominador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String[] resultados = new String[n]; // Armazena os resultados para impressão posterior

        for (int i = 0; i < n; i++) {
            String[] partes = scanner.nextLine().split(" ");
            int n1 = Integer.parseInt(partes[0]);
            int d1 = Integer.parseInt(partes[2]);
            char operador = partes[3].charAt(0);
            int n2 = Integer.parseInt(partes[4]);
            int d2 = Integer.parseInt(partes[6]);

            int numerador = 0, denominador = 1;

            switch (operador) {
                case '+':
                    numerador = n1 * d2 + n2 * d1;
                    denominador = d1 * d2;
                    break;
                case '-':
                    numerador = n1 * d2 - n2 * d1;
                    denominador = d1 * d2;
                    break;
                case '*':
                    numerador = n1 * n2;
                    denominador = d1 * d2;
                    break;
                case '/':
                    numerador = n1 * d2;
                    denominador = n2 * d1;
                    break;
            }

            String antesReducao = numerador + "/" + denominador;
            String aposReducao = formatarFracao(numerador, denominador);
            resultados[i] = antesReducao + " = " + aposReducao;
        }

        // **For separado para impressão**
        for (int i = 0; i < n; i++) {
            System.out.println(resultados[i]);
        }

        scanner.close();
    }
}
