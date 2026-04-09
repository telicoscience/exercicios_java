import java.util.Scanner; 

public class TempoDeJogoComMinutos {

    public static String calcularDuracao(int hora1, int minuto1, int hora2, int minuto2){
        int hora = 0; 
        int minuto = 0; 
         if (hora2 >= hora1) {
           if (minuto2 < minuto1){
                hora = hora2 - hora1 - 1; 
                minuto = minuto2 + 60 - minuto1;

            }
            else {
                hora = hora2 - hora1; 
                minuto = minuto2 - minuto1;
            }
        }
        else if (hora2 < hora1) {
              if (minuto2 < minuto1){
                hora = 24 + hora2 - hora1 - 1; 
                minuto = minuto2 + 60 - minuto1;

            }
            else {
                hora = 24  + hora2 - hora1; 
                minuto = minuto2 - minuto1;
            }
        }
        return("O JOGO DUROU "+ hora + " HORA(S) " + minuto + " MINUTO(S)");

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hora1 = scanner.nextInt();
        int minuto1 = scanner.nextInt();
        int hora2 = scanner.nextInt();
        int minuto2 = scanner.nextInt();
        
       
        System.out.println(calcularDuracao(hora1, minuto1, hora2, minuto2));
        scanner.close();

    }
}
