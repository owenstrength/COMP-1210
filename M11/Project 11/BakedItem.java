import java.text.DecimalFormat;

/**
 * This program creates a bakery item with a name, flavor, quantity,
 * and ingredients. There are methods to return and change these parameters.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/4/2022
 */
public abstract class BakedItem implements Comparable<BakedItem> {
   
   protected String name;
   protected String flavor;
   protected int quantity;
   protected String[] ingredients;

   protected static int bakedItemCount = 0;


   /**
    * This constructor contains a name, flavor, quantity, and ingredients.
    *
    * @param nameIn name
    * @param flavorIn flavor
    * @param quantityIn quantity
    * @param ingredientsIn ingredients
    */
   public BakedItem(String nameIn, String flavorIn, int quantityIn, 
      String...ingredientsIn) {
      name = nameIn;
      flavor = flavorIn;
      quantity = quantityIn;
      ingredients = ingredientsIn;
      
      bakedItemCount++;
   }

   /**
    * This method returns the items name.
    *
    * @return name
    */
   public String getName() {
      return name;
   }

   /**
    * This method changes the items name.
    *
    * @param nameIn name
    */
   public void setName(String nameIn) {
      name = nameIn;
   }

   /**
    * This method returns the items flavor.
    *
    * @return flavor
    */
   public String getFlavor() {
      return flavor;
   }

   /**
    * This method changes the items flavor.
    * 
    * @param flavorIn flavor
    */
   public void setFlavor(String flavorIn) {
      flavor = flavorIn;
   }

   /**
    * This method returns the items quantity.
    *
    * @return quantity
    */
   public int getQuantity() {
      return quantity;
   }

   /**
    * This method changes the items quantity.
    *
    * @param quantityIn quantity
    */
   public void setQuantity(int quantityIn) {
      quantity = quantityIn;
   }

   /**
    * This method returns the ingredients.
    *
    * @return ingredients
    */
   public String[] getIngredients() {
      return ingredients;
   }

   /**
    * This method changes the ingredients.
    *
    * @param ingredientsIn ingredients
    */
   public void setIngredients(String...ingredientsIn) {
      ingredients = ingredientsIn;
   }

   /**
    * This method returns the number of baked items created.
    *
    * @return count
    */
   public static int getCount() {
      return bakedItemCount;
   }

   /**
    * This method resets the counter to 0.
    */
   public static void resetCount() {
      bakedItemCount = 0;
   }

   /**
    * This method converts the baked item object into a readable string.
    *
    * @return string of object data
    */
   public final String toString() {
      String output = "";
      int i = 0;
      DecimalFormat f = new DecimalFormat("$#,##0.00");
      output += this.getClass().toString().substring(6) + ": ";
      output += name + " - ";
      output += flavor + "   Quantity: " + String.valueOf(quantity);
      output += "   Price: " + f.format(price());
      output += "\n(Ingredients: ";
   
      for (String ingredient : ingredients) {
         if (i == 5) {
            output += "\n";
            i = 0;
         }
         output += ingredient + ", ";
         i++;
      }
   
      output = output.substring(0, output.length() - 2);
      output += ")";
      return output;
   }

   /**
    * This method compares two bakedItem objects.
    *
    * @param bakedItemIn object to be compared
    * @return int of result
    */
   public int compareTo(BakedItem bakedItemIn) {
      int i = this.toString().compareToIgnoreCase(bakedItemIn.toString());
      return i;
   }

   /**
    * This abstract method returns the price of the item.
    *
    * @return price items
    */
   public abstract double price();
}
