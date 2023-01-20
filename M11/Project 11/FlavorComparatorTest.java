import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


/**
 * This program tests all of the methods in the FlavorCompare class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/11/2022
 */
public class FlavorComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * This method tests the class FlavorCompare method compare.
    */
   @Test public void compateTest() {
      BakedItem c = new Cookie("test", "Atest", 12, "test");
      BakedItem b = new Cookie("test", "Atest", 12, "test");
      BakedItem d = new Cookie("test", "Btest", 1, "test");
      FlavorComparator f = new FlavorComparator();
      Assert.assertEquals(-1, f.compare(c, d));
      Assert.assertEquals(1, f.compare(d, c));
      Assert.assertEquals(0, f.compare(b, c));
   }
}

