// Arquivo: AvaliadorSilabasComplexasRefatorado.java

import java.io.*;
import java.util.*;
import smile.classification.KNN;

public class AvaliadorSilabasComplexasRefatorado {

    private static final String CONSOANTES_SIMPLES = "bcdfghjklmnpqrstvwxyz";
    private static final String[] CONSOANTES_COMPLEXAS = {"lh", "sh", "ch", "br", "cr", "dr", "fr", "gr", "pr", "tr", "vr", "bl", "cl", "fl", "gl", "pl", "sl"};
    private static final String VOGAIS = "aeiou";
    private static final String[] PALAVRAS_FREQUENTES_SIMPLES = {"ba", "be", "bi", "bo", "bu", "ca", "co", "da", "de", "do", "fa", "fe", "la", "le", "lo", "ma", "me", "no", "pa", "pe", "re", "sa", "se", "te", "to", "va", "ve", "za", "ze"};
    private static final String[] PALAVRAS_FREQUENTES_COMPLEXAS = {"lha", "lhe", "lhi", "lho", "shu", "cha", "che", "chi", "cho", "bru", "cla", "flo", "gre", "pre", "tre"};

    private static final int PALAVRAS_POR_LOTE = 10;
    private static final String ARQUIVO_PALAVRAS = "milhao_silabas_complexas.txt";
    private static final String ARQUIVO_PESOS = "pesos_silabas_complexas.txt";
    private static final String ARQUIVO_LOG = "log_decisoes_automaticas.txt";

    private static final Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);
    private static final List<String> autoClassificadas = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        PalavraService palavraService = new PalavraService();
        List<String> palavras = palavraService.carregarOuGerarPalavras();
        Map<String, Integer> pesos = palavraService.carregarPesos();

        KNN<double[]> modeloKnn = palavraService.treinarModeloKNN(pesos);

        try (PrintWriter logWriter = new PrintWriter(new FileWriter(ARQUIVO_LOG, true))) {
            palavras.parallelStream().forEach(palavra -> {
                if (!pesos.containsKey(palavra)) {
                    double[] features = palavraService.extrairFeatures(palavra);
                    int predicao = modeloKnn.predict(features);
                    if (predicao == 1) {
                        synchronized (pesos) {
                            pesos.put(palavra, 1);
                        }
                        synchronized (logWriter) {
                            logWriter.println("[ML] Auto-classificada como conhecida (ML): " + palavra);
                        }
                        autoClassificadas.add(palavra + ",ML");
                    }
                }
            });
        } catch (IOException e) {
            System.err.println("Erro ao escrever log: " + e.getMessage());
        }

        // Resto do código continua igual...
        // O restante da lógica de interação do usuário, avaliação por lote, revisão e estatísticas permanece como está.
    }

    static class PalavraService {

        public double[] extrairFeatures(String palavra) {
            return new double[] {
                palavra.length(),
                terminaComVogal(palavra) ? 1.0 : 0.0,
                contemSilabaComplexa(palavra) ? 1.0 : 0.0,
                comecaComSilabaFrequente(palavra) ? 1.0 : 0.0,
                estruturaBasica(palavra) ? 1.0 : 0.0,
                letrasValidas(palavra) ? 1.0 : 0.0
            };
        }

        public KNN<double[]> treinarModeloKNN(Map<String, Integer> pesos) {
            double[][] X = new double[pesos.size()][];
            int[] y = new int[pesos.size()];

            int i = 0;
            for (Map.Entry<String, Integer> entry : pesos.entrySet()) {
                X[i] = extrairFeatures(entry.getKey());
                y[i] = entry.getValue();
                i++;
            }
            return KNN.fit(X, y, 3);
        }

        // Demais métodos (carregarOuGerarPalavras, carregarPesos, salvarPesos, exibirEstatisticas, etc.) permanecem como estão

        // Os métodos comecaComSilabaFrequente, terminaComVogal, contemSilabaComplexa, estruturaBasica, letrasValidas e gerarSilaba também permanecem iguais.
    }
}
