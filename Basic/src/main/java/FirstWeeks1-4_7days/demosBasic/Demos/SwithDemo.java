package Demos;

import java.util.Scanner;

public class SwithDemo {
    public static void main(String[] args) {

        System.out.print("Podaj kolor: ");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();


        switch(color){
            case "red":
                System.out.println("Podałeś kolor czerwony");
            break;

            case "blue":
                System.out.println("Podałeś kolor niebieski");
            break;

            case "green":
                System.out.println("Podałeś kolor zielony");
            break;

            case "yellow":
                System.out.println("Podałeś kolor żółty");
                break;

            default:
                System.out.println("Nie znam takiego koloru");
        }
    }
}
