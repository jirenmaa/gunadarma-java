package practicums.math_info.programs;

import java.util.Scanner;

public class Practicum3 {

  static Scanner input = new Scanner(System.in);

  static int[][] range = new int[100][100];
  static int[] domain = new int[100];
  static int[] codomain = new int[100];
  static int domainLength, codomainLength, rangeLength;

  public static void main(String args[]) {
    setGroupsLength();

    System.out.println();
    setGroupMembers();

    System.out.println();
    boolean doesHaveRelations = setRelation();
    boolean doesMapAsFunction = isMapAsFunction(range, rangeLength);
    boolean doesMapAsOneToOne = isMapAsOneToOne(range, rangeLength);
    boolean doesMapAsFunctionOnto = isMapAsFunctionOnto(range, rangeLength);

    System.out.println();
    System.out.print(
      (doesHaveRelations ?
        "==Set does have a relation ": "Set does not have any relation ")
    );
    System.out.print(
      (doesMapAsFunction
        ? "& set is a function==" : "& set is not a function==")
    );

    System.out.println();
    System.out.print(
      (doesMapAsFunction
        ? "==Set is a function " : "==Set is not a function==")
    );
    System.out.print(
      (doesMapAsOneToOne ?
        "& set is 'one to one'==" : "& set is not 'one to one'==")
    );

    System.out.println();
    System.out.print(
      (doesMapAsFunctionOnto
        ? "==Set is a onto function==" : "==Set is not a onto function==")
    );

    System.out.println("\n");
    showGroupMembers("Relation Members = ", range, rangeLength, false);
    showGroupMembers("Range Members    = ", range, rangeLength, true);
  }

  public static void setGroupsLength() {
    // define length for domain
    System.out.print("Enter the length of domain   : ");
    domainLength = input.nextInt();
    // define length for domain
    System.out.print("Enter the length of codomain : ");
    codomainLength = input.nextInt();
    // define length for range
    System.out.print("Enter the length of relation : ");
    rangeLength = input.nextInt();
  }

  public static void setGroupMembers() {
    // set group domain members
    System.out.println("Enter the members of domain : ");
    for (int i = 0; i < domainLength; i++) {
      System.out.print("Insert Element " + (i + 1) + " : ");
      domain[i] = input.nextInt();
    }

    // create new line
    System.out.println();

    // set group codomain members
    System.out.println("Enter the members of codomain: ");
    for (int i = 0; i < codomainLength; i++) {
      System.out.print("Insert Element " + (i + 1) + " : ");
      codomain[i] = input.nextInt();
    }
  }

  public static boolean setRelation() {
    String element;
    String[] elementArray;
    int[] elementIntArray = new int[2];
    boolean haveRelation = false;
    // set relation
    System.out.println("Enter the relation (domain, codomain) : ");

    // clear input buffer
    input.nextLine();
    for (int i = 0; i < rangeLength; i++) {
      System.out.print("Insert Element " + (i + 1) + " : ");
      element = input.nextLine();
      // split string into array '1, 2' => ['1', '2']
      elementArray = element.split(", ");
      // parse each string into integer
      elementIntArray[0] = Integer.parseInt(elementArray[0]); // domain
      elementIntArray[1] = Integer.parseInt(elementArray[1]); // codomain

      // check if element is in domain or codomain
      if (isInGroup(elementIntArray[0], domain, domainLength)
          && isInGroup(elementIntArray[1], codomain, codomainLength)) {
        // set relation
        range[i][0] = elementIntArray[0];
        range[i][1] = elementIntArray[1];
        haveRelation = true;
      }
    }

    return haveRelation;
  }

  public static boolean isMapAsFunction(int[][] group, int length) {
    boolean isFunction = false;

    // function is not called function if
    // the relation length is lower than the domain length it self
    if (length < domainLength) {
      return false;
    }
    // check if given 'range' is a function or not
    for (int i = 0; i < length; i++) {
      isFunction = isInGroup(group[i][1], codomain, codomainLength);
    }

    return isFunction;
  }

  public static boolean isMapAsOneToOne(int[][] group, int length) {
    boolean isOneToOne = false;
    // function is not called on-to-one if
    // the relation length is lower than the domain length it self
    if (length < domainLength || length < codomainLength) {
      return false;
    }
    // check if given 'range' is a on-to-one to codomain
    for (int i = 0; i < length; i++) {
      isOneToOne = true;
      for (int j = (i + 1); j < length; j++) {
        // if there any duplicate on range, then it's
        // not one-to-one function
        if (group[i][1] == group[j][1]) {
          isOneToOne = false;
          break;
        }
      }
    }

    return isOneToOne;
  }

  public static boolean isMapAsFunctionOnto(int[][] group, int length) {
    boolean isOnto = false;
    // function is not called onto if
    // the relation length is lower than the codomain length it self
    if (length < codomainLength) {
      return false;
    }
    // function called onto if every codomain has
    // one or more relation but it cannot be not paired
    for (int i = 0; i < length; i++) {
      isOnto = false;
      for (int j = 0; j < length; j++) {
        isOnto = (codomain[i] == group[j][1]);
      }
    }

    return isOnto;
  }

  public static boolean isInGroup(int element, int[] group, int groupLength) {
    for (int i = 0; i < groupLength; i++) {
      if (group[i] == element) {
        return true;
      }
    }
    return false;
  }

  public static void showGroupMembers(String groupName, int[][] group, int length, boolean showRange) {
    String element;

    System.out.print(groupName + "{ ");
    for (int i = 0; i < length; i++) {
      element = "(" + group[i][0] + ", " + group[i][1] + ")";
      System.out.print(!showRange ? element : group[i][1]);
      System.out.print((i != (length - 1)) ? ", " : "");
    }
    System.out.print(" }");
    System.out.println();
  }
}
