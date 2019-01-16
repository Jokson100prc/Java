package string;

public class StringBuilderDemo {
  public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    builder.append("abc");
    System.out.println(builder);

    StringBuffer buffer = new StringBuffer();


    //Add next alphabet letters
    for (char c = 'd'; c <= 'z'; c++) {
      builder.append(c);
    }
    System.out.println(builder);
    builder.deleteCharAt(0);
    builder.deleteCharAt(builder.length() - 1);
    System.out.println(builder);


    //make hexidecimal system string
    builder.delete(0, builder.length());
    for (char c = '0'; c <= '9'; c++) {
      builder.append(c);
    }
    for (char c = 'A'; c <= 'F'; c++) {
      builder.append(c);
    }
    System.out.println(builder);

  }
}