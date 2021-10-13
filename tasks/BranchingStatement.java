package tasks;

public class BranchingStatement {
  public static void main(String[] args) {
    int ifScore = 85;
    int switchScore = 90;

    char ifGrade = ifStatement(ifScore);
    char switchGrade = ifStatement(switchScore);

    System.out.println("Your grade is " + ifGrade);
    System.out.println("Your grade is " + switchGrade);
  }

  public static char ifStatement(int score) {
    // determine the grade using if statement

    char grade = 'E';

    if (score < 60) {
      grade = 'E';
    } else if (score < 70) {
      grade = 'D';
    } else if (score < 80) {
      grade = 'C';
    } else if (score < 90) {
      grade = 'B';
    } else if (score == 100) {
      grade = 'A';
    } else {
      grade = '?';
    }

    return grade;
  }

  public static char SwitchStatement(int score) {
    // determine the grade using switch statement

    char grade = 'E';

    switch (score) {
      case 100:
        grade = 'A';
        break;
      case 90:
        grade = 'B';
        break;
      case 80:
        grade = 'C';
        break;
      case 70:
        grade = 'D';
        break;
      case 60:
        grade = 'E';
        break;
      default:
        grade = '?';
        break;
    }

    return grade;
  }
}
