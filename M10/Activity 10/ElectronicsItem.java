/**
 * This program inherits the InventoryItem class and is intended for
 * electronics items.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/31/2022
 */
public class ElectronicsItem extends InventoryItem {
   
   protected double weight;
   /**
   * This is a public varible for shipping cost.
   */
   public static final double SHIPPING_COST = 1.5;

   /**
    * This constructor assigns the name, price, and weight.
    *
    * @param nameIn name
    * @param priceIn price
    * @param weightIn weight
    */
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      weight = weightIn;
   }

   /**
    * This method uses the InventoryItem calculate cost but also adds
    * shipping price.
    *
    * @return total price
    */
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
}
