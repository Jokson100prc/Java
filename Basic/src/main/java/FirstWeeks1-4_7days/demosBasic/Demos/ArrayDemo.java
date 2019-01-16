package Demos;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] intArray= new int[10];
        intArray[0]= 123;
        intArray[1]= 223;
        intArray[2]= 11;
        intArray[9]= 999;

        System.out.println("element Tablicy to: " + intArray[0]);
        System.out.println("element Tablicy to: " + intArray[1]);
        System.out.println("element Tablicy to: " + intArray[2]);
        System.out.println("element Tablicy to: " + intArray[9]);
        System.out.println("element Tablicy to: " + intArray[3]);

        Integer[] intArray2 = new Integer[10];
        intArray2[0]=100;
        System.out.println("element tablicy to: " + intArray2[0]);
        System.out.println("element tablicy to: " + intArray2[1]);

        int intArray2Lenght = intArray2.length;
        System.out.println("Długość tablicy intArray2 to: " + intArray2Lenght);
        System.out.println("Długość tablicy intArray2 to: " + intArray2.length);

        intArray2[0] = intArray2[0] + 2;
        System.out.println("Nowa wartość to: " + intArray2[0]);
        intArray2[0] = intArray2[0] + 2;
        System.out.println("Nowa wartość to: " + intArray2[0]);


        // Tablica wielowymiarowa
        int[][] intArray3= new int[10][10];
        intArray3[0][0] = 1010;
        intArray3[9][9] = 123456;
        System.out.println("to jest kilka komórek Tablicy: " + intArray3[0][0]+" "+intArray3[9][9]+" "+intArray3[5][9]);



        int[] sumArray = new int[3];
        sumArray[0] = 56;
        sumArray[1]= 44;
        sumArray[2] = sumArray[0]+sumArray[1];
        System.out.println("Suma komórek tablicy to: " + sumArray[2]);
        System.out.println(sumArray);
        System.out.println(Arrays.toString(sumArray));



        // Kopiowanie tablicy
        int[] arrayFirst = new int[] {1,2,3,4};
        int[] arraySecond = new int[10];

        arraySecond = Arrays.copyOfRange(arrayFirst, 0, 3);
        System.out.println(Arrays.toString(arraySecond));


        int[] arrayThird = new int[10];
        System.arraycopy(arrayFirst,0, arrayThird,0,3);
        System.out.println(Arrays.toString(arrayThird));

        System.arraycopy(arrayFirst,0, arrayThird,0,arrayFirst.length);
        System.out.println(Arrays.toString(arrayThird));



        Integer[] arrayFourth = new Integer[] {1,2,3,4};
        Integer[] arraySRC = new Integer[10];

        System.arraycopy(arrayFourth,0, arraySRC,0,3);
        System.out.println(Arrays.toString(arraySRC));

        System.arraycopy(arrayFourth,0, arraySRC,0,arrayFourth.length);
        System.out.println(Arrays.toString(arraySRC));
    }

}
