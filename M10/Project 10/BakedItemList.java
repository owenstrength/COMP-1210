import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

/**
 * This program creates a list of BakedItem objects and a list of objects
 * that are exlcuded from the list.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/10/2022
 */
public class BakedItemList {
   
   private String listName;
   private BakedItem[] itemList = new BakedItem[100];
   private int itemCount = 0;
   private String[] excludedRecords = new String[30];
   private int excludedCount = 0;
   private static int listCount = 0;

   /**
    * This constructor creates the intial bakedItem list and excluded list.
    */
   public BakedItemList() {
      listName = "";
      itemList = new BakedItem[100];
      itemCount = 0;
      excludedRecords = new String[30];
      excludedCount = 0;
      listCount++;
   }

   /**
    * This method returns the list name.
    *
    * @return list name
    */
   public String getListName() {
      return listName;
   }

   /**
    * This method changes the list name.
    *
    * @param listNameIn new list name
    */
   public void setListName(String listNameIn) {
      listName = listNameIn;
   }

   /**
    * This method returns the item list.
    *
    * @return item list
    */
   public BakedItem[] getItemList() {
      return itemList;
   }

   /**
    * This method changes the item list.
    *
    * @param itemListIn input item list
    */
   public void setItemList(BakedItem[] itemListIn) {
      itemList = itemListIn;
      setItemCount(itemListIn.length);
   }

   /**
    * This method returns the number of items in the list.
    *
    * @return number of items in the list
    */
   public int getItemCount() {
      return itemCount;
   }

   /**
    * This method length of the item list.
    *
    * @param itemLength input length
    */
   public void setItemCount(int itemLength) {
      itemCount = itemLength;
   }

   /**
    * This method returns the list of the excluded items.
    *
    * @return excluded items list
    */
   public String[] getExcludedRecords() {
      return excludedRecords;
   }

   /**
    * This method changes the exlcuded items list.
    *
    * @param listIn input list
    */
   public void setExcludedRecords(String[] listIn) {
      excludedRecords = listIn;
      setExcludedCount(listIn.length);
   }

   /**
    * This method returns the number of excluded items.
    *
    * @return number of exlcuded items
    */
   public int getExcludedCount() {
      return excludedCount;
   }

   /**
    * This method changes the number of excluded items.
    *
    * @param lenghtIn input length
    */
   public void setExcludedCount(int lenghtIn) {
      excludedCount = lenghtIn;
   }

   /**
    * This method returns the number of lists created.
    *
    * @return number of lists created
    */
   public static int getListCount() {
      return listCount;
   }

   /**
    * This method sets the number of lists created to 0.
    */
   public static void resetListCount() {
      listCount = 0;
   }

