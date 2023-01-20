/**
 * A program that contains classes to create a user object. 
 * The user object can have the properties first name, last name, location
 * age, and status.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/9/2022
 */
public class UserInfo {
   // instance varibles
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;

   // constructors

   /**
    * This constructor assigns the name to users and 
    * assigns the default values for location, age, and status.  
    * 
    * @param firstNameIn first name of user.
    * @param lastNameIn last name of user.
    */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
   
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }

   // methods
   /**
    * This method converts object to a readable and understandable string.
    *
    * @return output the user data.
    */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      } else {
         output += "Online";
      } 
   
      return output;
   }
   
   /**
    * This method reassigns the location variable.
    * 
    * @param locationIn location of the User.
    */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
   /**
    * This method reassigns the age variable. Will return a boolean value
    * that describes wether or not age has been set.
    * 
    * @param ageIn age of the User.
    * @return isSet whether or not the age has been set.
    */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }

   /**
    * This method returns the age of the user.
    *
    * @return age the age of the user.
    */
   public int getAge() {
      return age;
   }

   /**
    * This method returns the location of the user.
    *
    * @return location the location of the user
    */
   public String getLocation() {
      return location;
   }

   /**
    * This method updates the status variable to OFFLINE.
    */
   public void logOff() {
      status = OFFLINE;
   }

   /**
    * This method updates the status variable to ONLINE.
    */
   public void logOn() {
      status = ONLINE;
   }

}