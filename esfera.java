import java.util.Scanner;


public class esfera{
    public static double volume(double r){
        double v = ((4.0/3.0)*3.14159*(Math.pow(r, 3)));
        return v;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        System.out.printf("VOLUME = %.3f\n", volume(raio));
        scanner.close();
    }
}