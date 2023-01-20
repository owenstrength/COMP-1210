import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This program tests the method in the Cake class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/4/2022
 */
public class CakeTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
    * This method tests the Cake class getLayers() method.  
    */
   @Test public void getLayersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, 
         "flour", "sugar", "cocoa powder", "vanilla", "eggs", 
         "butter", "baking soda", "baking powder", "salt"); 
   
      Assert.assertEquals(1, c1.getLayers());
   }

   /** 
    * This method tests the Cake class setLayers() method.  
    */
   @Test public void setLayersTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, 
         "flour", "sugar", "cocoa powder", "vanilla", "eggs", 
         "butter", "baking soda", "baking powder", "salt"); 
   
      c1.setLayers(2);
      Assert.assertEquals(2, c1.getLayers());
   }

   /** 
    * This method tests the Cake class price() method.  
    */
   @Test public void priceTest() {
      Cake c1 = new Cake("Birthday", "Chocolate", 1, 1, 
         "flour", "sugar", "cocoa powder", "vanilla", "eggs", 
         "butter", "baking soda", "baking powder", "salt"); 
   
      Assert.assertEquals(8.00, c1.price(), 0.001);
   }
}
