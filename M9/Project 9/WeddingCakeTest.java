import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This program tests all of the method in the Wedding Cake class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/4/2022
 */
public class WeddingCakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
    * This method tests the Wedding Cake class getTiers() method.  
    */
   @Test public void getTiersTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
         "flour", "sugar", "buttermilk", "coffee", 
         "eggs", "butter", "baking soda", "baking powder",  
         "salt"); 
   
      Assert.assertEquals(3, c3.getTiers());
   }

   /** 
    * This method tests the Wedding Cake class setTiers() method.  
    */
   @Test public void setTiersTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
         "flour", "sugar", "buttermilk", "coffee", 
         "eggs", "butter", "baking soda", "baking powder",  
         "salt"); 
   
      c3.setTiers(2);
      Assert.assertEquals(2, c3.getTiers());
   }

   /** 
    * This method tests the Wedding Cake class price() method.  
    */
   @Test public void priceTest() {
      WeddingCake c3 = new WeddingCake("3-Layer/3-Tier", "Vanilla", 1, 3, 3, 
         "flour", "sugar", "buttermilk", "coffee", 
         "eggs", "butter", "baking soda", "baking powder",  
         "salt"); 
   
      Assert.assertEquals(135.00, c3.price(), 0.0001);
   }
}
