import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {
    double firstNum, secondNum, sumNum;
    Scanner input = new Scanner(System.in);

    firstNum = 0;
    secondNum = 0;
    sumNum = 0;

    System.out.println("Please enter a number:");
    firstNum = input.nextDouble();
    System.out.println("Please enter another number:");
    secondNum = input.nextDouble();
    sumNum = firstNum + secondNum;
    System.out.println("The sum of " + firstNum + " and " + secondNum + " = " + sumNum);
    input.close();
  }
}
