/**
 * This program is used to create a NumberOperations class which is created
 * given an integer. The class can return the integer, the odds under,
 * the powers of two under, and if the number is greater than another number.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/19/2022
 */
public class NumberOperations {
   private int number;
   /**
    * This is the constructor for the NumberOperations class that assigns
    * number to the given input,.
    *
    * @param numberIn input number.
    */
   public NumberOperations(int numberIn) {
      number = numberIn;
   }
   /**
    * This method returns the number.
    *
    * @return the number.
    */
   public int getValue() {
      return number;
   }

   /**
    * This method returns a string of a all odd numbers less than the number.
    *
    * @return all odd numbers less than the number.
    */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }

   /**
    * This method returns all of the powers of two that are less than the
    * number.
    *
    * @return the powers of 2 less than the number.
    */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }

   /**
    * This method returns if the number is greater than or less than the input
    * of the number that it is being compared to.
    *
    * @param compareNumber the number 'number' is being compared to. 
    * @return -1, 1, or 0 based on if number is greater than compare number.
    */
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      }
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   }
   /**
    * This method converts the object to a string so that when it is called,
    * the values of the object are easily readable.
    *
    * @return the stringified version of the object.
    */
   public String toString() {
      return number + "";
   }
}