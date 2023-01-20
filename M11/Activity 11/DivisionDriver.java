import javax.swing.JOptionPane;

/**
 * This propgram uses the Division class and JOptionPane to take two inputs
 * and return the integer and decimal divison results in the JOptionPane.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 11/14/2022
 */
public class DivisionDriver {
   /**
    * This method method uses the JOptionPane to get two inputs and return
    * the integer and deciaml divison results.
    * 
    * @param args command line arguments not used
    */
   public static void main(String[] args) {
      String numInput
         = JOptionPane.showInputDialog("Enter the numerator:");
      
      String denomInput
         = JOptionPane.showInputDialog("Enter the denominator:");
   
      try {
         int num = Integer.valueOf(numInput);
         int denom = Integer.valueOf(denomInput);
      
         String result = "Integer division: \n"
            + Division.intDivide(num, denom)
            + "\n\nFloating point division: \n"
            + Division.decimalDivide(num, denom);
      
         JOptionPane.showMessageDialog(null, result,
            "Result", JOptionPane.PLAIN_MESSAGE);
      } catch (NumberFormatException e) {
         JOptionPane.showMessageDialog(null, 
            "Invalid input: enter numerical integer values only.", 
            "Error", JOptionPane.ERROR_MESSAGE);
      } catch (IllegalArgumentException e) {
         JOptionPane.showMessageDialog(null, e,
            "Error", JOptionPane.ERROR_MESSAGE);
      }
   }
}
