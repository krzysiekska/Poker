package Server;

public class MainServer {
    public static void main(String[] args){
        ServerListner serverListner = new ServerListner();
        System.out.println("Uruchamiam serwer...");
        serverListner.start();
    }
}
