import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
/**
 * A simple program that takes the input of a string of numbers and characters
 * that are used to represent an order for a box lunch. The program
 * decodes the given input and prints the amount of meals for 
 * children and adults, the cost of the meals, the total costs,
 * the the name of the in the order, the theme for the order, and
 * a "lucky" (random) number .
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/6/2022
 */
public class BoxLunch {
   /**
    * The BoxLunch Class takes the input of strings and characters
    * and prints the statistics about the order given by the input string.
    * 
    * @param args Command line arguments (not used)
    */
   public static void main(String[] args) {
      // setup imported modules
      Random rand = new Random();
      Scanner userInput = new Scanner(System.in);
      String pricePattern = "$#,##0.00";
      DecimalFormat priceFormat = new DecimalFormat(pricePattern);
   
      // initialize varibles
      String orderCode;
      int numAdult;
      double costAdult;
      int numChild;
      double costChild;
   
      // input order code
      System.out.print("Enter order code: ");
      orderCode = (userInput.nextLine()).trim();
   
      // validate code
      if (orderCode.length() < 13) {
         System.out.println("");
         System.out.println("*** Invalid Order Code ***");
         System.out.println("Order code must have at least 13 characters.");
      } else {
         // extract values from the given code
         numAdult = Integer.parseInt(orderCode.substring(1, 3));
         costAdult = Double.parseDouble(orderCode.substring(3, 5) + "." 
            + orderCode.substring(5, 7));
      
         numChild = Integer.parseInt(orderCode.substring(7, 9));
         costChild = Double.parseDouble(orderCode.substring(9, 11) + "." 
            + orderCode.substring(11, 13));
      
         // print values
         System.out.println("");
         System.out.println("Name: " + orderCode.substring(13));
         System.out.println("Adult meals: " + numAdult + " at " 
            + priceFormat.format(costAdult));
         System.out.println("Child meals: " + numChild + " at " 
            + priceFormat.format(costChild));
         // calculate and print total
         System.out.println("Total: " 
            + priceFormat.format((numAdult * costAdult) 
            + (numChild * costChild)));
         // choose theme based on first number
         if (Integer.parseInt(orderCode.substring(0, 1)) == 0) {
            System.out.println("Theme: Birthday");
         } else if (Integer.parseInt(orderCode.substring(0, 1)) == 1) {
            System.out.println("Theme: Graduation");
         } else {
            System.out.println("Theme: Holiday");
         }
         // generate random number
         System.out.println("Lucky Number: " + (1 + rand.nextInt(9998)));
      }
   }
}
