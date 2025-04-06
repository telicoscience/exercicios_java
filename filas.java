import java.util.LinkedList;
import java.util.Queue;

public class filas {
    public static void main(String[] args) {
        Queue<String> filaDeClientes = new LinkedList<>();

        // Adicionando clientes à fila
        filaDeClientes.offer("Cliente 1");
        filaDeClientes.offer("Cliente 2");
        filaDeClientes.offer("Cliente 3");
        filaDeClientes.offer("Cliente 4");
        filaDeClientes.offer("Cliente 5");

        // Removendo e processando clientes
        System.out.println("Próximo cliente: "+ filaDeClientes.poll());
        System.out.println("Próximo cliente: "+ filaDeClientes.poll());
        System.out.println("Próximo cliente: "+ filaDeClientes.poll());

        // Verificando o próximo cliente sem remover 
        System.out.println("Cliente seguinte na fila: " + filaDeClientes.peek());
    }
}
