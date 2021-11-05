package practicums.math_info.programs;

import java.util.Scanner;

public class Practicum1 {

  static Scanner input = new Scanner(System.in);

  static int[] groupA = new int[100];
  static int[] groupB = new int[100];
  static int groupALength = 0, groupBLength = 0;

  public static void main(String args[]) {
    setGroupsLength();

    System.out.println();
    setGroupMembers();

    System.out.println();
    showGroupMembers("Member of Group A : ", groupA, groupALength);
    showGroupMembers("Member of Group B : ", groupA, groupALength);

    System.out.println();
    int intersections[][] = getGroupIntersection();
    showGroupMembers(
      "Intersection of Group A and B : ",
      intersections[1],
      intersections[0][0]
    );
  }

  public static void setGroupsLength() {
    // define length for group A
    System.out.print("Enter the length of group A : ");
    groupALength = input.nextInt();
    // define length for group B
    System.out.print("Enter the length of group B : ");
    groupBLength = input.nextInt();
  }

  public static void setGroupMembers() {
    // set group A members
    System.out.println("Enter the members of group A: ");
    for (int i = 0; i < groupALength; i++) {
      System.out.print("Insert Element " + (i + 1) + " : ");
      groupA[i] = input.nextInt();
    }

    // create new line
    System.out.println();

    // set group B members
    System.out.println("Enter the members of group B: ");
    for (int i = 0; i < groupBLength; i++) {
      System.out.print("Insert Element " + (i + 1) + " : ");
      groupB[i] = input.nextInt();
    }
  }

  public static void showGroupMembers(String groupName, int[] group, int length) {
    System.out.print(groupName + "{ ");
    for (int i = 0; i < length; i++) {
      System.out.print(group[i]);
      System.out.print((i != (length - 1)) ? ", " : "");
    }
    System.out.print(" }");
    System.out.println();
  }

  /**
   * get intersection of group A and group B
   */
  public static int[][] getGroupIntersection() {
    int[] intersection = new int[100];
    int intersectionLength = 0;
    boolean isOnOtherGroup = false;

    // System.out.print("Intersection of Group A and Group B : { ");
    for (int i = 0; i < groupALength; i++) {
      isOnOtherGroup = false;
      for (int j = 0; j < groupBLength; j++) {
        if (groupA[i] == groupB[j]) {
          isOnOtherGroup = true;
          break;
        }
      }

      if (isOnOtherGroup) {
        intersection[intersectionLength] = groupA[i];
        intersectionLength++;
      }
    }

    return new int[][] { new int[] { intersectionLength }, intersection };
  }
}
