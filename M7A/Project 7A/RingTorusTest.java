import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This program tests all of the methods in the RingTorus class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/14/2022
 */
public class RingTorusTest {
   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * This test method checks the functionality of the getLabel 
   * method in the RingTorus class. 
   * A new RingTorus object is created with label "Test", and it is checked 
   * that the method returns this label. 
   */
   @Test public void getLabelTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      Assert.assertEquals(ring1.getLabel(), "Test");
   }

   /**
   * Test the setLabel method of the RingTorus class.
   * Creates a new RingTorus object with a label and tests to see if 
   * setting the label changes the label to the desired string.
   */
   @Test public void setLabelTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      ring1.setLabel("Test2");
      Assert.assertEquals(ring1.getLabel(), "Test2");
   }
   
   /**
    * This test method tests the getLargeRadius method in the RingTorus class.
    * A new RingTorus object is created using a radius of 2.0 and 
    * a small radius of 1.0. The expected large radius is 2.0, and this is
    * compared to the actual large radius using Assert.assertEquals.
    */
   @Test public void getLargeRadiusTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      Assert.assertEquals(ring1.getLargeRadius(), 2.0, 0.00001);
   }
   
   /**
    * This test method tests the setLargeRadius method of the RingTorus 
    * class by initializing a new RingTorus object with a large radius 
    * of 2.0 and a small radius of 1.0.The setLargeRadius method is then 
    * called with an input of 4.0, and the assertEquals method checks that 
    * the new large radius of the RingTorus object is equal to 4.0.
    */
   @Test public void setLargeRadiusTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      ring1.setLargeRadius(4.0);
      Assert.assertEquals(ring1.getLargeRadius(), 4.0, 0.00001);
   
   }

   /**
    * This test method tests the getSmallRadius method in the RingTorus class.
    * A new RingTorus object is created using a radius of 2.0 and 
    * a small radius of 1.0. The expected small radius is 1.0, and this is
    * compared to the actual small radius using Assert.assertEquals.
    */
   @Test public void getSmallRadiusTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      Assert.assertEquals(ring1.getSmallRadius(), 1.0, 0.00001);
   }
      
   /**
    * This test method tests the setSmallRadius method of the RingTorus 
    * class by initializing a new RingTorus object with a large radius 
    * of 2.0 and a small radius of 1.0. The setSmallRadius method is then 
    * called with an input of 1.5, and the assertEquals method checks that 
    * the new small radius of the RingTorus object is equal to 1.5.
    */
   @Test public void setSmallRadiusTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      ring1.setSmallRadius(1.5);
      Assert.assertEquals(ring1.getSmallRadius(), 1.5, 0.00001);
   }

   /**
    * This test method tests the diameter method in the RingTorus class.
    * An instance of RingTorus is created and the expected and actual 
    * diameters are compared.
   */
   @Test public void diameterTest() {
      RingTorus ring1 = new RingTorus("Test", 9.5, 1.25);
      Assert.assertEquals(ring1.diameter(), 21.5, 0.00001);
   }

   /**
    * This test method tests the surfaceArea method in the RingTorus class.
    * An instance of RingTorus is created and the expected and actual 
    * surface areas are compared.
   */
   @Test public void surfaceAreaTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      Assert.assertEquals(ring1.surfaceArea(), 78.95683520871486, 0.00001);
   }

   /**
    * This test method tests the volume method in the RingTorus class.
    * An instance of RingTorus is created and the expected and actual 
    * volumes are compared.
   */
   @Test public void volumeTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      Assert.assertEquals(ring1.volume(), 39.47841760435743, 0.00001);
   }
  

   /**
    * This test method tests the toString method in the RingTorus class.
    * An instance of RingTorus is created and the expected and actual 
    * string outputs are compared.
   */
   @Test public void toStringTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      String testString = "RingTorus \"Test\""
         + "\n\tlarge radius = 2.0 units"
         + "\n\tsmall radius = 1.0 units"
         + "\n\tdiameter = 6.0 units"
         + "\n\tsurface area = 78.957 square units"
         + "\n\tvolume = 39.478 cubic units";
      Assert.assertEquals(ring1.toString(), testString);
   }

   /**
    * This test method tests the getCount method in the RingTorus class.
    * 3 instances of RingTorus are created and count should retrun that 3 
    * instances have been made.
    * 
   */
   @Test public void getCountTest() {
      RingTorus.resetCount();
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      RingTorus ring2 = new RingTorus("Test", 2.0, 1.0);
      RingTorus ring3 = new RingTorus("Test", 2.0, 1.0);
      Assert.assertEquals(RingTorus.getCount(), 3, 0.00001);
   }
   
   /**
    * This test method tests the resetCounter method in the RingTorus class.
    * When the method is called, the counter should be set to 0.
    * This test compares the getCount value to 0.
    */
   @Test public void resetCountTest() {
      RingTorus.resetCount();
      Assert.assertEquals(RingTorus.getCount(), 0, 0.00001);
   }

   /**
    * This test method tests the equals method in the RingTorus class.
    * 2 instances of RingTorus are created. These instances are equal.
    * This method tests if the equals method returns that these 2 instances
    * are equal.
    */
   @Test public void equalsTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      RingTorus ring2 = new RingTorus("Test", 2.0, 1.0);
      Assert.assertTrue(ring1.equals(ring2));
   }
   
   /**
    * This test method tests the hashCode method in the RingTorus class.
    * hashCode should always return 0. This method tests that.
    */
   @Test public void hashCodeTest() {
      RingTorus ring1 = new RingTorus("Test", 2.0, 1.0);
      Assert.assertEquals(ring1.hashCode(), 0, 0.00001);
   }
   
}
