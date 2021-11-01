package Progress.week3;

public class OperatorExpression {
  public static void main(String[] args) {
    int score = 100;
    char grade = 'A';

    grade = (score > 90) ? grade : 'F';
    System.out.println("Your grade is : " + grade);
  }
}
