import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This program test the method in the Pie class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/4/2022
 */
public class PieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
    * This method tests the Pie class getCrust() method.  
    */
   @Test public void getCrustCost() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
         "flour", "sugar", "apples", "cinnamon", 
         "butter", "baking soda", "salt"); 
   
      Assert.assertEquals(0, p1.getCrustCost(), 0.0001);
   }

   /** 
    * This method tests the Pie class setCrust() method.  
    */
   @Test public void setCrustCost() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
         "flour", "sugar", "apples", "cinnamon", 
         "butter", "baking soda", "salt"); 
      p1.setCrustCost(1);
   
      Assert.assertEquals(1, p1.getCrustCost(), 0.0001);
   }

   /** 
    * This method tests the Pie class price() method.  
    */
   @Test public void priceTest() {
      Pie p1 = new Pie("Weekly Special", "Apple", 1, 0, 
         "flour", "sugar", "apples", "cinnamon", 
         "butter", "baking soda", "salt"); 
   
      Assert.assertEquals(12.00, p1.price(), 0.0001);
   }
}
