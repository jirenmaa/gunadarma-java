package assignments;

public class Assignment2 {
  public static void main(String[] args) {
    asteriksSquare();

    System.out.println();
    asteriksTriangleOne();

    System.out.println();
    asteriksTriangleTwo();
  }

  public static void asteriksSquare() {
    /**
     * prints a square of asterisks.
     *
     * **********
     * **********
     * **********
     * **********
     * **********
     */
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 10; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void asteriksTriangleOne() {
    /**
     * print a right triable of asterisks.
     *
     * *
     * **
     * ***
     * ****
     * *****
     */
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void asteriksTriangleTwo() {
    /**
     * print a upside down right triable of asterisks.
     *
     * *****
     * ****
     * ***
     * **
     * *
     */
    for (int i = 5; i > 0; i--) {
      for (int j = i; j > 0; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
