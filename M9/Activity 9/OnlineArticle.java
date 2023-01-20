/**
 * This program inherits the OnlineTextItem and adds method for an article.
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;

   /**
    * This constructor initalizes the name, price, and word count.
    *
    * @param nameIn name
    * @param priceIn price
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }

   /**
    * This method sets the wordCount variable.
    *
    * @param wordCountIn word count
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
}
