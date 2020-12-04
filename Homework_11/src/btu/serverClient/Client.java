package btu.serverClient;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Thread {
    Scanner scanner = new Scanner(System.in);
    ObjectOutputStream outputStream;
    ObjectInputStream inputStream;
    String IP, text;

    public void run() {
        System.out.print("Enter IP Address: ");
        IP = scanner.nextLine();
        try {
            Socket socket = new Socket(IP, 8080);
            System.out.println("Client connected to Server");
            while (true) {
                inputStream = new ObjectInputStream(socket.getInputStream());
                text = inputStream.readObject().toString();
                if (text.equals("-")) {
                    System.out.println("Connection closed");
                    inputStream.close();
                    outputStream.close();
                    break;
                }
                else {
                    System.out.printf("Server: %s\n", text);
                }

                outputStream = new ObjectOutputStream(socket.getOutputStream());
                System.out.printf("Client to server: %s\n", socket.getInetAddress());
                text = scanner.nextLine();
                if (text.equals("-")) {
                    outputStream.writeObject(text);
                    break;
                }
                else {
                    outputStream.writeObject(text);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}