package Server;

import java.io.*;
import java.net.Socket;

public class ConnectedClient extends Thread{
    protected Socket socket;
    OutputStream outputStream;
    InputStream inputStream;
    ObjectOutputStream objectOutputStream;
    ObjectInputStream objectInputStream;

    public ConnectedClient(Socket clientSocket) {
        this.socket = clientSocket;
    }

    public void run() {
        try {
            outputStream = socket.getOutputStream();
            inputStream = socket.getInputStream();
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectInputStream = new ObjectInputStream(inputStream);
        } catch (IOException e) {
            return;
        }
        while (true) {
            try {
                String read = (String) objectInputStream.readObject();
                ServerOperation serverOperation = ServerOperation.valueOf(read);
                if (serverOperation==ServerOperation.disconnect) {
                    socket.close();
                    return;
                } else {
                    Object object = objectInputStream.readObject();
                    executeOperation(serverOperation,object);
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    private synchronized void executeOperation(ServerOperation serverOperation,Object object){

    };
}
