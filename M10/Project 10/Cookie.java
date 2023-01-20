/**
 * This class inherits the BakedItem class and creates methods for cookies.
 * 
 * @author Owen Strength - COMP 1210 - 002
 */
public class Cookie extends BakedItem {
   
   /**
    * Pricing rate for the cookie.
    */
   public static final double BASE_RATE = 0.35;

   /**
    * This constructor uses the name, flavor, quantity, and ingredients to
    * create a Cookie object.
    *
    * @param nameIn name
    * @param flavorIn flavor
    * @param quantityIn quantity
    * @param ingredientsIn ingredients
    */
   public Cookie(String nameIn, String flavorIn, int quantityIn, 
      String...ingredientsIn) {
      super(nameIn, flavorIn, quantityIn, ingredientsIn);
   }

   /**
    * This method returns the price of the Cookie.
    * @return price
    */
   public double price() {
      return BASE_RATE * quantity;
   }
}
