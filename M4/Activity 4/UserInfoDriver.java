/**
 * A program that creates a user object using the UserInfo class.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/9/2022
 */
public class UserInfoDriver {
   /**
   * Uses the UserInfo class to create 2 user and updates their values.
   * The user objects are then printed to the terminal.
   * 
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
   
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}
