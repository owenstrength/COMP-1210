/**
 * This program creates division methods for integer and deciaml division.
 * These methods throw errors if divison by 0 is attempted.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/14/2022
 */
public class Division {

   /**
    * This method performs integer division.
    * 
    * @param a numerator
    * @param b denominator
    * @return result
    */
   public static int intDivide(int a, int b) {
      try {
         return (a / b);
      } catch (ArithmeticException e) {
         return 0;
      }
   }

   /**
    * This method performs decimal division.
    * 
    * @param a numerator
    * @param b denominator
    * @return result
    */
   public static double decimalDivide(int a, int b) {
      if (b == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
      return (Double.valueOf(a) / Double.valueOf(b));
   }
}