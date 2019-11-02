public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product,int count,double price) {
    productType = product;
    inventoryCount=count;
    inventoryPrice=price;
  }
  
  // main method
  public static void main(String[] args) {
    Store cookieShop = new Store("cookies",12,3.75);
  }
}
