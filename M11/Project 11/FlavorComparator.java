import java.util.Comparator;

/**
 * This program is used to compare the flavor of two bakedItem objects.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/9/2022
 */
public class FlavorComparator implements Comparator<BakedItem> {

   /**
    * This method is used to compare the flavor of two bakedItem objects.
    * 
    * @param b1 bakedItem 1
    * @param b2 bakedItem 2
    * @return int of result
    */
   public int compare(BakedItem b1, BakedItem b2) {
      return b1.getFlavor().compareToIgnoreCase(b2.getFlavor());
   }
}
