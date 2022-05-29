import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread server = new Thread(new Server());
        server.start();
        Client client = new Client();
        client.start();

        server.join();
    }
}
