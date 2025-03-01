import java.util.Scanner; 

public class ePalindromo {

    public static boolean teste(String[] frase){
        boolean result = true;

        for (int i = 0; i < frase.length / 2; i++) { // For que varre a string até a sua metade
            if (!frase[i].equals(frase[frase.length - i - 1])) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static String removeEspacos(String frase) {
        return frase.replaceAll("\\s+", ""); // Remove todos os espaços da frase
    }

    public static void executarTestes() {
        String[] frasesTeste = {
            "A man a plan a canal Panama",
            "racecar",
            "hello",
            "Was it a car or a cat I saw",
            "No lemon no melon"
        };

        for (String frase : frasesTeste) {
            String fraseAux = removeEspacos(frase.toLowerCase()); // Remove espaços e converte para minúsculas
            String[] fraseArray = fraseAux.split("");
            if (teste(fraseArray)) {
                System.out.println("\"" + frase + "\" é um palíndromo");
            } else {
                System.out.println("\"" + frase + "\" não é um palíndromo");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase, de preferência, um palíndromo");
        String frase = scanner.nextLine();
        String fraseAux = removeEspacos(frase.toLowerCase()); // Remove espaços e converte para minúsculas
        String[] fraseArray = fraseAux.split("");
        if (teste(fraseArray)) {
            System.out.println("A frase é um palíndromo");
        } else {
            System.out.println("A frase não é um palíndromo");
        }

        // Executa os testes
        executarTestes();

        scanner.close();
    }
}
