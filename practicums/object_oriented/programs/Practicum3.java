package practicums.object_oriented.programs;

import java.util.Scanner;

public class Practicum3 {

  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    System.out.println("=Square Perimeter=");
    squarePerimeter();

    System.out.println("\n");
    System.out.println("=Quadratic equation=");
    quadraticEquation();

    System.out.println("\n");
    System.out.println("=Avarage of values=");
    averageValue();

    System.out.println("\n");
    System.out.println("=Volumes of a ball=");
    ballVolume();

    System.out.println("\n");
    System.out.println("=Get Inital name=");
    initialName();
  }

  public static void squarePerimeter() {
    int side, perimeter;

    // getting input from user
    System.out.print("Insert side (cm) : ");
    side = input.nextInt();
    // calculate perimeter
    perimeter = 4 * side;
    // print result
    System.out.println("The perimeter is " + perimeter + " cm");
  }

  public static void quadraticEquation() {
    int a, b, c;
    double equationOne, equationTwo;

    // get value from user for 'a'
    System.out.print("Insert value for 'a' : ");
    a = input.nextInt();
    // get value from user for 'b'
    System.out.print("Insert value for 'b' : ");
    b = input.nextInt();
    // get value from user for 'c'
    System.out.print("Insert value for 'c' : ");
    c = input.nextInt();

    // calculate the equation
    // (-b +- sqrt(b^2 - 4ac)) / 2a
    equationOne = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * (-c))) / (2 * a);
    equationTwo = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * (-c))) / (2 * a);
    // print to console
    System.out.printf("Equation one = %.2f", equationOne);
    System.out.println();
    System.out.printf("Equation two = %.2f", equationTwo);
  }

  public static void averageValue() {
    double value1, value2;
    double mean;

    // get value from user for 'value1'
    System.out.print("Insert first value  : ");
    value1 = input.nextDouble();
    // get value from user for 'value2'
    System.out.print("Insert second value : ");
    value2 = input.nextDouble();

    // calculate mean
    // (value1 + value2) / 2
    mean = (double) (value1 + value2) / 2;
    // print to console
    System.out.printf("Avarage of two value is : %.2f", mean);
  }

  public static void ballVolume() {
    double radius, volume;

    // get value from user for 'radius'
    System.out.print("Insert radius (m) : ");
    radius = input.nextDouble();

    // calculate the volume
    // V = 4/3 * pi * r^3
    volume = ((double) (4 / 3)) * Math.PI * Math.pow(radius, 3);
    // print to console
    System.out.printf("Volume = %.2f", volume);
  }

  public static void initialName() {
    String firstName, lastName;

    // clear input buffer
    input.nextLine();

    // get value from user for 'firstName'
    System.out.print("Insert first name : ");
    firstName = input.nextLine();
    // get value from user for 'lastName'
    System.out.print("Insert last name  : ");
    lastName = input.nextLine();

    // last program that use scanner
    // so we need to close it to avoid 'resource leak'
    input.close();

    // create initial name with uppercase latter
    String firstInitial = firstName.substring(0, 1).toUpperCase();
    String lastInitial = lastName.substring(0, 1).toUpperCase();
    // print to console
    System.out.print("Initial name : " + firstInitial + lastInitial);

  }
}
