public class GaussJordan {

    public static void main(String[] args) {
        // Exemplo de matriz 2x2 para inverter
        double[][] matriz = {
            {1, 2, 0, 0, 0, 0, 1, 0.01, 0, 0},
            {0, 1, 3, 0, 0, 0, 0, 0, 'c', 0},
            {0, 0, 1, 4, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 5, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 6, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 7, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 8, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 9, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1, 10},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}
        };

        System.out.println("Calculando a inversa da matriz com Gauss-Jordan passo a passo:");
        pausa();
        double[][] inversa = matrizInversaVisual(matriz);

        if (inversa != null) {
            System.out.println("Matriz inversa calculada com sucesso:");
            pausa();
            imprimirMatriz(inversa);
        } else {
            System.out.println("A matriz não possui inversa.");
        }
    }

    // Método principal de inversão com visualização passo a passo
    public static double[][] matrizInversaVisual(double[][] A) {
        int n = A.length;

        if (A[0].length != n) {
            System.out.println("A matriz não é quadrada.");
            return null;
        }

        double[][] augmented = new double[n][2 * n];

        // Inicializa matriz aumentada A | I
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmented[i][j] = A[i][j];
                pausa();
            }
            augmented[i][i + n] = 1.0;
        }

        System.out.println("Matriz aumentada inicial:");
        imprimirMatrizAumentada(augmented);
        pausa();

        // Gauss-Jordan
        for (int i = 0; i < n; i++) {
            double pivot = augmented[i][i];
            if (pivot == 0) {
                System.out.println("Pivô zero encontrado. A matriz não tem inversa.");
                return null;
            }

            // Normaliza a linha do pivô
            System.out.println("Normalizando linha " + i + " (dividindo por " + pivot + "):");
            for (int j = 0; j < 2 * n; j++) {
                augmented[i][j] /= pivot;
                pausa();
            }
            imprimirMatrizAumentada(augmented);
            pausa();

            // Elimina os outros elementos da coluna
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double fator = augmented[k][i];
                    if (fator != 0) {
                        System.out.println("Eliminando valor na linha " + k + ", coluna " + i + " (fator: " + fator + ")");
                        for (int j = 0; j < 2 * n; j++) {
                            augmented[k][j] -= fator * augmented[i][j];
                        }
                        imprimirMatrizAumentada(augmented);
                        pausa();
                    }
                }
            }
        }

        // Extrai a inversa (parte direita da aumentada)
        double[][] inversa = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inversa[i][j] = augmented[i][j + n];
            }
        }

        return inversa;
    }

    // Imprime a matriz aumentada (A | I)
    public static void imprimirMatrizAumentada(double[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == n) System.out.print("|| "); // separador entre A e I
                System.out.printf("%6.2f ", matriz[i][j]);
            }
            System.out.println("|");
        }
        System.out.println();
    }

    // Imprime uma matriz qualquer
    public static void imprimirMatriz(double[][] matriz) {
        for (double[] linha : matriz) {
            System.out.print("| ");
            for (double v : linha) {
                System.out.printf("%6.2f ", v);
            }
            System.out.println("|");
        }
    }
    
    // Pausa de 0,1 segundo entre os passos
    public static void pausa() {
        try {
            Thread.sleep(50); // 100 milissegundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
