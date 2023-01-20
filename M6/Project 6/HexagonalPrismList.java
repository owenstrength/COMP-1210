import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.io.File;
import java.util.Scanner;

/**
 * This program uses the HexagonalPrism class to create a list of
 * HexagonalPrism Objects and return outputs of the total and avarege values.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/30/2022
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
      while (i < hexPrismList.size()) {
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
    * This method returns the list of HexagonalPrisms.
    * 
    * @return the list of values of HexagonalPrismList object.
    */
   public ArrayList<HexagonalPrism> getList() {
      return hexPrismList;
   }

   /**
    * This method reads an input file and returns a HexagonalPrismList
    * from the values in the input file.
    *
    * @param fileIn input file.
    * @return new HexagonalPrism List from input file.
    * @throws FileNotFoundException if input file does not exsist.
    */
   public HexagonalPrismList readFile(String fileIn)
      throws FileNotFoundException {
         // get file input
      Scanner fileScan = new Scanner(new File(fileIn));
      String hexLabel = "";
      ArrayList<String> inputList = new ArrayList<>();
      ArrayList<HexagonalPrism> hexList = new ArrayList<>();
      
         // read file input and convert to list
      while (fileScan.hasNext()) {
         inputList.add(fileScan.nextLine());
      }
         // close file
      fileScan.close();
      
         // initialize varibles for iterating through the list
      int index = 0;
      int subIndex = 0;
      String currLabel = "";
      double currEdge = 0.0;
      double currHeight = 0.0;
      
         // iterate through the list
      while (index < inputList.size()) {
         if (index == 0) {
            hexLabel = inputList.get(index);
            
               // object label
         } else if (subIndex == 0) {
            currLabel = inputList.get(index);
            subIndex++;
            
               // object edge
         } else if (subIndex == 1) {
            currEdge = Double.parseDouble(inputList.get(index));
            subIndex++;
            
               // object height
         } else if (subIndex == 2) {
            currHeight = Double.parseDouble(inputList.get(index));
            
               // create new HexagonalPrism object with this data
            HexagonalPrism currPrism = 
                  new HexagonalPrism(currLabel, currEdge, currHeight);
            hexList.add(currPrism);
            subIndex = 0;
         }
         index++;
      }
         // convert arraylist to HexagonalPrismList
      HexagonalPrismList finalHexList = 
               new HexagonalPrismList(hexLabel, hexList);
      return finalHexList;
   }

   /**
    * This method adds a new HexagonalPrism to the HexagonalPrismList.
    *
    * @param labelIn inout label.
    * @param edgeIn input edge.
    * @param heightIn input height.
    */
   public void addHexagonalPrism(String labelIn, double edgeIn, 
      double heightIn) {
      HexagonalPrism temp = new HexagonalPrism(labelIn, edgeIn, heightIn);
      hexPrismList.add(temp);
   }

   /**
    * This method finds a hexagonalPrism based on its label name and returns
    * its values.
    *
    * @param labelIn input label.
    * @return hexagonalPrism.
    */
   public HexagonalPrism findHexagonalPrism(String labelIn) {
      for (int i = 0; i < hexPrismList.size(); i++) {
         if (hexPrismList.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            return hexPrismList.get(i);
         }
      }
      return null;
   }

   /**
    * This method finds and delted a hexagonalPrism based on its label name
    * and returns its values.
    *
    * @param labelIn input label.
    * @return hexagonalPrism.
    */
   public HexagonalPrism deleteHexagonalPrism(String labelIn) {
      HexagonalPrism temp;
      for (int i = 0; i < hexPrismList.size(); i++) {
         if (hexPrismList.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            temp = hexPrismList.get(i);
            hexPrismList.remove(i);
            return temp;
         }
      }
      return null;
   }

   /**
    * This method finds a hexagonalPrism based on its label and replaces
    * its values with the new input values.
    *
    * @param labelIn input label.
    * @param edgeIn new edge value.
    * @param heightIn new height value.
    * @return true if was changed. false if it wasnt changed.
    */
   public Boolean editHexagonalPrism(String labelIn, double edgeIn, 
      double heightIn) {
      for (int i = 0; i < hexPrismList.size(); i++) {
         if (hexPrismList.get(i).getLabel().equalsIgnoreCase(labelIn)) {
            hexPrismList.get(i).setEdge(edgeIn);
            hexPrismList.get(i).setHeight(heightIn);
            return true;
         }
      }
      return false;
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
      return output;
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
