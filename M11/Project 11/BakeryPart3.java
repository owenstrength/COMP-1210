import java.io.FileNotFoundException;

/**
 * This program prints the report the of BakedItem List from an input file.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/10/2022
 */
public class BakeryPart3 {
   /**
    * This Method generates reports for the given input file.
    *
    * @param args input file
    * @throws FileNotFoundException if file is not found
    */

   public static void main(String[] args) throws FileNotFoundException {
      try {
         if (args.length == 0) {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");
         } else {
            BakedItemList myList = new BakedItemList();
            myList.readItemFile(args[0]);
            System.out.println(myList.generateReport());
            System.out.println(myList.generateReportByClass());
            System.out.println(myList.generateReportByPrice());
            System.out.println(myList.generateReportByFlavor());
            System.out.println(myList.generateExcludedRecordsReport());
         }
      } catch (Exception e) {
         System.out.println("Attempted to read file: " + args[0] 
            + " (No such file or directory)");
         System.out.println("Program ending.");
      }
   }
   
}
