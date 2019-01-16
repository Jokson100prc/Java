package DemoMethod;

class Propertys {
  String propertys(String[] adress) {
    String proper = "";
//    proper = Arrays.toString(adress);

    for (int i = 0; i < adress.length; i++) {
      proper = adress[i];
    }
    return proper;
  }


}
