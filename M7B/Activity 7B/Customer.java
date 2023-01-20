/**
 * This program consists of a customer with a name, location, and balance.
 * The program also uses the Comparable interface.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/18/2022
 */
public class Customer implements Comparable<Customer> {
   private String name;
   private String location;
   private double balance;

   /**
    * This constructor intitalizes the variables for the Customer object.
    * 
    * @param nameIn input name
    */
   public Customer(String nameIn) {
      name = nameIn;
      location = "";
      balance = 0;
   }

   /**
    * This method changes the location variable.
    *
    * @param locationIn new location
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }

   /**
    * This method also sets the location but uses 2 strings
    * for the city and state instead of 1 string.
    *
    * @param city new city
    * @param state new state
    */
   public void setLocation(String city, String state) {
      location = city + ", " + state;
   }

   /**
    * This method adds the input amount to the current balance.
    *
    * @param amount amount to add
    */
   public void changeBalance(double amount) {
      balance += amount;
   }

   /**
    * This method returns the customers location.
    *
    * @return customer location
    */
   public String getLocation() {
      return location;
   }

   /**
    * This method returns the customers balance.
    * 
    * @return customer balance
    */
   public double getBalance() {
      return balance;
   }

   /**
    * This method returns the customer object data into a readable string.
    * 
    * @return string of output
    */
   public String toString() {
      String output = "";
      output += name;
      output += "\n" + location;
      output += "\n$" + String.valueOf(balance);
      return output;
   }

   /**
    * This method compares one cutomer's balance to another one's balance.
    * This method uses the Comparable interface.
    * 
    * @param obj input object
    * @return 0 if ballance is same, -1 if balance is smaller, else 1
    */
   public int compareTo(Customer obj) {
      if (Math.abs(this.getBalance() - obj.getBalance()) < 0.000001) {
         return 0;
      } else if (this.getBalance() < obj.getBalance()) {
         return -1;
      } else {
         return 1;
      }
   }

}