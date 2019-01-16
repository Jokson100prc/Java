package DemoMethod;

public class BaseForDemoMethod {
  public static void main(String[] args){

    String[] houses = {"Mławska","Pławska", "Argentyńska"};

    Propertys house = new Propertys();
    house.propertys(houses);
    System.out.println(house.propertys(houses));// try to find resolve how to split


    Rent rentflat = new Rent();
    System.out.println(rentflat.rent(12, 23, 1));


    Inmate person = new Inmate();
    person.inmate("John", "Doe", 15);

  }
}


