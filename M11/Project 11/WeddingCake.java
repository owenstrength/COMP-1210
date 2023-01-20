/**
 * This program inherits the Cake Class and adds methods for tiers ok the cake.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/4/2022
 */
public class WeddingCake extends Cake {
   
   private int tiers;
   /**
    * Pricing rate for the Wedding Cake.
    */
   public static final double BASE_RATE = 15.0;

   /**
    * This constructor creates a wedding cake object and takes the parameters
    * name, flavor, quantity, layers, tiers, and ingredients.
    *
    * @param nameIn name
    * @param flavorIn flavor
    * @param quantityIn quantity
    * @param layersIn layers
    * @param tiersIn tiers
    * @param ingredientsIn ingredients
    */
   public WeddingCake(String nameIn, String flavorIn, int quantityIn, 
      int layersIn, int tiersIn, String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, layersIn, ingredientsIn);
      tiers = tiersIn;
   }

   /**
    * This method returns the tiers of the wedding cake.
    *
    * @return tiers
    */
   public int getTiers() {
      return tiers;
   }

   /**
    * This method changes the tiers of the wedding cake.
    *
    * @param tiersIn tiers
    */
   public void setTiers(int tiersIn) {
      tiers = tiersIn;
   }

   /**
    * This method returns the price of the wedding cake.
    * @return price
    */
   public double price() {
      return (BASE_RATE * layers * tiers) * quantity;
   }
}
