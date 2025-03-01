import java.util.Scanner; 

/*
 * Soma de Elementos de um Array
 * Crie um programa que some todos os elementos de um array de números inteiros.
 */
public class somaDeElementos {

    public static int somaElementos(int[] vetor){
        int i; 
        int soma = 0;
        for (i = 0; i < vetor.length; i++ ){
            soma += vetor[i];
        } 
        return soma; 
    }

    public static void main(String[] args) {
        Scanner vetor = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor que você quer somar");
        int tamanho = vetor.nextInt();
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho ; i ++ ){
            System.out.printf("Digite o valor do %dº elemento do vetor: \n ", i + 1);
            array[i] = vetor.nextInt();
        }
        System.out.println(somaElementos(array));
        vetor.close();
    }


    
}
