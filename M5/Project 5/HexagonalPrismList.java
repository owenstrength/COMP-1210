import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 * This program uses the HexagonalPrism class to create a list of
 * HexagonalPrism Objects and return outputs of the total and avarege values.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/22/2022
 */
public class HexagonalPrismList {
   // Fields
   private String listLabel;
   private ArrayList<HexagonalPrism> hexPrismList 
      = new ArrayList<HexagonalPrism>();

   // Constructor
   /**
    * This constructor initializes the list name and object list.
    *
    * @param listLabelIn list name
    * @param hexPrismListIn object list
    */
   public HexagonalPrismList(String listLabelIn, 
      ArrayList<HexagonalPrism> hexPrismListIn) {
      listLabel = listLabelIn;
      hexPrismList = hexPrismListIn;
   }

   //Methods
   
   /**
    * This method returns that name of the list.
    *
    * @return listLabel name of list.
    */
   public String getName() {
      return listLabel;
   }

   /**
    * This method returns the number of HexagonalPrism objects in the list.
    *
    * @return size of hexagonalPrism list.
    */
   public int numberOfHexagonalPrisms() {
      return hexPrismList.size();
   }

   /**
    * This method returns the sum of the surface area of all of the objects
    * in the HexagonalPrism list.
    *
    * @return total surface area of all of the objects.
    */
   public double totalSurfaceArea() {
      int i = 0;
      double totalSA = 0.0;
      while (i < hexPrismList.size()) {https://auburn.instructure.com/
            totalSA += hexPrismList.get(i).surfaceArea();
         i++;
      }
      return totalSA;
   }

   /**
    * This method returns the sum of the volume of all of the objects
    * in the HexagonalPrism list.
    *
    * @return total volume of all of the objects.
    */
   public double totalVolume() {
      int i = 0;
      double totalV = 0.0;
      while (i < hexPrismList.size()) {
         totalV += hexPrismList.get(i).volume();
         i++;
      }
      return totalV;
   }

   /**
    * This method returns the average of the surface area of all of the objects
    * in the HexagonalPrism list.
    *
    * @return average surface area of all of the objects.
    */
   public double averageSurfaceArea() {
      if (totalSurfaceArea() == 0.0) {
         return 0.0;
      } else {
         return (double) totalSurfaceArea() / hexPrismList.size();
      }
   }

   /**
    * This method returns the average of the volume of all of the objects
    * in the HexagonalPrism list.
    *
    * @return average volume of all of the objects.
    */
   public double averageVolume() {
      if (totalVolume() == 0.0) {
         return 0.0;
      } else {
         return (double) totalVolume() / hexPrismList.size();
      }
   }

   /**
    * This method converts the object hex into a readable string with
    * by printing the data of each object in the list.
    *
    * @return a string of each objects data.
    */
   public String toString() {
      String output = "----- " + getName() + " -----\n";
      int i = 0;
      while (i < hexPrismList.size()) {
         output += "\n" + hexPrismList.get(i).toString() + "\n";
         i++;
      }
      return output + "\n";
   }

   /**
    * This method returns the average and totals of the surface are and volume
    * of the HexagonalPrisms in the list.
    *
    * @return string breakdown of the data in the list.
    */
   public String summaryInfo() {
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + getName() + " -----";
      output += "\nNumber of HexagonalPrisms: " + hexPrismList.size();
      output += "\nTotal Surface Area: " + f.format(totalSurfaceArea())
         + " square units";
      output += "\nTotal Volume: " + f.format(totalVolume())
         + " cubic units";
      output += "\nAverage Surface Area: " + f.format(averageSurfaceArea()) 
         + " square units";
      output += "\nAverage Volume: " + f.format(averageVolume())
         + " cubic units";
      return output;
   }
}
