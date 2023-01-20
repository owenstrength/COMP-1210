import java.text.DecimalFormat;
/**
 * This program creates a list of RingTorus objects and has methods that
 * return information about the list such as total and average volume.
 * Additionally, the list can be edited. Items can be added or removed.
 * Items can also be search by their label.
 * 
 * @author Owen Strenth - COMP 1210 - 002
 * @version 10/28/2022
 */
public class RingTorusList {
   private String listName;
   private RingTorus[] list;
   private int numRingTorus;

   /**
    * This is a constructor for the RingTorus List with inputs for the list
    * name, the list, and number of items in the list.
    *
    * @param listNameIn - list name.
    * @param listIn - list.
    * @param numRingTorusIn -number of items in list. 
    */
   public RingTorusList(String listNameIn, 
      RingTorus[] listIn, int numRingTorusIn) {
      listName = listNameIn;
      list = listIn;
      numRingTorus = numRingTorusIn;
   }

   /**
    * This method returns the list name.
    *
    * @return list name.
    */
   public String getName() {
      return listName;
   }

   /**
    * This method returns the number of items in the list.
    *
    * @return number of RingToruses
    */
   public int numberOfRingToruses() {
      return numRingTorus;
   }

   /**
    * This method returns the sum of the diameter for each RingTorus.
    *
    * @return total diameter.
    */
   public double totalDiameter() {
      double diameter = 0;
      for (int i = 0; i < numberOfRingToruses(); i++) {
         diameter += list[i].diameter();
      }
      return diameter;
   }

   /**
    * This method returns the sum of the surface area for each RingTorus.
    *
    * @return total surface area.
    */
   public double totalSurfaceArea() {
      double surfaceArea = 0;
      for (int i = 0; i < numberOfRingToruses(); i++) {
         surfaceArea += list[i].surfaceArea();
      }
      return surfaceArea;
   }

   /**
    * This method returns the sum of the volume for each RingTorus.
    *
    * @return total volume.
    */
   public double totalVolume() {
      double volume = 0;
      for (int i = 0; i < numberOfRingToruses(); i++) {
         volume += list[i].volume();
      }
      return volume;
   }

   /**
    * This method returns the average diameter for each RingTorus.
    *
    * @return average diameter.
    */
   public double averageDiameter() {
      double diameter = 0;
      for (int i = 0; i < numberOfRingToruses(); i++) {
         diameter += list[i].diameter();
      }
      if (diameter > 0) {
         return diameter / numberOfRingToruses();
      } else {
         return 0;
      }
   }

   /**
    * This method returns the average surface area for each RingTorus.
    *
    * @return average surface area.
    */
   public double averageSurfaceArea() {
      double surfaceArea = 0;
      for (int i = 0; i < numberOfRingToruses(); i++) {
         surfaceArea += list[i].surfaceArea();
      }
      if (surfaceArea > 0) {
         return surfaceArea / numberOfRingToruses();
      } else {
         return 0;
      }
   }

   /**
    * This method returns the average volume for each RingTorus.
    *
    * @return average volume.
    */
   public double averageVolume() {
      double volume = 0;
      for (int i = 0; i < numberOfRingToruses(); i++) {
         volume += list[i].volume();
      }
      if (volume > 0) {
         return volume / numberOfRingToruses();
      } else {
         return 0;
      }
   }

   /**
    * This method converts the data about the RingTorus list into a readable
    * string.
    *
    * @return string of a summary of the list
    */
   public String toString() {
      String output = "----- Summary for " + getName() + " -----";
      DecimalFormat f = new DecimalFormat("#,##0.0##");
      output += "\nNumber of RingToruses: " 
         + String.valueOf(numberOfRingToruses());
      output += "\nTotal Diameter: " 
         + f.format(totalDiameter()) + " units";
      output += "\nTotal Surface Area: " 
         + f.format(totalSurfaceArea()) + " square units";
      output += "\nTotal Volume: " 
         + f.format(totalVolume()) + " cubic units";
      output += "\nAverage Diameter: " 
         + f.format(averageDiameter()) + " units";
      output += "\nAverage Surface Area: " 
         + f.format(averageSurfaceArea()) + " square units";
      output += "\nAverage Volume: " 
         + f.format(averageVolume()) + " cubic units";
   
      return output;
   }

   /**
    * This method returns the list of RingTorus objects.
    *
    * @return list of RingToruses
    */
   public RingTorus[] getList() {
      return list;
   }

   /**
    * This method adds a RingTorus to the list. 
    *
    * @param labelIn input label.
    * @param largeRadius input large radius.
    * @param smallRadius input small radius.
    */
   public void addRingTorus(String labelIn, 
      double largeRadius, double smallRadius) {
      RingTorus newRing = new RingTorus(labelIn, 
         largeRadius, smallRadius);
      RingTorus[] temp = new RingTorus[numRingTorus + 1];
      for (int i = 0; i < numberOfRingToruses(); i++) {
         temp[i] = list[i];
      }
   
      temp[numRingTorus] = newRing;
      list = temp;
      numRingTorus += 1;
   }

   /**
    * This method returns a RingTorus if there is one that matches its label
    * in the list.
    *
    * @param labelIn label of wanted RingTorus.
    * @return requested RingTorus.
    */
   public RingTorus findRingTorus(String labelIn) {
      for (int i = 0; i < numberOfRingToruses(); i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            return list[i];
         }
      }
      return null;
   };

   /**
    * This method deletes a RingTorus object from the list based on its label.
    *
    * @param labelIn Label of RingTorus to delete.
    * @return deleted RingTorus.
    */
   public RingTorus deleteRingTorus(String labelIn) {
      boolean found = false;
      if (findRingTorus(labelIn) != null) {
         found = true;
      }
   
      if (found) {
         RingTorus[] temp = new RingTorus[numRingTorus - 1];
         RingTorus deletedRing = null;
         int tempI = 0;
         for (int i = 0; i < numberOfRingToruses(); i++) {
            if (!list[i].getLabel().equalsIgnoreCase(labelIn)) {
               temp[tempI] = list[i];
               tempI++;
            } else {
               deletedRing = list[i];
            }
         }
         list = temp;
         numRingTorus -= 1;
         return deletedRing;
      } else {
         return null;
      }
   };

   /**
    * This method takes an input label for a RingTorus and changes the values
    * based on the input radii.
    *
    * @param labelIn input label
    * @param largeRadiusIn input large radius
    * @param smallRadiusIn input small radius
    * @return if the RingTorus was found and edited.
    */
   public boolean editRingTorus(String labelIn, 
      double largeRadiusIn, double smallRadiusIn) {
      for (int i = 0; i < numberOfRingToruses(); i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            if (list[i].getLargeRadius() > smallRadiusIn) {
               list[i].setSmallRadius(smallRadiusIn);
               list[i].setLargeRadius(largeRadiusIn);
            } else {
               list[i].setLargeRadius(largeRadiusIn);
               list[i].setSmallRadius(smallRadiusIn);
            }
            return true;
         }
      }
      return false;
   };

   /**
    * This method retuns the RingTorus with the largest volume.
    *
    * @return RingTorus with largest volume.
    */
   public RingTorus findRingTorusWithLargestVolume() {
      RingTorus temp = null;
      double largestVol = 0;
      for (int i = 0; i < numberOfRingToruses(); i++) {
         if (list[i].volume() > largestVol) {
            temp = list[i];
            largestVol = list[i].volume();
         }
      }
      return temp;
   }

}
