import java.util.Scanner; 

public class TempoDeJogoComMin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hora1 = scanner.nextInt();
        int hora2 = scanner.nextInt();
        int tempo = 0; 

        if (hora2 > hora1) {
            tempo = hora2 - hora1; 
        }
        else if (hora2 <= hora1) {
            tempo = 24 - hora1 + hora2; 
        }
        System.out.println("O JOGO DUROU "+ tempo + " HORA(S)");
        

    }
}
