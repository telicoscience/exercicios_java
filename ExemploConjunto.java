import java.util.HashSet;
import java.util.Set;

public class ExemploConjunto {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();

        // Adicionando cores 
        cores.add("Vermelho"); 
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Vermelho");

        // Interando pelo conjunto 
        System.out.println("Cores:");
        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
