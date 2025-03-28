import java.util.*;

/**
 * Classe: Coordenadas
 * Autor: Télico Oliveira
 * Criado em: 21/03/2025
 * Descrição: Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
 * A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
 Se o ponto estiver na origem, escreva a mensagem “Origem”.
 Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.


 */

public class Coordenadas {

    public static void main(String[] args) {
        float[] coordenadas = new float[2];
        Scanner scanner = new Scanner(System.in);

        // MARCADOR: início do seu código
        // Lê dois valores de ponto flutuante com uma casa decimal 
        for (int i = 0; i < 2 ; i++){
             coordenadas[i] = scanner.nextFloat();
        }
        if ( coordenadas[0] > 0 && coordenadas[1] > 0){
            System.out.println("Q1");
        } else if (coordenadas[0] < 0 && coordenadas[1] > 0){
            System.out.println("Q2");
        } else if (coordenadas[0] < 0 && coordenadas[1] < 0){
            System.out.println("Q3");
        } else if (coordenadas[0] > 0 && coordenadas[1]< 0){
            System.out.println("Q4");
        } else if(coordenadas[0] == 0 && coordenadas[1] != 0){
            System.out.println("Eixo Y");
        } else if (coordenadas[0] != 0 && coordenadas[1] == 0){
            System.out.println("Eixo X");
        } else if (coordenadas[0] == 0 && coordenadas[1] == 0){
            System.out.println("Origem");
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
