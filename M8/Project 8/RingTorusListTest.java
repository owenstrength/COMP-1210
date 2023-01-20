import java.util.Arrays;

import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This program tests all of the methods in the RingTorusList class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/28/2022
 */
public class RingTorusListTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * This method tests the getName method from the RingTorusList class.
    */
   @Test public void getNameTest() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertEquals(list1.getName(), "Test");
   }

   /**
    * This method tests the numberOfRingToruses method from the 
    * RingTorusList class.
    */
   @Test public void numberOfRingTorusesTest() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertEquals(list1.numberOfRingToruses(), 3);
   }

   /**
    * This method tests the totalDiameter method from the 
    * RingTorusList class.
    */
   @Test public void totalDiameterTest() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertEquals(list1.totalDiameter(), 445.98, 0.000001);
   }

   /**
    * This method tests the totalSurfaceArea method from the 
    * RingTorusList class.
    */
   @Test public void totalSurfaceAreaTest() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertEquals(list1.totalSurfaceArea(), 186955.724, 0.01);
   }

   /**
    * This method tests the totalVolume method from the 
    * RingTorusList class.
    */
   @Test public void totalVolumeTest() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertEquals(list1.totalVolume(), 2868020.119, 0.01);
   }

   /**
    * This method tests the averageDiameter method from the 
    * RingTorusList class.
    */
   @Test public void averageDiameterTest1() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertEquals(list1.averageDiameter(), 148.66, 0.01);
   }

   /**
    * This method tests the averageDiameter method from the 
    * RingTorusList class.
    */
   @Test public void averageDiameterTest2() {
      RingTorus[] ringInList = {};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 0);
      Assert.assertEquals(list1.averageDiameter(), 0, 0.01);
   }

   /**
    * This method tests the averageSurfaceArea method from the 
    * RingTorusList class.
    */
   @Test public void averageSurfaceAreaTest1() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertEquals(list1.averageSurfaceArea(), 62318.575, 0.01);
   }

   /**
    * This method tests the averageSurfaceArea method from the 
    * RingTorusList class.
    */
   @Test public void averageSurfaceAreaTest2() {
      RingTorus[] ringInList = {};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 0);
      Assert.assertEquals(list1.averageSurfaceArea(), 0, 0.01);
   }

   /**
    * This method tests the averageVolume method from the 
    * RingTorusList class.
    */
   @Test public void averageVolumeTest1() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertEquals(list1.averageVolume(), 956006.706, 0.01);
   }

   /**
    * This method tests the averageVolume method from the 
    * RingTorusList class.
    */
   @Test public void averageVolumeTest2() {
      RingTorus[] ringInList = {};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 0);
      Assert.assertEquals(list1.averageVolume(), 0, 0.01);
   }

   /**
    * This method tests the getList method from the 
    * RingTorusList class.
    */
   @Test public void getListTest() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertTrue(list1.getList() == ringInList);
   }

   /**
    * This method tests the addRingTorus method from the 
    * RingTorusList class.
    */
   @Test public void addRingTorusTest() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus ring4 = new RingTorus("Test4", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorus[] ringInList2 = {ring1, ring2, ring3, ring4};
   
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      list1.addRingTorus("Test4", 134.28, 32.46);
      Assert.assertEquals(Arrays.toString(list1.getList()), 
         Arrays.toString(ringInList2));
   }

   /**
    * This method tests the findRingTorus method from the 
    * RingTorusList class.
    */
   @Test public void findRingTorusTest() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertTrue(list1.findRingTorus("Test1") == ring1);
      Assert.assertNull(list1.findRingTorus("Test4"));
   }

   /**
    * This method tests the deleteRingTorus method from the 
    * RingTorusList class.
    */
   @Test public void deleteRingTorusTest() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus ring4 = new RingTorus("Test4", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorus[] ringInList2 = {ring1, ring2, ring3, ring4};
   
      RingTorusList list1 = new RingTorusList("Test", ringInList2, 4);
      //System.out.println(Arrays.toString(list1.getList()));
      Assert.assertEquals(list1.deleteRingTorus("Test4"), ring4);
      Assert.assertEquals(Arrays.toString(list1.getList()), 
         Arrays.toString(ringInList));
   }

   /**
    * This method tests the deleteRingTorus method from the 
    * RingTorusList class.
    */
   @Test public void deleteRingTorusTest2() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus ring4 = new RingTorus("Test4", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring3, ring4};
      RingTorus[] ringInList2 = {ring1, ring2, ring3, ring4};
   
      RingTorusList list1 = new RingTorusList("Test", ringInList2, 4);
      //System.out.println(Arrays.toString(list1.getList()));
      Assert.assertEquals(list1.deleteRingTorus("Test2"), ring2);
      Assert.assertEquals(Arrays.toString(list1.getList()), 
         Arrays.toString(ringInList));
   }

   /**
    * This method tests the deleteRingTorus method from the 
    * RingTorusList class.
    */
   @Test public void deleteRingTorusTest3() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus ring4 = new RingTorus("Test4", 134.28, 32.46);
      RingTorus[] ringInList2 = {ring1, ring2, ring3, ring4};
   
      RingTorusList list1 = new RingTorusList("Test", ringInList2, 4);
      
      //System.out.println(Arrays.toString(list1.getList()));
   
      Assert.assertNull(list1.deleteRingTorus("Test5"));
   }

   /**
    * This method tests the editRingTorus method from the 
    * RingTorusList class.
    */
   @Test public void editRingTorusTest1() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus ring4 = new RingTorus("Test3", 3, 2);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorus[] ringInList2 = {ring1, ring2, ring4};
   
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      list1.editRingTorus("Test3", 3, 2);
      Assert.assertFalse(list1.editRingTorus("Test5", 3, 2));
      Assert.assertEquals(Arrays.toString(list1.getList()),
         Arrays.toString(ringInList2));
   }

   /**
    * This method tests the editRingTorus method from the 
    * RingTorusList class.
    */
   @Test public void editRingTorusTest2() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus ring4 = new RingTorus("Test3", 150, 140);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorus[] ringInList2 = {ring1, ring2, ring4};
   
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      list1.editRingTorus("Test3", 150, 140);
   
      Assert.assertEquals(Arrays.toString(list1.getList()),
         Arrays.toString(ringInList2));
   }

   /**
    * This method tests the toString method from the 
    * RingTorusList class.
    */
   @Test public void toStringTest() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertTrue(list1.toString().contains(
         "----- Summary for Test -----"));
   }

   /**
    * This method tests the findRingTorusWithLargestVolume method from the 
    * RingTorusList class.
    */
   @Test public void findRingTorusWithLargestVolumeTest1() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring3 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring2 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus[] ringInList = {ring1, ring2, ring3};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertTrue(list1.findRingTorusWithLargestVolume() == ring2);
   }
   
   /**
    * This method tests the findRingTorusWithLargestVolume method from the 
    * RingTorusList class.
    */
   @Test public void findRingTorusWithLargestVolumeTest2() {
      RingTorus ring1 = new RingTorus("Test1", 9.5, 1.25);
      RingTorus ring2 = new RingTorus("Test2", 35.1, 10.4);
      RingTorus ring3 = new RingTorus("Test3", 134.28, 32.46);
      RingTorus[] ringInList = {ring3, ring2, ring1};
      RingTorusList list1 = new RingTorusList("Test", ringInList, 3);
      Assert.assertEquals(list1.findRingTorusWithLargestVolume(), ring3);
   }
}
