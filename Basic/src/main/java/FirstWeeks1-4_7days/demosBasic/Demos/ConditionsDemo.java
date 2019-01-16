package Demos;

import java.util.Scanner;

public class ConditionsDemo {
    public static void main(String[] args) {
        System.out.print("Podaj kolor: ");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        if (color.equals("red")){
            System.out.println("Podałeś kolor czerwony");
        }else if (color.equals("blue")){
            System.out.println("Podałeś kolor niebieski");
        }else if (color.equals("green")){
            System.out.println("Podałeś kolor zielony");
        }else if (color.equals("yellow")){
            System.out.println("Podałeś kolor żółty");
        } else {
            System.out.println("Nie znam takiego koloru");
        }
    }
}
