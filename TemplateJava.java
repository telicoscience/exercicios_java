import java.util.*;

/**
 * Classe: ${type_name}
 * Autor: ${user}
 * Criado em: ${date}
 * Descrição: ${todo} Descreva brevemente o objetivo da classe.
 */

public class ${type_name} {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // MARCADOR: início do seu código
        ${cursor}

        scanner.close();
    }

    // Método auxiliar para impressão rápida no console
    public static void print(Object obj) {
        System.out.println(obj);
    }

    // Método auxiliar para ler uma linha completa
    public static String readLine(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    // Método auxiliar para ler um inteiro
    public static int readInt(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida! Digite novamente:");
            scanner.next(); // limpa a entrada inválida
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha pendente
        return numero;
    }

}
