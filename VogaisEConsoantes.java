import java.util.Scanner;

public class VogaisEConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com uma frase");
        String frase = scanner.nextLine();
        int vogais = 0;
        int consoantes = 0;
        String todasVogais = "aeiouAEIOUáéíóúÁÉÍÓÚãõÃÕâêîôûÂÊÎÔÛ";

        for (int i = 0; i < frase.length(); i++) {
            char ch = frase.charAt(i);
            if (todasVogais.indexOf(ch) != -1) {
                vogais++;
            } else if (Character.isLetter(ch)) {
                consoantes++;
            }
        }

        System.out.println("A frase tem " + vogais + " vogais e " + consoantes + " consoantes.");
        scanner.close();
    }
}
