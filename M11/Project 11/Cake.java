/**
 * This program inherits the Baked Items class and creates method for a cake.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/4/2022
 */
public class Cake extends BakedItem {
   
   protected int layers;
   /**
    * Pricing rate for the cake.
    */
   public static final double BASE_RATE = 8.0;

   /**
    * This constructor creates a cake object with a name, flavor, quantity,
    * layers, and ingredients.
    *
    * @param nameIn name
    * @param flavorIn flavor
    * @param quantityIn quantity
    * @param layersIn layers
    * @param ingredientsIn ingredients
    */
   public Cake(String nameIn, String flavorIn, int quantityIn, int layersIn, 
      String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
      layers = layersIn;
   }

   /**
    * This method returns the number of layers.
    *
    * @return layers
    */
   public int getLayers() {
      return layers;
   }

   /**
    * This method changes the number of layers.
    *
    * @param layersIn layers
    */
   public void setLayers(int layersIn) {
      layers = layersIn;
   }

   /**
    * This method retursn the price of the cake.
    * @return price
    */
   public double price() {
      return (BASE_RATE * layers) * quantity;
   }
}
