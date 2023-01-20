/**
 * This program prints the report the of BakedItem List from an input file.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/10/2022
 */
public class BakeryPart2 {
   /**
    * This Method generates reports for the given input file.
    *
    * @param args input file
    */

   public static void main(String[] args) {
      try {
         if (args[0] != null) {
            BakedItemList myList = new BakedItemList();
            myList.readItemFile(args[0]);
         
            System.out.println(myList.generateReport());
            System.out.println(myList.generateReportByClass());
            System.out.println(myList.generateReportByPrice());
            System.out.println(myList.generateReportByFlavor());
            System.out.println(myList.generateExcludedRecordsReport());
         }
      
      } catch (Exception FileNotFoundException) {
         System.out.println("File name expected as command line argument.");
         System.out.println("Program ending.");
      }
   }
   
}
