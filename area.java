import java.util.Scanner;

public class area {
     
    public static double triangulo(double a, double b){
        double _triangulo; 
        _triangulo = (a * b) / 2; 
        return _triangulo;

    }

    public static double circulo(double a){
        double _circulo; 
        _circulo = 3.14159 * Math.pow(a, 2); 
        return _circulo; 


    }

    public static double trapezio(double a, double b, double c){
        double _trapezio;
        _trapezio = (a + b) * c / 2;
        return _trapezio; 

    }

    public static double quadrado(double a){
        double _quadrado;
        _quadrado = Math.pow(a, 2);  
        return _quadrado; 

    }

    public static double retangulo (double a, double b){
        double _retangulo; 
        _retangulo = a * b; 
        return _retangulo; 

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.printf("TRIANGULO: %.3f\n", triangulo(a, c));
        System.out.printf("CIRCULO: %.3f\n", circulo(c));
        System.out.printf("TRAPEZIO: %.3f\n", trapezio(a, b, c));
        System.out.printf("QUADRADO: %.3f\n", quadrado(b));
        System.out.printf("RETANGULO: %.3f\n", retangulo(a, b));
        scanner.close();
    }
}
