package net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
  public static void main(String[] args) {

    try {
      Socket server = new Socket("localhost", 6565);

      // Strumień  wyjściowy - wysyłanie do servera
      PrintWriter output = new PrintWriter(server.getOutputStream(),true);

      // Strumień wejściowy - odbieranie od servera
      Scanner input = new Scanner(server.getInputStream());

      new Thread(() -> {

        while (input.hasNext()) {
          System.out.println("Server wysłał " + input.nextLine());
        }
      }).start();

      Scanner keyboard = new Scanner(System.in);
      String query;

      // odczyt łańcucha z klawiatury i wysłanie do serwera
      System.out.println("Wpisz wiadomość do servera:");
      while (!(query = keyboard.nextLine()).equals("Q")) {
        output.println(query);
      }

      server.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
