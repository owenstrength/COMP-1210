import java.util.Scanner;
/**
* A simple program that prints the results of a given equation 
* based on user input.
*
* @author Owen Strength - COMP 1210 - 002
* @version 8/26/22
*/
public class MySolver {
   /**
   * Returns results of the equation using the values based on
   * user input.
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
   
      // Set up user input
      Scanner userInput = new Scanner(System.in);
      
      // Print equation
      System.out.println("result = (8.5x + 6.1) (10y + 7.9) / z");
      
      double x = 0.0;
      double y = 0.0;
      double z = 0.0;
      
      // Get user input
      System.out.print("\tEnter x: ");
      x = userInput.nextDouble();
      System.out.print("\tEnter y: ");
      y = userInput.nextDouble();
      System.out.print("\tEnter z: ");
      z = userInput.nextDouble();
      
      // Calculate result
      if (z != 0) {
         System.out.println("result = " + (8.5 * x + 6.1) * (10 * y + 7.9) / z);
      } else {
         System.out.println("result is undefined");
      }
   }
}