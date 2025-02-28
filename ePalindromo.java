import java.util.Scanner; 

public class ePalindromo {

    public static boolean teste(String[] frase){
        if(frase[0].equals(frase[frase.length - 1])){
            return true; 

        }
        else{

        }
        return false; 

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase, de preferência, um palíndromo");
        String frase = scanner.nextLine();
        String[] fraseArray = frase.split("");
        System.out.println(teste(fraseArray));
        scanner.close();
    }
}
