public class ordenaCaracteres {
    
    public static void main(String[] args) {
        String letras[] = {"AG", "BD", "AA", "AE", "AF", "AC", "AB", "B"};
        String x; 
        for (int i = 1; i < letras.length; i++){
            for (int j = letras.length - 1; j >= i; j--){
                if (letras[j - 1].compareTo(letras[j]) > 0){
                    x = letras[j - 1]; 
                    letras[j - 1] = letras[j];
                    letras[j] = x; 
                }
            }
            System.out.printf("\n%s%2d", "Iteração", i);
            for (int k = 0; k < letras.length; k++)
                System.out.printf("%5s", letras[k]);
        }
    }
}
