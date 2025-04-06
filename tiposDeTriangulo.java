import java.util.*;

public class tiposDeTriangulo {

    public static String classificacao1(double a, double b, double c) {
        if (a >= b + c) {
            return "NAO FORMA TRIANGULO";
        } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
            return "TRIANGULO RETANGULO";
        } else if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
            return "TRIANGULO OBTUSANGULO";
        } else if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
            return "TRIANGULO ACUTANGULO";
        }
        return ""; // Retorno padrão caso nenhuma condição seja atendida
    }

    public static String classificacao2(double a, double b, double c) {
        if (a == b && b == c) {
            return "TRIANGULO EQUILATERO";
        }
        if (a == b || b == c || a == c) {
            return "TRIANGULO ISOSCELES";
        }
        return ""; // Retorno padrão caso nenhuma condição seja atendida
    }

    public static void main(String[] args) {
        // Inicialização das variáveis
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        // Ordena os três números
        double[] vetor = {a, b, c};
        Arrays.sort(vetor);

        // Imprime as classificações
        String resultado1 = classificacao1(vetor[2], vetor[1], vetor[0]);
        if (!resultado1.isEmpty()) {
            System.out.println(resultado1); // Imprime apenas se houver resultado
        }

        String resultado2 = classificacao2(vetor[2], vetor[1], vetor[0]);
        if (!resultado2.isEmpty()) {
            System.out.println(resultado2); // Imprime apenas se houver resultado
        }

        scanner.close();
    }
}

