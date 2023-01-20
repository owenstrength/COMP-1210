import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This program tests all of the methods in the PriceCompare class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/11/2022
 */
public class PriceComparatorTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * This method tests the class PriceCompare method compare.
    */
   @Test public void compareTest() {
      BakedItem c = new Cookie("test", "test", 12, "test");
      BakedItem b = new Cookie("test", "test", 12, "test");
      BakedItem d = new Cookie("test", "test", 1, "test");
      PriceComparator p = new PriceComparator();
      Assert.assertEquals(1, p.compare(c, d));
      Assert.assertEquals(-1, p.compare(d, c));
      Assert.assertEquals(0, p.compare(b, c));
   }
}
