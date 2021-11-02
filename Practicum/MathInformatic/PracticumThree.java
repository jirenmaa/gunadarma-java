package Practicum.MathInformatic;

import java.util.Scanner;

public class PracticumThree {

  // intialize input scanner
  static Scanner input = new Scanner(System.in);

  // initialize variables
  static int length;
  static int[] domain = new int[100];
  static int[] codomain = new int[100];

  public static void main(String[] args) {
    setRelationLength();

    // set values of domain and range
    for (int index = 0; index < length; index++) {
      setRelationDomain(index);
      setRelationRange(index);
      System.out.println();
    }

    // show member of relation
    showMemberRelation("Domain = ", domain);
    System.out.println();
    showMemberRelation("Range = ", codomain);

    // show relation function
    showFunction(domain, codomain);

    // show if `domain` have relation in `codomain` or can be called as `function`
    boolean haveRelation = isHaveRelation(domain, codomain);
    System.out.println("Relasi dan juga fungsi");

    // show if function is mapped as `fungsi satu-satu`
    isMapAsOneToOne(domain, codomain, haveRelation);

    if (haveRelation) { System.out.println("Fungsi onto"); }
  }

  public static void setRelationLength() {
    System.out.print("Masukkan banyak relasi (angka genap): ");
    length = input.nextInt();
  }

  /**
   * Set domain value of relation;
   *
   * @param index
   * @param value
   */
  public static void setRelationDomain(int index) {
    System.out.print("Masukkan domain ke-" + (index + 1) + ": ");

    int value = input.nextInt();
    domain[index] = value;
  }

  /**
   * Set range of relation; It set value of codomain that related to domain
   *
   * @param index
   * @param value
   */
  public static void setRelationRange(int index) {
    System.out.print("Masukkan  range ke-" + (index + 1) + ": ");

    int value = input.nextInt();
    codomain[index] = value;
  }

  /**
   * check if codomain have duplicate element which mean domain have related
   * element to codomain
   *
   * @param domain
   * @param codomain
   */
  public static boolean isHaveRelation(int[] domain, int[] codomain) {
    boolean isRelated = false;
    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j < length; j++) {
        if (codomain[i] == codomain[j]) {
          isRelated = true;
          break;
        }
      }
    }

    return isRelated;
  }

  /**
   * check relation mapping between domain and codomain
   *
   * @param domain
   * @param codomain
   */
  public static void isMapAsOneToOne(int[] domain, int[] codomain, boolean isHaveRelation) {
    System.out.print("Fungsi ");
    if (isHaveRelation) {
      System.out.println("tetapi bukan satu-satu");
    } else {
      System.out.println("satu-satu");
    }
  }

  /**
   * Set range of relation; It set value of codomain that related to domain
   *
   * @param relationName
   * @param relation
   */
  public static void showMemberRelation(String relationName, int[] relation) {
    System.out.print(relationName + "{");
    for (int i = 0; i <= length - 1; i++) {
      System.out.print(relation[i]);

      if (i != length - 1) {
        System.out.print(",");
      }
    }
    System.out.print("}");
  }

  public static void showFunction(int[] domain, int[] codomain) {
    System.out.println("\nFungsinya:");
    for (int i = 0; i < length; i++) {
      System.out.print("(" + domain[i] + "," + codomain[i] + ")\n");
    }
  }
}
