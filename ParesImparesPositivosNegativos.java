import java.util.Scanner;

public class ParesImparesPositivosNegativos {
  // Função que conta os números pares e ímpares
        public static String paresEImpares(int[] numeros)
        {
            int pares = 0, impares = 0;
            for (int i = 0; i < numeros.length; i++){
                if(numeros[i] % 2 == 0){
                    pares++; 
                }
                else {
                    impares++; 
                }
            }
            return (pares + " valor(es) par(es)\n" + impares+" valor(es) impar(es)"); 

        }
     // Função que conta os positivos e negativos
      public static String positivosENegativos( int[] numeros)
      {
        int positivos = 0, negativos = 0; 
        for (int i = 0; i < numeros.length; i++ ){
            if (numeros[i] > 0){
                positivos++; 
            }
            else if (numeros[i] < 0)
            {
                negativos++; 
            }
        }
        return (positivos + " valor(es) positivo(s)\n" + negativos + " valor(es) negativo(s)");
      }  


    public static void main(String[] args) {
        int[] num = new int[5];
        int i; 
        
        Scanner scanner = new Scanner(System.in);
        // Lê 5 números inteiros
        for(i = 0; i < 5;i++)
        {
            num[i] = scanner.nextInt();
        } 
        System.out.println(paresEImpares(num));
        System.out.println(positivosENegativos(num));
        scanner.close();

    }
    

}