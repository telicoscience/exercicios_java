public class Matriz {

    public static void main(String[] args) {
        // Imprimindo uma matriz 3x3 simples (i + j)
        int[][] matriz = new int[3][3];
        System.out.println("Matriz 3x3 gerada com i + j:");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = i + j;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }

        System.out.println();

        // Matrizes para teste de produto
        double[][] matrizC = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        double[][] matrizD = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
        };

        // Produto de matrizC x matrizD
        double[][] resultado = produtoDeMatrizes( matrizC, matrizD);

        System.out.println("Produto de matrizC x matrizD:");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println("|");
        }

        System.out.println();

        // Testando inversa de uma matriz 2x2
        float[][] A = {
            {4, 7},
            {2, 6}
        };

        // Testando o determinante da matriz 
        System.out.println("Determinante da matriz Teste: " + determinante(matrizD));


        double[][] inversa = matrizInversa(A);

        if (inversa != null) {
            System.out.println("Matriz inversa:");
            for (int i = 0; i < inversa.length; i++) {
                System.out.print("| ");
                for (int j = 0; j < inversa[i].length; j++) {
                    System.out.printf("%.2f ", inversa[i][j]);
                }
                System.out.println("|");
            }
        } else {
            System.out.println("A matriz não possui inversa.");
        }

        System.out.println();

        // Criando e preenchendo duas matrizes 20x20 para testes
        int[][] matrizA = new int[20][20];
        int[][] matrizB = new int[20][20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matrizA[i][j] = i + j;
                matrizB[i][j] = (i + 1) * (j + 1);
            }
        }

        // Soma das matrizes 20x20 (exemplo de uso)
        int[][] somaAB = soma(matrizA, matrizB);

        System.out.println("Parte da soma das matrizes 20x20 (primeiras 5 linhas):");
        for (int i = 0; i < 5; i++) {
            System.out.print("| ");
            for (int j = 0; j < 20; j++) {
                System.out.print(somaAB[i][j] + "\t");
            }
            System.out.println("|");
        }
    }

    // Soma de duas matrizes
    public static int[][] soma(int[][] A, int[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) {
            return null;
        }

        int linhas = A.length;
        int colunas = A[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = A[i][j] + B[i][j];
            }
        }

        return resultado;
    }

    // Produto de duas matrizes
    public static double[][] produtoDeMatrizes(double[][] A, double[][] B) {
        if (A[0].length != B.length) {
            return null;
        }

        int linhas = A.length;
        int colunas = B[0].length;
        int comum = A[0].length;

        double[][] produto = new double[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                for (int k = 0; k < comum; k++) {
                    produto[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return produto;
    }

    // Inversa de uma matriz quadrada (Gauss-Jordan)
    public static double[][] matrizInversa(float[][] a) {
        int n = a.length;

        // Corrigido: só continua se for quadrada
        if (a[0].length != n) {
            return null;
        }

        // Cria matriz aumentada
        double[][] augmented = new double[n][2 * n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                augmented[i][j] = a[i][j];
            }
            augmented[i][i + n] = 1.0;
        }

        // Gauss-Jordan
        for (int i = 0; i < n; i++) {
            double pivot = augmented[i][i];
            if (pivot == 0) {
                return null;
            }

            for (int j = 0; j < 2 * n; j++) {
                augmented[i][j] /= pivot;
            }

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = augmented[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        augmented[k][j] -= factor * augmented[i][j];
                    }
                }
            }
        }

        // Extrai a parte da direita (a inversa)
        double[][] inversa = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inversa[i][j] = augmented[i][j + n];
            }
        }

        return inversa;
    }
public static double determinante(double[][] matrizD) {
    int n = matrizD.length;

    // Verificar se a matriz é quadrada
    for (int i = 0; i < n; i++) {
        if (matrizD[i].length != n) {
            throw new IllegalArgumentException("A matriz não é quadrada.");
        }
    }

    // Criar uma cópia da matriz para não modificar a original
    double[][] copia = new double[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            copia[i][j] = matrizD[i][j];
        }
    }

    double det = 1.0;

    for (int i = 0; i < n; i++) {
        // Procurar o pivô diferente de zero
        int piv = i;
        while (piv < n && copia[piv][i] == 0) {
            piv++;
        }

        if (piv == n) {
            return 0; // matriz singular
        }

        // Trocar linhas se necessário
        if (piv != i) {
            double[] temp = copia[i];
            copia[i] = copia[piv];
            copia[piv] = temp;
            det *= -1;
        }

        det *= copia[i][i]; // multiplicar pelo pivô

        // Eliminar abaixo do pivô
        for (int j = i + 1; j < n; j++) {
            double fator = copia[j][i] / copia[i][i];
            for (int k = i; k < n; k++) {
                copia[j][k] -= fator * copia[i][k];
            }
        }
    }

    return det;
}

    }


