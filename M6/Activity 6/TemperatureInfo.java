import java.util.Scanner;
import java.util.ArrayList;

/**
 * This program creates a Temperature object and uses user input to create
 * the object and uses user input to output specific properties of the
 * temperature object.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/27/2022
 */
public class TemperatureInfo {

    /**
     * This method uses user input to create a temperature object.
     * This method also uses user input to print the highest temp, lowest
     * temp, the list itself, and to end the program.
     * 
     * @param args Command Line arguments (not used).
     */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
   
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      Temperatures temps = new Temperatures(tempsList);
   
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, "
            + "[H]igh temp, [P]rint, [E]nd: ");
         choice = userInput.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
         
            case 'P':
               System.out.println(temps);
               break;
         
            case 'E':
               System.out.println("\tDone");
               break;
         
            default:
               System.out.println("\tInvalid choice!");
         }
      } while (choice != 'E');
   }


}
