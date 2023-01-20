import java.io.FileNotFoundException;

import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
//import org.junit.Test.None;

/**
 * This program tests all of the methods in the BakeryPart2 class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/11/2022
 */
public class BakeryPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * This method tests the BakeryPart2 class main method.
    *
    * @throws FileNotFoundException no file
    */
   @Test public void main1Test() throws FileNotFoundException {
      BakedItemList.resetListCount();
   
      String[] in1 = {"baked_item_data.csv"};
      BakeryPart2.main(in1);
   
      Assert.assertEquals(1, BakedItemList.getListCount());
      
   }

   /**
    * This method tests the BakeryPart2 class main method.
    *
    * @throws FileNotFoundException no file
    */
   @Test public void main2Test() throws FileNotFoundException {
      BakedItemList.resetListCount();
   
      String[] in1 = {};
      BakeryPart2.main(in1);
   
      Assert.assertEquals(0, BakedItemList.getListCount());
      
   }

   /**
    * This method tests the BakeryPart2 class main method.
    *
    * @throws FileNotFoundException no file
    */
   @Test public void constructorTest() throws FileNotFoundException {
      BakeryPart2 test = new BakeryPart2(); 
   }
}