   /**
    * This method reads an input file and adds the items to the item list
    * and the excluded items to the excluded item list. The method also
    * updates each of the respected counts.
    *
    * @param fileName file name input
    * @throws FileNotFoundException if file is not found
    */
   public void readItemFile(String fileName) throws FileNotFoundException {
      File obj = new File(fileName);
      String newListName = "";
      Scanner fileScan = new Scanner(obj);
      newListName = fileScan.nextLine();
      listName = newListName;
   
      String line;
      while (fileScan.hasNextLine()) {
         line = fileScan.nextLine();
         Scanner lineScan = new Scanner(line);
         lineScan.useDelimiter(",");
      
         char type = lineScan.next().charAt(0);
         BakedItem item = null;
         switch (type) {
            case 'C':
               String itemName = lineScan.next();
               String itemFlavor = lineScan.next();
               int itemQuant = lineScan.nextInt();
               String[] ingredients = new String[50];
               int i = 0;
               while (lineScan.hasNext()) {
                  ingredients[i] = lineScan.next();
                  i++;
               }
            
               String[] ingredientsFinal = Arrays.copyOf(ingredients, i);
               item = new Cookie(itemName, itemFlavor, itemQuant, 
                  ingredientsFinal);
               break;
            case 'P':
               String itemNameP = lineScan.next();
               String itemFlavorP = lineScan.next();
               int itemQuantP = lineScan.nextInt();
               double itemCrustP = lineScan.nextDouble();
               String[] ingredientsP = new String[50];
               int iP = 0;
               while (lineScan.hasNext()) {
                  ingredientsP[iP] = lineScan.next();
                  iP++;
               }
            
               String[] ingredientsFinalP = Arrays.copyOf(ingredientsP, iP);
               item = new Pie(itemNameP, itemFlavorP, itemQuantP, itemCrustP,
                  ingredientsFinalP);
               break;
            case 'K':
               String itemNameK = lineScan.next();
               String itemFlavorK = lineScan.next();
               int itemQuantK = lineScan.nextInt();
               int itemLayersK = lineScan.nextInt();
               String[] ingredientsK = new String[50];
               int iK = 0;
               while (lineScan.hasNext()) {
                  ingredientsK[iK] = lineScan.next();
                  iK++;
               }
            
               String[] ingredientsFinalK = Arrays.copyOf(ingredientsK, iK);
               item = new Cake(itemNameK, itemFlavorK, itemQuantK, 
                  itemLayersK, ingredientsFinalK);
               break;
            case 'W':
               String itemNameW = lineScan.next();
               String itemFlavorW = lineScan.next();
               int itemQuantW = lineScan.nextInt();
               int itemLayersW = lineScan.nextInt();
               int itemTiersW = lineScan.nextInt();
               String[] ingredientsW = new String[50];
               int iW = 0;
               while (lineScan.hasNext()) {
                  ingredientsW[iW] = lineScan.next();
                  iW++;
               }
            
               String[] ingredientsFinalW = Arrays.copyOf(ingredientsW, iW);
               item = new WeddingCake(itemNameW, itemFlavorW, itemQuantW, 
                  itemLayersW, itemTiersW, ingredientsFinalW);
               break;
            default:
               excludedRecords[excludedCount++] = 
                  "*** invalid category *** for line:\n" 
                  + type + lineScan.nextLine();
               continue;
         }
      
         itemList[itemCount++] = item;
         lineScan.close();
      }
      fileScan.close();
   } 

   /**
    * This method creates a string of items list and exlcuded item list
    * in the order of the input file.
    *
    * @return string of items
    */
   public String generateReport() {
      String output = "\n";
      output += "---------------------------------------\n";
      output += "Report for " + this.getListName();
      output += "\n---------------------------------------\n\n";
      BakedItem[] bList = Arrays.copyOf(itemList, itemCount);
      for (BakedItem item : bList) {
         output += item.toString() + "\n\n";
      }
      return output.substring(0, output.length() - 1);
   }

   /**
    * This method creates a string of items listt
    * in the order of the class name.
    *
    * @return string of items
    */
   public String generateReportByClass() {
      String output = "\n";
      output += "---------------------------------------\n";
      output += "Report for " + this.getListName() + " (by Class)";
      output += "\n---------------------------------------\n\n";
      BakedItem[] bList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(bList);
      for (BakedItem item : bList) {
         output += item.toString() + "\n\n";
      }
      return output.substring(0, output.length() - 1);
   }

   /**
    * This method creates a string of items list
    * in the order of the price.
    *
    * @return string of items
    */
   public String generateReportByPrice() {
      String output = "\n";
      output += "---------------------------------------\n";
      output += "Report for " + this.getListName() + " (by Price)";
      output += "\n---------------------------------------\n\n";
      BakedItem[] bList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(bList, new PriceComparator());
      for (BakedItem item : bList) {
         output += item.toString() + "\n\n";
      }
      return output.substring(0, output.length() - 1);
   }

   /**
    * This method creates a string of items list
    * in the order of the flavor name.
    *
    * @return string of items
    */
   public String generateReportByFlavor() {
      String output = "\n";
      output += "---------------------------------------\n";
      output += "Report for " + this.getListName() + " (by Flavor)";
      output += "\n---------------------------------------\n\n";
      BakedItem[] bList = Arrays.copyOf(itemList, itemCount);
      Arrays.sort(bList, new FlavorComparator());
      int i = 0;
      for (BakedItem item : bList) {
         output += item.toString() + "\n\n";
         i++;
      }
      return output.substring(0, output.length() - 1);
   }

   /**
    * This method creates a string of exlcuded item list
    * in the order of the class name.
    *
    * @return string of items
    */
   public String generateExcludedRecordsReport() {
      String output = "";
      output += "\n---------------------------------------\n";
      output += "Excluded Records Report";
      output += "\n---------------------------------------\n\n";
      String[] bList = Arrays.copyOf(excludedRecords, excludedCount);
      for (String item : bList) {
         output += item.toString() + "\n";
      }
      return output.substring(0, output.length() - 1) + "\n";
   }
}
