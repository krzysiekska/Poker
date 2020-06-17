package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListner {
    static final int PORT = 4810;


    public void start()
    {
        ServerSocket serverSocket = null;
        Socket socket = null;


        try {
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            e.printStackTrace();

        }
        while (true) {
            try {
                System.out.println("Oczekuje");
                socket = serverSocket.accept();
            } catch (IOException e) {
                System.out.println("I/O error: " + e);
            }
            // new thread for a client
            new ConnectedClient(socket).start();
        }

    }
}
