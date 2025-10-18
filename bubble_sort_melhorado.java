import java.util.*;
public class bubble_sort_melhorado {
    public static void main(String[] args)
    { 
        int x[] = new int [5];
        int j, i, aux;
        Scanner entrada = new Scanner(System.in);
        // Carregando os números no vetor 
        for (i = 0; i <=4; i++){
            System.out.println("Digite o "+(i + 1)+"° número: ");
            x[i] = entrada.nextInt();
        }
        // Ordenação de forma crescente 
        // Laço com a quantidade de elementos do vetor - 1
        for (j = 1; j<= 4; j++)
        {
            // Laço que percorre da última posição à posição j do vetor
            for (i=4; i>=j; i-- )
            {
                if(x[i] < x[i-1])
                {
                    aux = x[i];
                    x[i] = x[i-1]; 
                    x[i-1] = aux;
                }
            }
        }
        // Mostrando o vetor ordenado
        for (i=0; i<=4; i++)
        {
            System.out.println((i+1) + "° número: "+ x[i]);
        }
        entrada.close();

        

        
    }
}
