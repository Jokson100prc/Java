package shape;

import java.util.Scanner;
//wczytuje z klawiatury  dwie liczby całkowite, tworzy prostokat i wyświetla  jego powierzchnie i obwód;

public class CreateShape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź  boki prostokąta: ");

        int width;
        int height;

        if(scan.hasNextInt()){
            width = scan.nextInt();
        } else {
            System.out.println("nieporawny typ danych");
            return;
        }


        if(scan.hasNextInt()){
            height = scan.nextInt();
        } else {
            System.out.println("nieporawny typ danych");
            return;
        }


        if (width > 0 && height > 0){
        Rectangle box = new Rectangle(width, height);
        System.out.println(box);
        System.out.println("Obwód: " + ((width*2)+(height*2))+ ", Pole: " + (width *height));
        }else {
            System.out.println("liczby nie mogą być ujemne");
            return;
        }

    }
}
