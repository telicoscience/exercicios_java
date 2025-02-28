import java.util.Scanner;
public class calculadora {
    public static int soma(int a, int b){
        return a + b; 
    }
    public static int subtracao(int a, int b){
        return a - b; 
    }
    public static int multiplicacao(int a, int b){
        return a * b; 
    }
    public static int divisao(int a, int b){
        return a / b; 
    }
    public static void main(String[] args) {
       System.out.println("Escolha a operação.");
       System.out.println("1 - Soma");
       System.out.println("2 - Subtração");
       System.out.println("3 - Multiplicação");
       System.out.println("4 - Divisão");
        Scanner scanner = new Scanner(System.in); 
        int operacao = scanner.nextInt();
        switch (operacao) {
            case 1:
                System.out.println("Você escolheu a operação de adição.");
                System.out.println("Digite o primeiro número inteiro: ");
                int n1 = scanner.nextInt();
                System.out.println("Digite o segundo número inteiro: ");
                int n2 = scanner.nextInt();
                System.out.println("Soma: " + soma(n1, n2));
                break;
            case 2:
                System.out.println("Você escolheu a operação de subtração.");
                System.out.println("Digite o primeiro número inteiro: ");
                n1 = scanner.nextInt();
                System.out.println("Digite o segundo número inteiro: ");
                n2 = scanner.nextInt();
                System.out.println("Subtração: " + subtracao(n1, n2));
                break;
            case 3:
                System.out.println("Você escolheu a operação de multiplicação.");
                System.out.println("Digite o primeiro número inteiro: ");
                n1 = scanner.nextInt();
                System.out.println("Digite o segundo número inteiro: ");
                n2 = scanner.nextInt();
                System.out.println("Multiplicação: " + multiplicacao(n1, n2));
                break;
            case 4:
                System.out.println("Você escolheu a operação de divisão.");
                System.out.println("Digite o primeiro número inteiro: ");
                n1 = scanner.nextInt();
                System.out.println("Digite o segundo número inteiro: ");
                n2 = scanner.nextInt();
                System.out.println("Divisão: " + divisao(n1, n2));
                break;
                        
            default:
                break;
                    }
                scanner.close();
        }
}
