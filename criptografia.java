import java.util.*;

/**
 * Classe: criptografia
 * Autor: ${user}
 * Criado em: ${date}
 * Descrição: ${todo} Descreva brevemente o objetivo da classe.
 */

 public class criptografia {
 
     public static void main(String[] args) {
 
         Scanner scanner = new Scanner(System.in);
 
         int n = scanner.nextInt();
         scanner.nextLine(); // Corrige o problema da quebra de linha após nextInt()
 
         String[] frase = new String[n];
         String[] invertida = new String[n];
 
         // Leitura das frases corretamente
         for (int i = 0; i < n; i++) {
             frase[i] = scanner.nextLine();
         }
 
         // Processamento (criptografia)
         for (int i = 0; i < n; i++) {
             char[] chars = frase[i].toCharArray();
 
             for (int j = 0; j < chars.length; j++) {
                 if ((chars[j] >= 'a' && chars[j] <= 'z') || (chars[j] >= 'A' && chars[j] <= 'Z')) {
                     chars[j] = (char) (chars[j] + 3);
                 }
             }
 
             // Armazena a frase criptografada novamente no vetor
             frase[i] = new String(chars);
         }
         // Na segunda passada, a linha deverá ser invertida.
         for(int i = 0; i < n; i++){
            invertida[i] = new StringBuilder(frase[i]).reverse().toString();
            System.out.println(invertida[i]);
           
         }
         // Na terceira passada, todo caractere da metade em diante é deslocado 1 posição à esquerda na tabela ASCII
        for (int i = 0; i < n; i++) {
            char[] chars = invertida[i].toCharArray();

            for (int j = chars.length / 2; j < chars.length; j++) {
                chars[j] = (char)(chars[j] - 1);
            }

    // Armazena novamente a frase modificada na posição correta do vetor
    invertida[i] = new String(chars);
    print(invertida[i]);
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
