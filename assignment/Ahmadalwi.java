package assignment;

import java.util.Scanner;
import java.util.InputMismatchException; // library untuk menangkap eror

public class Ahmadalwi {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number: ");

    try {
      // get use input from console
      int num = scan.nextInt();
      scan.close();

      if (num < 50) {
        System.out.println("Nilai kurang dari 50");
      } else if (num > 50) {
        System.out.println("Nilai lebih dari 50");
      } else if (num == 50) {
        System.out.println("Nilai anda 50");
      } else {
        System.out.println("Nilai anda 0");
      }
    } catch (InputMismatchException err) {
      System.out.println("Anda hanya boleh menginput angka saja.");
    }
  }
}
