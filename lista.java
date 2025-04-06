import java.util.ArrayList;
import java.util.List;

public class lista {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        // Adicionando elementos 
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Banana"); // Permite duplicatas 

        // Acessando elementos 
        System.out.println("Primeira fruta: "+frutas.get(0));

        // Interando pela lista 
        System.out.println("\nLista de frutas:");
        for (String fruta: frutas){
            System.out.println(fruta);
        }
    }
    
}
