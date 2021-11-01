package Progress.week2;

/**
 * refrences:
 * https://blog.udemy.com/java-data-types/
 */

public class DataTypes {
  // 8 primitive data types
  public static void main(String[] args) {
    // minimum Value: -128 (2^7)
    // maximum Value: 127 (2^7 - 1)
    byte b = 127;

    // minimum Value: -32768 (2^15)
    // maximum Value: 32767 (2^15 - 1)
    short s = 32767;

    // minimum Value: -2147483648 (2^31)
    // maximum Value: 2147483647 (2^31 - 1)
    int i = 2147483647;

    // minimum Value: -9223372036854775808 (2^63)
    // maximum Value: 9223372036854775807 (2^63 - 1)
    long l = 9223372036854775807L;

    // minimum Value: 4.9E-324
    // maximum Value: 1.7E308
    float f = 3.14159f;

    // minimum Value: -1.7E308
    // maximum Value: 1.7E308
    double d = 1.77013;

    // minimum Value: 0
    // maximum Value: 1
    char c = 'a';

    // Value (true or false)
    boolean bool = true;

    System.out.println("byte: " + b);
    System.out.println("short: " + s);
    System.out.println("int: " + i);
    System.out.println("long: " + l);
    System.out.println("float: " + f);
    System.out.println("double: " + d);
    System.out.println("char: " + c);
    System.out.println("boolean: " + bool);
  }
}
