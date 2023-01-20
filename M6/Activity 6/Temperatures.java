import java.util.ArrayList;

/**
 * This program creates a temperatures list class. The temperature list can
 * return, the highest and lowest temperature, compare temperatures, and print
 * the content in a readable format.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/27/2022
 */
public class Temperatures {
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
   /**
    * This constructor takes a list and assaigns it to the temperature list.
    * @param temperaturesIn temperature list
    */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }

   /**
    * This method returns the lowest temperature in the list.
    * @return lowest temperature.
    */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }

   /**
    * This method returns the highest temperature in the list.
    * @return highest temperature.
    */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }

   /**
    * This method converts the object data into a readable format.
    *
    * @return string of data.
    */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }

   /**
    * This method compares the input temperature to the lowest temperature
    * and returns the lower temperature.
    * @param lowIn input temperature
    * @return lowest temperature
    */
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }

   /**
    * This method compares the input temperature to the highest temperature
    * and returns the higher temperature.
    * @param highIn input temperature
    * @return higher temperature
    */
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
}