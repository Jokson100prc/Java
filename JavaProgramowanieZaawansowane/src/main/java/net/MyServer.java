package net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
  public static void main(String[] args) {

    try {
      ServerSocket serverSocket = new ServerSocket(6565);
      Socket client = serverSocket.accept();
      System.out.println("Złosił się klient!!!");

      //wysyłanie i odbieranie danych od klienta
      //Strumień do wysyłania danych do klienta
      PrintWriter output = new PrintWriter(client.getOutputStream(), true);

      //Strumień do odbierania danych od klienta
      Scanner input = new Scanner(client.getInputStream());
      output.println("Witaj na serwerze!\n\"Wpisz wiadomość do servera:");

      while (input.hasNext()) {
        output.println("ECHO " + input.nextLine());
      }

      System.out.println("Koniec połączenia.");

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
