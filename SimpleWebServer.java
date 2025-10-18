import java.io.*;
import java.net.*;

public class SimpleWebServer {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Servidor web rodando em http://localhost:" + port);

            while (true) {
                Socket client = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));

                // Lê a primeira linha da requisição (ex: GET / HTTP/1.1)
                String line = in.readLine();
                if (line != null && !line.isEmpty()) {
                    System.out.println("Requisição: " + line);
                }

                // Responde com um HTML simples
                String response = """
                    HTTP/1.1 200 OK\r
                    Content-Type: text/html\r
                    \r
                    <html><body><h1>It works!</h1></body></html>
                    """;
                out.write(response);
                out.flush();

                client.close();
            }
        }
    }
}
