import java.util.Scanner;

public class AumentoDeSalario {

    public static String calculaAumento(double salario) {
        double percentual, reajuste, novoSalario;

        if (salario <= 400) {
            percentual = 0.15;
        } else if (salario <= 800) {
            percentual = 0.12;
        } else if (salario <= 1200) {
            percentual = 0.10;
        } else if (salario <= 2000) {
            percentual = 0.07;
        } else {
            percentual = 0.04;
        }

        reajuste = salario * percentual;
        novoSalario = salario + reajuste;

        return String.format(
            "Novo salario: %.2f%nReajuste ganho: %.2f%nEm percentual: %.0f %%",
            novoSalario, reajuste, percentual * 100
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = scanner.nextDouble();
        System.out.println(calculaAumento(salario));
        scanner.close();
    }
}