/**
 * This Program prints 4 item objects. An inventory item, an electronics item,
 * an online article item, and an online book area all printed to the console.
 */
public class InventoryApp {

    /**
     * This method prints 4 item objects of differing types.
     * 
     * @param args commandline args - not used.
     */
   public static void main(String[] args) {
      InventoryItem.setTaxRate(0.05);
      InventoryItem item1 = new InventoryItem("Oil change kit", 39.00);
      ElectronicsItem item2 = new ElectronicsItem("Cordless phone", 80.00, 1.8);
      OnlineArticle item3 = new OnlineArticle("Java News", 8.50);
      item3.setWordCount(700);
      OnlineBook item4 = new OnlineBook("Java for Noobs", 13.37);
      item4.setAuthor("L. G. Jones");
   
      System.out.println(item1);
      System.out.println(item2);
      System.out.println(item3);
      System.out.println(item4);
   }
}