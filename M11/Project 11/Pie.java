/**
 * This class inherits the BakedItem class and adds methods for Pies.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/4/2022
 */
public class Pie extends BakedItem {
   
   private double crustCost;
   /**
    * Pricing rate for the pie.
    */
   public static final double BASE_RATE = 12.0;

   /**
    * This contructor creates a Pie object with a name, flavor, quantity,
    * curst cost, and ingredients.
    * @param nameIn name
    * @param flavorIn flavor
    * @param quantityIn quantity
    * @param crustCostIn crust cost
    * @param ingredientsIn ingredidents
    */
   public Pie(String nameIn, String flavorIn, int quantityIn, 
      double crustCostIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      crustCost = crustCostIn;
   }

   /**
    * This method returns the crust cost.
    *
    * @return crust cost
    */
   public double getCrustCost() {
      return crustCost;
   }

   /**
    * This method changes the crust cost.
    *
    * @param crustCostIn crust cost
    */
   public void setCrustCost(double crustCostIn) {
      crustCost = crustCostIn;
   }

   /**
    * This method returns the price of the item.
    *
    * @return price
    */
   public double price() {
      return (BASE_RATE + crustCost) * quantity;
   }
}
