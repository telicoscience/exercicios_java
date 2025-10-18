// Crie um programa** que insira 5 nomes em um `ArrayList` e os imprima em ordem inversa
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    
    public static void main(String[] args) {
        ArrayList<String> lista = new java.util.ArrayList<>();
        String[] nomes = {"Ana", "Beto", "Carla", "Dimas", "Elias"};
        for (int i = 0; i < 4; i++)
        {
            lista.add(nomes[i]);
            }
        
        for (int i = lista.size() - 1;  i >= 0; i--){
            System.out.println(lista.get(i));
        }

    }
}
