import java.util.Scanner;

// Prorgrama que lê um valor inteiro, que é um tempo em duração em segundos de 
// um determinado evento em uma fábrica e informa expressando em horas:minutos:segundos
public class conversaoDeTempo {
    
    public static void main(String[] args) {
        Scanner chico = new Scanner(System.in);
        int n, horas, minutos, segundos;
        n = chico.nextInt(); 
        horas = n / 3600;
        minutos = (n % 3600) / 60;
        segundos = n % 60; 
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
        chico.close();
    }
}
