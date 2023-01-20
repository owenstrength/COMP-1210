/**
 * This porgram creates a list of InventoryItems and methods to calculate the
 * total cost and add more items to the array.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/7/2022
 */
public class ItemsList {
   
   private InventoryItem[] inventory;
   private int count = 0;

   /**
    * This constructor creates an empty array of length 20 and updates
    * the count of items.
    */
   public ItemsList() {
      inventory = new InventoryItem[20];
      count++;
   }

   /**
    * This method adds an InventoryItem to the list.
    * 
    * @param itemIn item
    */
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }

   /**
    * This method calculates the total cost of all of the items in the array.
    * 
    * @param electronicSurcharge additional cost for electronics
    * @return total cost
    */
   public double calculateTotal(double electronicSurcharge) {
      double total = 0.0;
      for (InventoryItem item : inventory) {
         if (item != null) {
            if (item instanceof ElectronicsItem) {
               total += item.calculateCost() + electronicSurcharge;
            } else {
               total += item.calculateCost();
            }
         }
      }
      return total;
   }

   /**
    * This method returns the list data as a readable string.
    * 
    * @return string of list data
    */
   public String toString() {
      String output = "All inventory:\n\n";
   
      for (InventoryItem item : inventory) {
         if (item != null) {
            output += item.toString() + "\n";
         }
         
      }
   
      return output;
   }
}