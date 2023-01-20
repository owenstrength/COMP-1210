import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This program tests all of the methof in the BakedItemList class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/11/2022
 */
public class BakedItemListTest {

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
    * This method tests the BakedItemList class 
    * getListName method.
    */
   @Test public void getListNameTest() {
      BakedItemList b = new BakedItemList();
      b.setListName("list1");
      Assert.assertEquals("list1", b.getListName());
   }

   /**
    * This method tests the BakedItemList class 
    * setListName method.
    */
   @Test public void setListNameTest() {
      BakedItemList b = new BakedItemList();
      b.setListName("list1");
      Assert.assertEquals("list1", b.getListName());
   }

   /**
    * This method tests the BakedItemList class 
    * getItemsList method.
    */
   @Test public void getItemsListTest() {
      BakedItemList b = new BakedItemList();
      Cookie c = new Cookie("test", "test", 0, "test");
      BakedItem[] bList = {c};
      b.setItemList(bList);
      Assert.assertEquals(bList[0], b.getItemList()[0]);
   }

   /**
    * This method tests the BakedItemList class 
    * setItemsList method.
    */
   @Test public void setItemsListTest() {
      BakedItemList b = new BakedItemList();
      Cookie c = new Cookie("test", "test", 0, "test");
      BakedItem[] bList = {c};
      b.setItemList(bList);
      Assert.assertEquals(bList[0], b.getItemList()[0]);
   }

   /**
    * This method tests the BakedItemList class 
    * getItemCount method.
    */
   @Test public void getItemCountTest() {
      BakedItemList b = new BakedItemList();
      Cookie c = new Cookie("test", "test", 0, "test");
      BakedItem[] bList = {c};
      b.setItemList(bList);
      Assert.assertEquals(1, b.getItemCount());
   }

   /**
    * This method tests the BakedItemList class 
    * setItemCount method.
    */
   @Test public void setItemCountTest() {
      BakedItemList b = new BakedItemList();
      Cookie c = new Cookie("test", "test", 0, "test");
      BakedItem[] bList = {c};
      b.setItemList(bList);
      Assert.assertEquals(1, b.getItemCount());
   }

   /**
    * This method tests the BakedItemList class 
    * getExcludedRecords method.
    */
   @Test public void getExcludedRecordsTest() {
      BakedItemList b = new BakedItemList();
      String c = "Cookie";
      String[] bList = {c};
      b.setExcludedRecords(bList);
      Assert.assertEquals(bList[0], b.getExcludedRecords()[0]);
   }

   /**
    * This method tests the BakedItemList class 
    * setExcludedRecords method.
    */
   @Test public void setExcludedRecordsTest() {
      BakedItemList b = new BakedItemList();
      String c = "Cookie";
      String[] bList = {c};
      b.setExcludedRecords(bList);
      Assert.assertEquals(bList[0], b.getExcludedRecords()[0]);
   }

   /**
    * This method tests the BakedItemList class 
    * getExcludedCount method.
    */
   @Test public void getExcludedCountTest() {
      BakedItemList b = new BakedItemList();
      String c = "Cookie";
      String[] bList = {c};
      b.setExcludedRecords(bList);
      Assert.assertEquals(1, b.getExcludedCount());
   }

   /**
    * This method tests the BakedItemList class 
    * setExcludedCount method.
    */
   @Test public void setExcludedCountTest() {
      BakedItemList b = new BakedItemList();
      String c = "Cookie";
      String[] bList = {c};
      b.setExcludedRecords(bList);
      b.setExcludedCount(0);
      Assert.assertEquals(0, b.getExcludedCount());
   }
   
   /**
    * This method tests the BakedItemList class 
    * getListCount method.
    */
   @Test public void getListCountTest() {
      BakedItemList.resetListCount();
      BakedItemList b = new BakedItemList();
      BakedItemList c = new BakedItemList();
      Assert.assertEquals(2, BakedItemList.getListCount());
   }

   /**
    * This method tests the BakedItemList class 
    * resetListCount method.
    */
   @Test public void resetListCountTest() {
      BakedItemList.resetListCount();
      BakedItemList b = new BakedItemList();
      BakedItemList c = new BakedItemList();
      BakedItemList.resetListCount();
      Assert.assertEquals(0, BakedItemList.getListCount());
   }

   /**
    * This method tests the BakedItemList class 
    * readItemFile method.
    */
   @Test public void readItemFileTest() {
      BakedItemList b = new BakedItemList();
      try {
         b.readItemFile("baked_item_data.csv");
         Assert.assertEquals(b.getItemList()[0].getFlavor(), "Chocolate Chip");
         Assert.assertEquals(b.getItemList()[1].getFlavor(), "Apple");
         Assert.assertTrue(b.getExcludedRecords()[0].contains("D"));  
      } catch (Exception e) {
         System.out.println("no file");
      }
   }

   /**
    * This method tests the BakedItemList class 
    * generateReport method.
    */
   @Test public void generateReportTest() {
      BakedItemList b = new BakedItemList();
      try {
         b.readItemFile("baked_item_data.csv");
         Assert.assertTrue(
            b.generateReport().startsWith("Cookie: Chips Delight"));
      } catch (Exception e) {
         System.out.println("no file");
      }
   }

   /**
    * This method tests the BakedItemList class 
    * generateReportByClass method.
    */
   @Test public void generateReportByClassTest() {
      BakedItemList b = new BakedItemList();
      try {
         b.readItemFile("baked_item_data.csv");
         Assert.assertTrue(
            b.generateReportByClass().startsWith("Cake: 2-Layer - Red Velvet"));
      } catch (Exception e) {
         System.out.println("no file");
      }
   }

   /**
    * This method tests the BakedItemList class 
    * generateReportByPrice method.
    */
   @Test public void generateReportByPriceTest() {
      BakedItemList b = new BakedItemList();
      try {
         b.readItemFile("baked_item_data.csv");
         Assert.assertTrue(
            b.generateReportByPrice().startsWith("Cookie: Chips Delight"));
      } catch (Exception e) {
         System.out.println("no file");
      }
   }

   /**
    * This method tests the BakedItemList class 
    * generateReportByFlavor method.
    */
   @Test public void generateReportByFlavorTest() {
      BakedItemList b = new BakedItemList();
      try {
         b.readItemFile("baked_item_data.csv");
         Assert.assertTrue(
            b.generateReportByFlavor()
            .startsWith("Pie: Weekly Special - Apple"));
      } catch (Exception e) {
         System.out.println("no file");
      }
   }

   /**
    * This method tests the BakedItemList class 
    * generateExcludedRecordsReport method.
    */
   @Test public void generateExcludedRecordsReportTest() {
      BakedItemList b = new BakedItemList();
      try {
         b.readItemFile("baked_item_data.csv");
         Assert.assertTrue(
            b.generateExcludedRecordsReport()
            .startsWith("*** invalid category *** for line: "));
      } catch (Exception e) {
         System.out.println("no file");
      }
   }
}
