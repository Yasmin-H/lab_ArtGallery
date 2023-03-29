import java.util.ArrayList;

public class Gallery {


private String galleryName;
private int till;
private ArrayList<Stocks> stock;

public Gallery(String inputgalleryName){
    this.galleryName = inputgalleryName;
    this.till = 0;
    this.stock = new ArrayList<>();
}


//public void moneyTransfer(Artwork artwork){
  //  artwork.soldArt(this.price - this.wallet)
  //  this.updateTill =
//}




    public ArrayList<Stocks> getStock(){
        return this.stock;
    }



// getters and setters
public String getGalleryName(){
    return this.galleryName;
}
 public void addstock(Stock stock) {
        this.stocks.add(stock);
    }
//    public String getStockName(){
 //   this.Stocks.add(stock);
//    }
}
