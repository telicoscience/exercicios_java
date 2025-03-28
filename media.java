import java.util.*;

/**
 * Classe: media
 * Autor: Télico Oliveira
 * Criado em: 21/03/2025
 * Descrição: ${todo} Descreva brevemente o objetivo da classe.
 */

public class media {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // MARCADOR: início do seu código
         
        float[] notas = new float[4];
        // Lê as 4 notas em linha
        for (int i = 0; i < 4 ; i++){
            notas[i] = scanner.nextFloat();
        }

        float media = (2 * notas[0] + 3 * notas[1] + 4 * notas[2] + notas[3]) / 10; 

        if (media >= 7){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        } else if ( media < 7 && media >= 5){
            System.out.printf("Media: %.1f\n", media);
            float nota_exame = scanner.nextFloat();
            System.out.println("Aluno em exame.");
            System.out.printf("Nota do exame: %.1f\n", nota_exame);
            float nova_media = (media + nota_exame) / 2;
            if (nova_media >= 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", nova_media);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", nova_media);
                
            }
        } else {
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }

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
