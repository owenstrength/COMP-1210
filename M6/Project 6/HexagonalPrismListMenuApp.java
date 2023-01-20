import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * This program uses the HexagonalPrismList object and creates a menu
 * so that the user can read files, print, add, delete, and edit
 * the HexagonalPrismList.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/30/2022
 */
public class HexagonalPrismListMenuApp {

    /**
     * This class consists of a text based menu that use can use to 
     * update and print the values of a HexagonalPrismList object.
     * 
     * @param args Command Line arguments (not used).
     * @throws FileNotFoundException if input file does not exsist.
     */
   public static void main(String[] args) throws FileNotFoundException {
   
      Scanner userIn = new Scanner(System.in);
      char choice = 'Q';
      
      HexagonalPrismList hexPrism = new HexagonalPrismList(null, null);
   
      System.out.println("HexagonalPrism List System Menu");
      System.out.println("R - Read File and Create HexagonalPrism List");
      System.out.println("P - Print HexagonalPrism List");
      System.out.println("S - Print Summary");
      System.out.println("A - Add HexagonalPrism");
      System.out.println("D - Delete HexagonalPrism");
      System.out.println("F - Find HexagonalPrism");
      System.out.println("E - Edit HexagonalPrism");
      System.out.println("Q - Quit");
        
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         choice = userIn.nextLine().toUpperCase().charAt(0);
      
         switch(choice) {
            case 'R':
               // read file
               System.out.print("\tFile name: ");
               String fileName = userIn.nextLine();
               hexPrism = hexPrism.readFile(fileName);
               System.out.println("\tFile read in and" 
                  + " HexagonalPrism List created\n");
               break;
            case 'P':
               // print
               System.out.println("\n" + hexPrism);
               break;
            case 'S':
               // summary
               System.out.println("\n" + hexPrism.summaryInfo() + "\n");
               break;
            case 'A':
               // add
               System.out.print("\tLabel: ");
               String labelIn = userIn.nextLine();
               System.out.print("\tEdge: ");
               double edgeIn = Double.parseDouble(userIn.nextLine());
               System.out.print("\tHeight: ");
               double heightIn = Double.parseDouble(userIn.nextLine());
               hexPrism.addHexagonalPrism(labelIn, edgeIn, heightIn);
               System.out.println("\t*** HexagonalPrism added ***\n");
               break;
            case 'D':
               // delete
               System.out.print("\tLabel: ");
               labelIn = userIn.nextLine();
               if (hexPrism.deleteHexagonalPrism(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               } else {
                  System.out.println("\t\"" + labelIn + "\" deleted\n");
               }
            
               break;
            case 'F':
               // find
               System.out.print("\tLabel: ");
               labelIn = userIn.nextLine();
               if (hexPrism.findHexagonalPrism(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               } else {
                  System.out.println(hexPrism.findHexagonalPrism(labelIn)
                     + "\n");
               }
               break;
            case 'E':
               // edit
               System.out.print("\tLabel: ");
               labelIn = userIn.nextLine();
               System.out.print("\tEdge: ");
               edgeIn = Double.parseDouble(userIn.nextLine());
               System.out.print("\tHeight: ");
               heightIn = Double.parseDouble(userIn.nextLine());
            
               if (hexPrism.editHexagonalPrism(labelIn, edgeIn, heightIn)) {
                  System.out.println("\t\"" 
                     + hexPrism.findHexagonalPrism(labelIn).getLabel() 
                     + "\" successfully edited\n");
               } else {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               break;
            case 'Q':
               break;
             
            default:
               System.out.println("\t*** invalid code ***\n");
            
               
         }
         
      } while (choice != 'Q'); 
   
   }
}
