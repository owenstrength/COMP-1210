import java.util.Arrays;

import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before; 
import org.junit.Test;

/**
 * This program tests the methods in the BakedItem and Cookie classes.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/4/2022
 */
public class CookieTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** 
    * This method tests the BakedItem class getName() method.  
    */
   @Test public void getNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt"); 
      Assert.assertEquals("Chips Delight", c.getName());
   }

   /** 
    * This method tests the BakedItem class setName() method.  
    */
   @Test public void setNameTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt"); 
      c.setName("Test Delight");
      Assert.assertEquals("Test Delight", c.getName());
   }

   /** 
    * This method tests the BakedItem class getFlavor() method.  
    */
   @Test public void getFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt"); 
      Assert.assertEquals("Chocolate Chip", c.getFlavor());
   }

   /** 
    * This method tests the BakedItem class setFlavor() method.  
    */
   @Test public void setFlavorTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt"); 
      c.setFlavor("Nuts and Bolts");
      Assert.assertEquals("Nuts and Bolts", c.getFlavor());
   }

   /** 
    * This method tests the BakedItem class getQuantity() method.  
    */
   @Test public void getQuantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt"); 
      Assert.assertEquals(12, c.getQuantity());
   }

   /** 
    * This method tests the BakedItem class setQuantity() method.  
    */
   @Test public void setQuantityTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      // call me 
      c.setQuantity(2052151185);
      Assert.assertEquals(2052151185, c.getQuantity());
   }

   /** 
    * This method tests the BakedItem class getIngredients() method.  
    */
   @Test public void getIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt"); 
      Assert.assertEquals("[flour, sugar, dark chocolate chips, "
         + "butter, baking soda, salt]", 
            Arrays.toString(c.getIngredients()));
   }

   /** 
    * This method tests the BakedItem class setIngredients() method.  
    */
   @Test public void setIngredientsTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      c.setIngredients("iphone 13", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      Assert.assertEquals("[iphone 13, sugar, dark chocolate chips, "
         + "butter, baking soda, salt]",
         Arrays.toString(c.getIngredients()));
   }

   /** 
    * This method tests the BakedItem class resetCounter() method.  
    */
   @Test public void resetCountTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
   
      BakedItem.resetCount();
      Assert.assertEquals(0, BakedItem.getCount());
   }

   /** 
    * This method tests the BakedItem class getCounter() method.  
    */
   @Test public void getCountTest() {
      BakedItem.resetCount();
      Cookie c1 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      Cookie c2 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      Cookie c3 = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      Assert.assertEquals(3, BakedItem.getCount());
   }

   /** 
    * This method tests the BakedItem class toString() method.  
    */
   @Test public void toStringTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      c.setIngredients("iphone 13", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      Assert.assertTrue(c.toString().contains("Chocolate Chip   Quantity: 12"));
   }

   /** 
    * This method tests the Cookie class price() method.  
    */
   @Test public void priceTest() {
      Cookie c = new Cookie("Chips Delight", "Chocolate Chip", 12,  
         "flour", "sugar", "dark chocolate chips",  
         "butter", "baking soda", "salt");
      Assert.assertEquals(4.20, c.price(), 0.0001);
   }
}
