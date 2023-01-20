/**
 * This program creates an inventory object with a name and price.
 * This program also assigns a tax rate to the items.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/31/2022
 */
public class InventoryItem {

   protected String name;
   protected double price;
   private static double taxRate = 0;

   /**
    * This constructor assigns the name and price of the item.
    *
    * @param nameIn name
    * @param priceIn price
    */
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
   /**
    * this method returns the name of the item.
    *
    * @return name of object
    */
   public String getName() {
      return name;
   }

   /**
    * this method calculates the total cost of the item.
    *
    * @return total price
    */
   public double calculateCost() {
      return price * (1 + taxRate);
   }

   /**
    * This method sets the tax rate.
    *
    * @param taxRateIn tax rate
    */
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }

   /**
    * This method converts the objects data to a readable string.
    *
    * @return string data of the item
    */
   public String toString() {
      return name + ": $" + String.valueOf(calculateCost());
   }
}