import java.util.Scanner; 

public class NotasEMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valorStr = scanner.next().replace(",", "."); // Lê a entrada como string e substitui a vírgula por ponto
        float valor = Float.parseFloat(valorStr); // Converte a string para float
        System.out.printf("%.2f\n", valor); // Imprime o valor lido com 2 casas decimais

        int notas100 = (int) valor / 100;
        valor = valor % 100;
        int notas50 = (int) valor / 50;
        valor = valor % 50;
        int notas20 = (int) valor / 20;
        valor = valor % 20;
        int notas10 = (int) valor / 10;
        valor = valor % 10;
        int notas5 = (int) valor / 5;
        valor = valor % 5;
        int notas2 = (int) valor / 2;
        valor = valor % 2;
        int moedas1 = (int) valor;
        valor = valor - moedas1;
        int moedas50 = (int) (valor / 0.50);
        valor = (float) (valor % 0.50);
        int moedas25 = (int) (valor / 0.25);
        valor = (float) (valor % 0.25);
        int moedas10 = (int) (valor / 0.10);
        valor = (float) (valor % 0.10);
        int moedas5 = (int) (valor / 0.05);
        valor = (float) (valor % 0.05);
        int moedas1cent = (int) (Math.round(valor / 0.01));

        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50.00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20.00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10.00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5.00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2.00\n", notas2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moedas50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moedas25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moedas10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moedas5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moedas1cent);

        scanner.close();
    }
}
