import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class OlamundoArquivo {
    public static void main(String[] args) {
        String nomeArquivo = "olamundo.txt";
        String mensagem = "ola mundo"; 

        try (FileWriter fileWriter = new FileWriter(nomeArquivo); 
        PrintWriter printWriter = new PrintWriter(fileWriter)){

            printWriter.println(mensagem); 

            System.out.println("A mensagem " + mensagem + " Foi escrita no arquivo " + nomeArquivo);
            
        } catch (IOException e) {
            System.err.println("Ocorreu um erro ao escrever no arquivo " + nomeArquivo);
        }
        
        public static String geradorDeMensagem(){
            
        }
    }
}
