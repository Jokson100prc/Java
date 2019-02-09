package net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpDemo {
  public static void main(String[] args) throws IOException {

    URL adresSerwera = new URL("http://www.google.com");
    HttpURLConnection http = (HttpURLConnection) adresSerwera.openConnection();

//    System.out.println(http.getRequestMethod());
//    System.out.println(http.getContent());

    Scanner in = new Scanner(http.getInputStream());

    // filter by: <meta > tags
    Pattern pattern = Pattern.compile("meta([^>]*)");
    Matcher matcher;
    while (in.hasNext()) {
        String line = in.nextLine();
        matcher = pattern.matcher(line);
        while (matcher.find()){

          System.out.println(matcher.group(1));
      }
    }
  }
}
