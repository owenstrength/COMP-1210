import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * A simple program that prints results of a known equations using 
 * user input to receive the value for x. The program also prints 
 * the amount of digits to the left of the decimal place, 
 * the amount of digits to the right of the decimal place, 
 * and a formated verison of the result.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/2/2022
 */
public class RadicalFormula {
   /**
    * Prints result of an equation with user input for the value of x.
    * Prints the number of digits to the right and left of the deciaml place.
    * Prints a formated version of the result.
    * 
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      // Initialize Variables
      Scanner userInput = new Scanner(System.in);
      double x;
      double result;
      int decimalLeft;
      int decimalRight;
      String resultString;
   
      String pattern = "#,##0.0##";
      DecimalFormat decimalFormat = new DecimalFormat(pattern);
   
      // get input
      System.out.print("Enter a value for x: ");
      x = Double.parseDouble(userInput.nextLine());
   
      // get result based on input
      result = Math.sqrt(Math.pow(((3 * Math.pow(x, 8)) 
         - (2 * Math.pow(x, 3))), 2)
         + (Math.abs((3 * Math.pow(x, 5))
         - (2 * Math.pow(x, 3)))));
   
      // calculate digits to right and left of decimal
      resultString = Double.toString(result);
      decimalLeft = resultString.indexOf('.');
      decimalRight = resultString.length() - decimalLeft - 1;
   
      // print all results 
      System.out.println("Result: " + result);
      System.out.println("# digits to left of decimal point: "
          + decimalLeft);
      System.out.println("# digits to right of decimal point: "
          + decimalRight);
      System.out.println("Formatted Result: " + decimalFormat.format(result));
   }
}