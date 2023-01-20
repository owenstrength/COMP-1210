import java.util.Scanner;
 /**
* A simple program that converts inches given by user input into
* Miles, Yards, Feet, and Inches.
*
* @author Owen Strength - COMP 1210 - 002
* @version 8/29/22
*/
public class LaserMeasure {
 /**
   * Converts a inches given by user input to miles, yards, feet, and inches.
   * The conversion is then printed in the terminal.
   *
   * @param args Command line arguments - not used.
   */
   public static void main(String[] args) {
     
      // Set up user input
      Scanner userInput = new Scanner(System.in);
      int distanceInInches = 0;
      
      System.out.print("Enter the raw distance measurement in inches: ");
      distanceInInches = userInput.nextInt();
      int totalInches = distanceInInches;
      
      if (distanceInInches < 0) {
         System.out.println("Measurement must be non-negative!");
      } else {
      
      // Define Varibles in inches
         int milesInInches = 5280 * 12;
         int yardsInInches = 36;
         int feetInInches = 12;
      
      // Define remainder values
         int remainderMiles = 0;
         int remainderYards = 0;
         int remainderFeet = 0;
         int remainderInches = 0;
      
      // Convert Inches to Miles, Yards, Feet, and Inches
         remainderMiles = distanceInInches / milesInInches;
         distanceInInches = distanceInInches % milesInInches;
      
         remainderYards = distanceInInches / yardsInInches;
         distanceInInches = distanceInInches % yardsInInches;
      
         remainderFeet = distanceInInches / feetInInches;
         distanceInInches = distanceInInches % feetInInches;
      
         remainderInches = distanceInInches;
      
      
      
      
      // Print Results
         System.out.println("");
         System.out.println("Measurement by combined miles, yards, feet, "
            + "inches:");
         System.out.println("\tmiles: " + remainderMiles);
         System.out.println("\tyards: " + remainderYards);
         System.out.println("\tfeet: " + remainderFeet);
         System.out.println("\tinches: " + remainderInches);
         System.out.println("");
         System.out.println(totalInches + " in = " + remainderMiles + " mi, " 
            + remainderYards + " yd, " + remainderFeet
            + " ft, " + remainderInches + " in");
      
      }
     
   }
}