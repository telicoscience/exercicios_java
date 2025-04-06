import java.util.HashMap;
import java.util.Map;

public class ExemploMapa {
    public static void main(String[] args) {
        Map<String, Integer> pontuacao = new HashMap<>();

        // Adicionando pontuações
        pontuacao.put("Alice", 95);
        pontuacao.put("Bob", 80);
        pontuacao.put("Carol", 98);

        // Acessando pontuações 
        System.out.println("Pontuação de Alice: "+pontuacao.get("Alice"));

        // Iterando pelo mapa
        for (String nome: pontuacao.keySet()){
            System.out.println(nome + ": "+ pontuacao.get(nome));
        }
    }
}
