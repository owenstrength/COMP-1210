import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * This program recives input from a text file and use the data to
 * create HexagonalPrism objects and add them to a list. The program
 * uses that list to create a HexagonalPrismList object and outputs data
 * regarding the HexagonalPrismList object.
 * 
 * @author Owen Strength
 * @version 9/22/2022
 */
public class HexagonalPrismListApp {
   /**
    * This method revices input from a text file and converts it into a 
    * HexagonalPrismList object.
    *
    * @param args Command line arguments (not used)
    * @throws FileNotFoundException input file doesn't exsist
    */
   public static void main(String[] args) throws FileNotFoundException {
      // initialize variables
      Scanner in = new Scanner(System.in);
      String hexLabel = "mom";
      ArrayList<String> inputList = new ArrayList<>();
      ArrayList<HexagonalPrism> hexList = new ArrayList<>();
   
      // get file input
      System.out.print("Enter file name: ");
      String myFile = in.nextLine();
      Scanner fileScan = new Scanner(new File(myFile));
   
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
   
      // output data
      System.out.println("");
      System.out.println(finalHexList);
      System.out.println(finalHexList.summaryInfo());
   
   }
}
