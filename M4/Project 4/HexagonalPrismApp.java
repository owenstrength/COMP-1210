import java.util.Scanner;
/**
 * This program uses the HexagonalPrism class to create a hexagonal prism
 * object using user input for the label, edge, and height.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/14/2022
 */
public class HexagonalPrismApp {
   /**
    * This class uses user input to create a hexagonal prism object.
    * Data validation is built into this method.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
      // initialize variables
      HexagonalPrism x = new HexagonalPrism("", 0, 0);
      String labelIn;
      double edgeIn;
      double heightIn;
      
      // get input for label, edge, height.
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter label, edge, and "
         + "height for a hexagonal prism.");
   
      System.out.print("\tlabel: ");
      labelIn = userInput.nextLine();
   
      System.out.print("\tedge: ");
      edgeIn = Double.parseDouble(userInput.nextLine());
      // make sure edge is valid
      if (edgeIn <= 0) {
         System.out.println("Error: edge must be greater than zero.");
      } else {
         System.out.print("\theight: ");
         // make sure height is valid
         heightIn = Double.parseDouble(userInput.nextLine());
         if (heightIn <= 0) {
            System.out.println("Error: height must be greater than zero.");
         } else {
            // update object values and print
            System.out.println("");
            x.setLabel(labelIn);
            x.setEdge(edgeIn);
            x.setHeight(heightIn);
            System.out.println(x);
         }
      }
   
      
   }
}
