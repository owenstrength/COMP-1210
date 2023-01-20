import java.text.DecimalFormat;

/**
 * This program creates a RingTorus object with a label, outter radius, and
 * inner radius. The object can return the diameter, surface area, and volume.
 * The program can also compare if two RingTorus objects are equal to 
 * eachother. The program also implements the Compareable interface to compare
 * the volumes of 2 RingTorus objects.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 10/20/2022
 */
public class RingTorus implements Comparable<RingTorus> {
   private String label = "";
   private double smallRadius = 0;
   private double largeRadius = 0;
   private static int count = 0;

   /**
    * This constructor sets the label and 2 radii of the RingTorus. 
    * 
    * @param labelIn input label
    * @param largeRadiusIn input outter radius
    * @param smallRadiusIn input inner radius
    */
   public RingTorus(String labelIn, 
      double largeRadiusIn, 
      double smallRadiusIn) {
      setLabel(labelIn);
      setLargeRadius(largeRadiusIn);
      setSmallRadius(smallRadiusIn);
      count++;
   }

   /**
    * This method returns the RingTorus label.
    * 
    * @return the label of the RingTorus
    */
   public String getLabel() {
      return label;
   }

   /**
    * This method changes the value of the RingTorus label.
    * 
    * @param labelIn new label
    * @return if successfully changed label
    */
   public boolean setLabel(String labelIn) {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      } else {
         return false;
      }
   }

   /**
    * This method returns value of the outter radius.
    * 
    * @return large radius
    */
   public double getLargeRadius() {
      return largeRadius;
   }

   /**
    * This method changes the value of the outter radius.
    * 
    * @param largeRadiusIn new radius value
    * @return if change was successful
    */
   public boolean setLargeRadius(double largeRadiusIn) {
      if ((largeRadiusIn > smallRadius) & (largeRadiusIn > 0)) {
         largeRadius = largeRadiusIn;
         return true;
      } else {
         return false;
      }
   }

   /**
    * This method returns the value of the inner radius.
    * 
    * @return small radius
    */
   public double getSmallRadius() {
      return smallRadius;
   }

   /**
    * This method changes the value of the inner radius.
    * 
    * @param smallRadiusIn new inner radius
    * @return if the change was successful
    */
   public boolean setSmallRadius(double smallRadiusIn) {
      if ((smallRadiusIn < getLargeRadius()) && (smallRadiusIn > 0)) {
         smallRadius = smallRadiusIn;
         return true;
      } else {
         return false;
      }
   } 

   /**
    * This method returns the diameter of the RingTorus.
    * 
    * @return diameter
    */
   public double diameter() {
      return (2 * (getLargeRadius() + getSmallRadius()));
   }

   /**
    * This method returns the surface area of the RingTorus.
    * 
    * @return surface area
    */
   public double surfaceArea() {
      return (4 * Math.PI * Math.PI * getSmallRadius() * getLargeRadius());
   }

   /**
    * This method returns the volume of the RingTorus.
    * 
    * @return volume
    */
   public double volume() {
      return (2 * Math.PI * getLargeRadius() * Math.PI
          * Math.pow(getSmallRadius(), 2));
   }

   /**
    * This method converts the RingTorus data to a readable String.
    * 
    * @return RingTorus data
    */
   public String toString() {
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      String output = "RingTorus \"" + getLabel() + "\"";
      output += "\n\tlarge radius = " 
         + f.format((getLargeRadius()))
         + " units";
      output += "\n\tsmall radius = " 
         + f.format((getSmallRadius()))
         + " units";
      output += "\n\tdiameter = " 
         + f.format((diameter())) 
         + " units";
      output += "\n\tsurface area = " 
         + f.format((surfaceArea())) 
         + " square units";
      output += "\n\tvolume = " 
         + f.format((volume()))
         + " cubic units";
      return output;
   }

   /**
    * This method returns the number of RingTorus objects created.
    * 
    * @return number of RingTorus objects
    */
   public static int getCount() {
      return count;
   }

   /**
    * This method resets the counter variable to 0.
    */
   public static void resetCount() {
      count = 0;
   }

   /**
    * This method compares the RingTorus object to another object adn returns
    * if they are equal or not.
    * 
    * @param obj input object
    * @return if objects are equal
    */
   public boolean equals(Object obj) {
      if (!(obj instanceof RingTorus)) {
         return false;
      } else {
         RingTorus rt = (RingTorus) obj;
      
         return (label.equalsIgnoreCase(rt.getLabel())
            && (Math.abs(getLargeRadius() - rt.getLargeRadius()) < 0.000001)
            && (Math.abs(getSmallRadius() - rt.getSmallRadius()) < 0.000001));
      }
   }

   /**
    * This method returns 0.
    * 
    * @return 0
    */
   public int hashCode() {
      return 0;
   }

   /**
    * This method compares one RingTorus's volume to another one's volume.
    * This method uses the Comparable interface.
    * 
    * @param obj input object
    * @return 0 if volume is same, -1 if volume is smaller, else 1
    */
   public int compareTo(RingTorus obj) {
      if (this.volume() < obj.volume()) {
         return -1;
      } else if (this.volume() > obj.volume()) {
         return 1;
      } else {
         return 0;
      }
   }
}
