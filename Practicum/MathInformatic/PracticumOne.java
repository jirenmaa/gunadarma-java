package Practicum.MathInformatic;

import java.util.Scanner;

public class PracticumOne {
  Scanner input = new Scanner(System.in);

  // intialize array of himpunan variable
  int[] setA = new int[100];
  int[] setB = new int[100];

  int setA_length = 0;
  int setB_length = 0;

  public static void main(String args[]) {
    PracticumOne himpunan = new PracticumOne();

    // setup for himpunan 'A' & 'B'
    himpunan.setHimpunan();
    System.out.print("\n\n");
    himpunan.setIrisan();
  }

  /**
   * @description
   * set himpunan, length of himpunan, and member of himpunan
   */
  public void setHimpunan() {
    // set length of himpunan 'A'
    System.out.print("Masukkan banyak elemen 'A': ");
    setA_length = input.nextInt();

    // set members for himpunan 'A'
    for (int i = 1; i <= setA_length; i++) {
      System.out.print("Masukkan elemen ke-" + i + ": ");
      setA[i] = input.nextInt();
    }
    // show members of himpunan 'A'
    showAnggota("A=", setA, setA_length);

    System.out.println("\n");

    // set length of himpunan 'B'
    System.out.print("Masukkan banyak elemen 'B': ");
    setB_length = input.nextInt();

    // set members for himpunan 'B'
    for (int i = 1; i <= setB_length; i++) {
      System.out.print("Masukkan elemen ke-" + i + ": ");
      setB[i] = input.nextInt();
    }
    // show members of himpunan 'B'
    showAnggota("B=", setB, setB_length);
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
    for (int i = 1; i <= length; i++) {
      System.out.print(himpunan[i]);
      if (i != length) {
        System.out.print(",");
      }
    }
    System.out.print("}");
  }

  /**
   * @description
   * get irisan of himpunan 'A' & 'B'
   */
  public void setIrisan() {
    int[] irisan = new int[100];
    int irisan_length = 0;

    boolean isInOtherHimpunan = false;
    for (int i = 1; i <= setB_length; i++) {
      isInOtherHimpunan = false;
      int same = 0;

      // check if 'A' is in 'B'
      for (int j = 1; j <= setA_length; j++) {
        if (setB[i] == setA[j]) {
          isInOtherHimpunan = true;
          same = setA[j];
          break;
        }
      }

      // print 'A' if is in 'B'
      if (isInOtherHimpunan) {
        irisan[i] = same;
        irisan_length++;
      }
    }

    showAnggota("Jadi irisannya adalah ", irisan, irisan_length);
  }
}
