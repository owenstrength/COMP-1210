import java.util.Scanner;
/**
 * A simple program that prints statistics about an age based on user input. 
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 8/26/2022
 */
public class AgeStatistics {
   /**
    * Gets user input for name, age, and gender. 
    * Prints age in minutes and centuries
    * 
    *
    * @param args Command line arguments - not used.
    */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      
      // Prompt User for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      // Prompt User for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      // Prompt User for their age:
      System.out.print("Enter your gender "
         + "(1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      // Convert age:
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
   
      // calculate max heart rate
   
      if (gender == 1) {
         maxHeartRate = 209 - (0.7 * ageInYears);
      } else {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
   
      // display max heart rate
      System.out.print("Your max heart rate is "
         + maxHeartRate + " beats per minute.");
   }
}