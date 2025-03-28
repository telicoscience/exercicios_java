import java.io.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        for (int i = 0; i < n; i++){
            for(int j = 0; j <= n ; j++){
                if (i + j >= n){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
          // Imprime a quebra de linha somente se não for a última linha
          if (i < n - 1) {
            System.out.println();
        }
        }
    
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
