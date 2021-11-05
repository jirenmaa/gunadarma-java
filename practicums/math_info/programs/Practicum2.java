package practicums.math_info.programs;

import java.util.Scanner;

public class Practicum2 {

  static Scanner input = new Scanner(System.in);

  static int[] group = new int[100];
  static int groupLength;

  public static void main(String args[]) {
    // define length for group
    System.out.print("Enter the length of group : ");
    groupLength = input.nextInt();
    System.out.println();

    // set group members
    System.out.println("Enter the members of group: ");
    for (int i = 0; i < groupLength; i++) {
      System.out.print("Insert Element " + (i + 1) + " : ");
      group[i] = input.nextInt();
    }

    System.out.println();
    showGroupMembers();

    System.out.println();
    showGroupReflections();
  }

  public static void showGroupMembers() {
    System.out.print("Group Members : { ");
    for (int i = 0; i < groupLength; i++) {
      System.out.print(group[i]);
      System.out.print((i != (groupLength - 1)) ? ", " : "");
    }
    System.out.print(" }");
    System.out.println();
  }

  public static void showGroupReflections() {
    boolean reflected = false;
    String reflectionMember = "";

    System.out.print("Group Reflections : { ");
    for (int i = 0; i < groupLength; i++) {
      reflected = false;
      for (int j = 0; j < groupLength; j++) {
        reflected = (group[i] == group[j]) ? true : false;
        reflectionMember = "(" + group[i] + ", " + group[j] + ")";

        if (reflected) {
          System.out.print(reflectionMember);
          System.out.print((i != (groupLength - 1)) ? ", " : "");
        }
      }
    }
    System.out.print(" }");
    System.out.println();
  }
}
