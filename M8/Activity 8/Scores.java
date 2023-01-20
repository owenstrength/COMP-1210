/**
 * This program has a class Scores that which has an array for numbers.
 * This Scores class has methods that return the evens, odds, the average,
 * return the numbers in a string, and return the numbers in a string in
 * reverse order.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/24/2022
 */
public class Scores {
   private int[] numbers;

   /**
    * This is a constructer that contains an int array numbers.
    * @param numbersIn input array
    */
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }

   /**
    * This method returns all of the even numbers in the numbers int array.
    * @return all even numbers in array
    */
   public int[] findEvens() {
      int numberEvens = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
   
      int[] evens = new int[numberEvens];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      return evens;
   }

   /**
    * This method returns all of the odd numbers in the numbers int array.
    * @return all odd numbers in array
    */
   public int[] findOdds() {
      int numberOdds = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            numberOdds++;
         }
      }
   
      int[] odds = new int[numberOdds];
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 1) {
            odds[count] = numbers[i];
            count++;
         }
      }
      return odds;
   }

   /**
    * This method returns the average of all of the numbers in the int array.
    * @return average of int array numbers
    */
   public double calculateAverage() {
      int sum = 0;
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      return sum / numbers.length;
   }

   /**
    * This method returns the numbers in the array in order.
    * @return numbers in the int array 
    */
   public String toString() { 
      String result = "";
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }

   /**
    * This method returns the numbers in the array in reverse order.
    * @return numbers in the int array in reverse order
    */
   public String toStringInReverse() {
      String result = "";
      for (int i = numbers.length - 1; i > -1; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }
}