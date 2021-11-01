package Practicum.OOP;

import java.util.Scanner;

public class PracticumThree {
  public static void main(String[] args) {
    // KelilingBujurSangkar();
    // PersamaanKuadrat();
    // NilaiRatarata();
    // VolumeBolaInput();
    Inisial();
  }

  public static void KelilingBujurSangkar() {
    // initialize variables
    int side, circumference;

    // getting input from user
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan sisi (cm) : ");
    side = input.nextInt();

    // close scanner to prevent resource leak
    input.close();

    // calculate circumference
    circumference = 4 * side;

    // print result
    System.out.println("Keliling bujur sangkar adalah " + circumference + " cm");
  }

  public static void PersamaanKuadrat() {
    // intialize variables
    int a, b, c;
    double x1, x2;

    // getting input from user
    Scanner input = new Scanner(System.in);

    // get a from user
    System.out.print("Masukkan nilai a: ");
    a = input.nextInt();

    // get b from user
    System.out.print("Masukkan nilai b: ");
    b = input.nextInt();

    // get c from user
    System.out.print("Masukkan nilai c: ");
    c = input.nextInt();

    // close scanner to prevent resource leak
    input.close();

    // calculate the equation
    // (-b +- sqrt(b^2 - 4ac)) / 2a
    x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

    // print to console
    System.out.printf("x1 = %.2f\n", x1);
    System.out.printf("x2 = %.2f", x2);
  }

  public static void NilaiRatarata() {
    // initialize variables
    double value1, value2;
    double mean;

    // getting input from user
    Scanner input = new Scanner(System.in);

    // get a from user for value-1
    System.out.print("Masukkan angka pertama: ");
    value1 = input.nextDouble();

    // get a from user for value-2
    System.out.print("Masukkan angka kedua: ");
    value2 = input.nextDouble();

    // close scanner to prevent resource leak
    input.close();

    // calculate mean
    mean = (double) (value1 + value2) / 2;

    // print result
    System.out.printf("Rata-rata = %.2f", mean);
  }

  public static void VolumeBolaInput() {
    final double PI = Math.PI;
    double radius, volume;

    // get user input for radius
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jari-jari (m): ");
    radius = input.nextDouble();

    // close scanner to prevent resource leak
    input.close();

    // calculate volume
    // V = 4/3 * PI * r^3

    // use double for (4/3) to avoid integer division
    // using (float) will cause the result to be rounded
    volume = (double) 4 / 3 * PI * Math.pow(radius, 3);

    // print to console
    System.out.printf("Volume bola = %.2f m3.", volume);
  }

  public static void Inisial() {
    String firstName, lastName, initials;

    // get user input for radius
    Scanner input = new Scanner(System.in);

    // get first name from user input
    System.out.print("Masukkan nama depan: ");
    firstName = input.nextLine();

    // get first name from user input
    System.out.print("Masukkan nama belakang: ");
    lastName = input.nextLine();

    input.close();

    // get intial name
    initials = firstName.substring(0, 1).toUpperCase() + lastName.substring(0, 1).toUpperCase();

    System.out.print("Inisial: " + initials);
  }
}
