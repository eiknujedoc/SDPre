public class Objective2Lab5 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;

    side1 = 10.0;
    side2 = 8.0;

    //create variables to store the squared values of side1 and side2
    double side1Sq, side2Sq;
    //declare values as a function based on pythagorean's theorum
    side1Sq = side1 * side1;
    side2Sq = side2 * side2;
    //declare value of hypotenuse as a function using Java Math library function Math.sqrt()
    hypotenuse = Math.sqrt(side1Sq + side2Sq);
    System.out.println( "The hypotenuse of a triangle with sides " + side1 + " and " + side2 + " is " + hypotenuse);
  }
}
