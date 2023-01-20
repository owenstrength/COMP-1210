import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * This program is used to test the BankLoan.java program.
 * 
 * @author Owen Strength
 * @version 10/11/2022
 */
public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   * This method tests the chargeInterest function.
   */
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", .100);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}
