/**
 * This program prints items in the ItemsList and their total cost.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/7/2022
 */
public class InventoryListApp {
   /**
    * This varible is the array of items.
    */
   private static ItemsList myItems = new ItemsList();
   /**
    * This method adds 4 items to the IventoryItemList and prints the data.
    *
    * @param args Commandline arguments - not used.
    */
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
   
      System.out.println(myItems.toString());
      System.out.print("Total: " + String.valueOf(myItems.calculateTotal(2.0)));
   
   }
}
