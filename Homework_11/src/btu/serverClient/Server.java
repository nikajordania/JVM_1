package btu.serverClient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread {
    Scanner scanner = new Scanner(System.in);
    Socket socket;
    ObjectInputStream inputStream;
    String text;
    ObjectOutputStream outputStream;

    public void run(){
        try {
            ServerSocket serverSocket = new ServerSocket(8080);
            socket = serverSocket.accept();
            System.out.printf("Client connected from: %s\n", socket.getInetAddress());
            while (true) {
                outputStream = new ObjectOutputStream(socket.getOutputStream());
                System.out.format("Server send to:  %s:\n", socket.getInetAddress());
                text = scanner.nextLine();
                if(text.equals("-")){
                    outputStream.writeObject(text);
                    break;
                }
                else {
                    outputStream.writeObject(text);
                }

                inputStream = new ObjectInputStream(socket.getInputStream());
                text = inputStream.readObject().toString();

                if(text.equals("-")){
                    System.out.println("Client clean connection.");
                    inputStream.close();
                    outputStream.close();
                    break;
                }
                else {
                    System.out.printf("Client to Server: %s\n", text);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}