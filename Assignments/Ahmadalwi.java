package Assignments;

import java.util.Scanner;
// for catching erorr when user input is not a number
import java.util.InputMismatchException;

public class Ahmadalwi {
  public static void main(String[] args) {
    // getting input from console
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number: ");

    try {
      // set scan result as integer
      double num = scan.nextDouble();
      // prevent a resource leak
      scan.close();

      if (num < 50) {
        System.out.println("Nilai yang anda masukkan kurang dari 50");
      } else if (num > 50) {
        System.out.println("Nilai yang anda masukkan lebih dari 50");
      } else if (num == 50) {
        System.out.println("Nilai yang anda masukkan 50");
      } else {
        System.out.println("Nilai yang anda masukkan " + num);
      }
    } catch (InputMismatchException err) {
      System.out.println("Anda hanya boleh menginput angka saja.");
    }
  }
}
