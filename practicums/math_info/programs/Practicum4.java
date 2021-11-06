package practicums.math_info.programs;

import java.util.Scanner;

public class Practicum4 {
  static Scanner input = new Scanner(System.in);

  static int valueP, valueQ, choice;

  public static void main(String[] args) {
    System.out.println("== Propositional Logic Program ==");

    boolean running = true;
    castValueFromUser();

    while (running) {
      showCastMenu();
      castUserChoice();
      getPropositionalResult(choice);
    }
  }

  public static void showCastMenu() {
    System.out.println();
    System.out.println("== 1. Conjunction   ==");
    System.out.println("== 2. Disjunction   ==");
    System.out.println("== 3. Conditional   ==");
    System.out.println("== 4. BiConditional ==");
    System.out.println("== 5. Close console ==");
    System.out.println();
  }

  public static void castUserChoice() {
    System.out.print("== Choose menu : ");
    if (input.hasNextInt()) {
      choice = input.nextInt();
    } else {
      System.exit(0);
    }
  }

  public static void castValueFromUser() {
    // getting value for p from user
    System.out.print("== Enter value P (1 or 0) : ");
    valueP = input.nextInt();

    // getting value for q from user
    System.out.print("== Enter value Q (1 or 0) : ");
    valueQ = input.nextInt();
  }

  public static void getPropositionalResult(int index) {
    switch (index) {
      case 1:
        System.out.println("== Conjunction : ");
        System.out.println(
          "== P and Q : " + valueP + " ˄ " + valueQ + " = " +
          ((valueP == 1 && valueQ == 1) ? 1 : 0)
        );
        break;
      case 2:
        System.out.println("== Disjunction : ");
        System.out.println(
          "== P and Q : " + valueP + " ˅ " + valueQ + " = " +
          ((valueP == 0 && valueQ == 0) ? 0 : 1)
        );
        break;
      case 3:
        System.out.println("== Conditional : ");
        System.out.println(
          "== P and Q : " + valueP + " → " + valueQ + " = " +
          ((valueP == 1 && valueQ == 0) ? 0 : 1)
        );
        break;
      case 4:
        System.out.println("== BiConditional : ");
        System.out.println(
          "== P and Q : " + valueP + " ↔ " + valueQ + " = " +
          (((valueP == 1 && valueQ == 1) || (valueP == 0 && valueQ == 0)) ? 1 : 0)
        );
        break;
      default:
        System.out.println("== Wrong choice : ");
        break;
    }
  }
}
