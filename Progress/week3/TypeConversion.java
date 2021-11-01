package Progress.week3;

public class TypeConversion {
  public static void main(String[] args) {
    int i = 1;
    String name = "23423";

    // string to integer
    int j = Integer.parseInt(name);
    // integer to string
    String s = Integer.toString(i);

    System.out.println("String to Integer : " + j + " | ");
    System.out.println("Integer to String : " + s + " | " + s.getClass());
  }
}
