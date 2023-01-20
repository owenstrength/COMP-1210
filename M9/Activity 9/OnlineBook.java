/**
 * This program inherits the OnlineTextItem class and adds methods for books.
 * 
 * @author Owen Strength
 * @version 10/31/2022
 */
public class OnlineBook extends OnlineTextItem {
   protected String author;

   /**
    * This constructor intializes the values for name, price, and author name.
    *
    * @param nameIn name
    * @param priceIn price
    */
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }

   /**
    * This method sets the author value.
    *
    * @param authorIn author name
    */
   public void setAuthor(String authorIn) {
      author = authorIn;
   }

   /**
    * This method converts the object data to a readable string.
    * @return string of object data
    */
   public String toString() {
      return name + " - " + author + ": $" + String.valueOf(price);
   }
}
