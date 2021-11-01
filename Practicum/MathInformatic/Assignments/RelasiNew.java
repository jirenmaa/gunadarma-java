package Practicum.MathInformatic.Assignments;

import java.util.Scanner;

public class RelasiNew {

  Scanner input = new Scanner(System.in);

  int himpunan_length;
  int[] himpunan = new int[100];

  public static void main(String args[]) {
    RelasiNew XHimpunan = new RelasiNew();

    System.out.println("Jenis Relasi Refleksif\n");
    XHimpunan.setHimpunan();
    System.out.print("\n\n");
    XHimpunan.getReflection();
  }

  public void setHimpunan() {
    System.out.print("Masukkan banyak himpunan 'A': ");
    himpunan_length = input.nextInt();

    // set members for himpunan
    for (int i = 0; i <= himpunan_length - 1; i++) {
      System.out.print("Masukkan elemen 'A' ke- " + (i + 1) + ": ");
      himpunan[i] = input.nextInt();
    }
    System.out.print("\n\n");
    // show members of himpunan
    showAnggota("A=", himpunan, himpunan_length);
  }

  /**
   * @description
   * print all member of himpunan
   *
   * @param namaHimpunan
   * @param himpunan
   * @param length
   */
  public void showAnggota(String namaHimpunan, int[] himpunan, int length) {
    System.out.print(namaHimpunan + "{");
    for (int i = 0; i <= length - 1; i++) {
      System.out.print(himpunan[i]);

      if (i != length - 1) { System.out.print(","); }
    }
    System.out.print("}");
  }

  /**
   * @description
   * get reflection of himpunan
   */
  public void getReflection() {
    System.out.print("Refleksif dari himpunan A = {");
    for (int i = 0; i < himpunan_length; i++) {
      for (int j = 0; j < himpunan_length; j++) {
        if (himpunan[i] == himpunan[j]) {
          System.out.print("(" + himpunan[i] + "," + himpunan[j] + ")");

          if (i != himpunan_length - 1) { System.out.print(","); }
        }
      }
    }
    System.out.print("}");
  }
}
