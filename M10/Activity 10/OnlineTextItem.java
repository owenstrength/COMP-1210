/**
 * This program inherits the InventoryItem class and adds methods for 
 * Online text items.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/31/2022
 */
public abstract class OnlineTextItem extends InventoryItem {
   
    /**
     * This constructs initialized the name and price of the text.
     * 
     * @param nameIn name
     * @param priceIn price
     */
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }

   /**
    * This method returns the price of the item.
    * @return price
    */
   public double calculateCost() {
      return price;
   }
}
