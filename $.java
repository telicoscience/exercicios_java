import java.util.*;

public class TemplateJava {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // MARCADOR: início do seu código
        System.out.println("Olá, Java!");

        scanner.close();
    }

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static String readLine(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    public static int readInt(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Digite novamente:");
            scanner.next();
        }
        int numero = scanner.nextInt();
        scanner.nextLine();
        return numero;
    }
}