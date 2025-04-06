import java.util.Scanner;
public class triangulo {
    public static boolean isTriangulo(float a, float b, float c)
    {   
        if( a >= b + c || b >= a + c || c >= a + b){
            return false; 
        } else {
            return true; 
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a  = scanner.nextFloat();
        float b  = scanner.nextFloat();
        float c  = scanner.nextFloat();
        float perimetro = a + b + c; 
        float area = (a + b) * c / 2;
        if (isTriangulo(a, b, c) == true){
            System.out.println("Perímetro: "+ perimetro);
        } else {
            System.out.printf("Área: "+ area);


        }
        scanner.close();
        
    }
}
