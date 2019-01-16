package Demos;

import car.Car;

public class PackageDemo {
    public static void main(String[] args){
        Car porshe = new Car("LGA 18895", 300, 80);
        System.out.println(porshe);
//        System.out.println(porshe.carId);
//        System.out.println(porshe.power);

//        System.out.println(porshe.getCarId());
//        System.out.println(porshe.getPower());
        System.out.println(porshe.getFuelLevel());

//        porshe.carId = "aaa"; final doesn't allowed to change this variable;


        System.out.println(porshe.power);

    }
}
