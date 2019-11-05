import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int num1 = 5;
    int num2 = 15;

    if(num1 > num2){
      System.out.println("" + num1 + " is greater than " + num2);
    }
    else {
      if (num1 < num2){
        System.out.println("" + num2 + " is greater than " + num1);
      }
    }
  }
}
