import java.util.Scanner; 


public class mes {

    public static String buscaMes(int num){
    switch (num) {
        case 1:
            return ("January");
            
        case 2:
            return ("February");
            
        case 3:
            return ("March");
            
        case 4:
            return ("April");
            
        case 5:
            return ("May");
            
        case 6:
            return ("June");
            
        case 7:
            return ("July");
            
        case 8:
            return ("August");
            
        case 9:
            return ("September");
            
        case 10:
            return ("October");
            
        case 11:
            return ("November");
            
            case 12:
                return ("December");

            default:
                return ("Invalid month");
            
    }
}

public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int numero = scanner.nextInt(); 
    System.out.println(buscaMes(numero));
    scanner.close();
}
    
}
