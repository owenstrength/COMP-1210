import java.text.DecimalFormat;
/**
 * This program creates a HexagonalPrism Object with the properties 
 * Label, edge length, and height. The HexagonalPrism class can return 
 * surface area, base area, lateral area and volume. All of these properties
 * are printed using the toString() method.
 * 
 * @author Owen Strength - COMP 1210 - 002
 * @version 9/14/2022
 */
public class HexagonalPrism {
   // instance variables
   private String label = "";
   private double edge = 0;
   private double height = 0;
   
   // constructors

   /**
    * This Constructor assigns the label, edge, adn height variables 
    * using its input.
    * 
    * @param labelIn label input
    * @param edgeIn edge length input 
    * @param heightIn height input
    */
   public HexagonalPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
   }
   // methods
   /**
    * This method returns the label string.
    * 
    * @return the string label
    */
   public String getLabel() {
      return label;
   }

   /**
    * This method sets the label variable and returns true once set.
    *
    * @param labelIn input label
    * @return true if succsessful, else false
    */
   public boolean setLabel(String labelIn) {
      if (labelIn == "" || labelIn == null) {
         return false;
      } else {
         label = labelIn.trim();
         return true;
      }
   }
   /**
    * This method returns the edge length.
    * 
    * @return the double edge
    */
   public double getEdge() {
      return edge;
   }

   /**
    * This method sets the edge variable and returns true once set.
    *
    * @param edgeIn input edge length
    * @return true if succsessful, else false
    */
   public boolean setEdge(double edgeIn) {
      if (edgeIn > 0) {
         edge = edgeIn;
         return true;
      } else {
         return false;
      }
   }

   /**
    * This method returns the height.
    * 
    * @return the double height
    */
   public double getHeight() {
      return height;
   }
   
   /**
    * This method sets the height variable and returns true once set.
    *
    * @param heightIn input height length
    * @return true if succsessful, else false
    */
   public boolean setHeight(double heightIn) {
      if (heightIn > 0) {
         height = heightIn;
         return true;
      } else {
         return false;
      }
   }

   /**
    * This method uses the current edge and height varibles to calculate the
    * surface area.
    * 
    * @return surface area of the hexagonal prism
    */
   public double surfaceArea() {
      return (6 * edge * height) + (3 * Math.sqrt(3) * Math.pow(edge, 2));
   }

   /**
    * This method uses the current edge and height varibles to calculate the
    * lateral surface area.
    * 
    * @return lateral surface area of the hexagonal prism
    */
   public double lateralSurfaceArea() {
      return (6 * edge * height);
   }

   /**
    * This method uses the current edge and height varibles to calculate the
    * base area.
    * 
    * @return base area of the hexagonal prism
    */
   public double baseArea() {
      return (3 * Math.sqrt(3) * (Math.pow(edge, 2) / 2));
   }

   /**
    * This method uses the current edge and height varibles to calculate the
    * volume.
    * 
    * @return volume of the hexagonal prism
    */
   public double volume() {
      return (3 * Math.sqrt(3) / 2 * Math.pow(edge, 2) * height);
   }

   /**
    * This method converts the object to a readable and understandable string.
    *
    * @return output the hexagonal prism data.
    */
   public String toString() {
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      String output = "HexagonalPrism " + "\"" + getLabel() + "\""
         + " has 8 faces, 18 edges, and 12 vertices.";
      output += "\n\tedge = " + f.format(getEdge()) + " units";
      output += "\n\theight = " + f.format(getHeight()) + " units";
      output += "\n\tlateral surface area = "
         + f.format(lateralSurfaceArea()) + " square units";
      output += "\n\tbase area = "
         + f.format(baseArea()) + " square units";
      output += "\n\tsurface area = "
         + f.format(surfaceArea()) + " square units";
      output += "\n\tvolume = "
         + f.format(volume()) + " cubic units";
   
      return output;
   }
}
