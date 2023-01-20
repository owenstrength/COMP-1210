/**
 * This program extends the Exception class to create an exception
 * if an invalid category is in an input to create a bakedItem.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/16/2022
 */
public class InvalidCategoryException extends Exception {
   /**
    * This method creates an exception if an invalid category is given.
    * 
    * @param category invalid input category
    */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}
