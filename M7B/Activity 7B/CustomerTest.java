import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/** 
 * This program tests all of the Method in Customer.java.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/18/2022
*/
public class CustomerTest {

    /** Fixture initialization (common initialization
     *  for all tests). **/
   @Before public void setUp() {
   }

   /**
    * Tests the Customer setLocation function with 1 string.
    */
   @Test public void setLocationTest1() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", cstmr.getLocation());
   }

   /**
    * Tests the Customer setLocation function with 2 strings.
    */
   @Test public void setLocationTest2() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Atlanta", "GA");
      Assert.assertEquals("Atlanta, GA", cstmr.getLocation());
   }

   /**
    * Tests the Customer changeBalance method.
    */
   @Test public void changeBalanceTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.changeBalance(100);
      Assert.assertEquals(100, cstmr.getBalance(), 0.000001);
   }

   /**
    * Tests the Customer toString method.
    */
   @Test public void toStringTest() {
      Customer cstmr = new Customer("Lane, Jane");
      cstmr.setLocation("Auburn, AL");
      cstmr.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", cstmr.toString());
   }

   /**
    * Tests the Customer compareTo method with equal values.
    */
   @Test public void compareToTest1() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      Assert.assertTrue(cstmr1.compareTo(cstmr2) == 0);
   }

   /**
    * Tests the Customer compareTo method with a larger value.
    */
   @Test public void compareToTest2() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(500);
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(1000);
   
      System.out.print(cstmr1.compareTo(cstmr2));
      Assert.assertTrue(cstmr1.compareTo(cstmr2) < 0);
   }

   /**
    * Tests the Customer compareTo method with a smaller value.
    */
   @Test public void compareToTest3() {
      Customer cstmr1 = new Customer("Lane, Jane");
      cstmr1.changeBalance(1000); 
   
      Customer cstmr2 = new Customer("Lane, Lois");
      cstmr2.changeBalance(500);
   
      System.out.print(cstmr1.compareTo(cstmr2));
      Assert.assertTrue(cstmr1.compareTo(cstmr2) > 0);
   }

}
