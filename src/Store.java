public class Store {
    //changed the access modifiers of the class fields to private to prevent direct access from outside the class
    private double itemPrice;
    private int itemPosition;
    private int stockBalance;
    private String itemName;

    Store(int itemPosition, String itemName, double itemPrice, int stockBalance) {

        this.itemPrice = itemPrice;
        this.itemPosition = itemPosition;
        this.stockBalance = stockBalance;
        this.itemName = itemName;

    }
    //Displaying item information
    void info() {
        System.out.println(itemPosition + itemName + itemPrice + " " + stockBalance + " left");
    }

    double getItemPrice() {
        return itemPrice;
    }

    void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    int getStockBalance() {
        return stockBalance;
    }

    void setStockBalance(int stockBalance) {
        this.stockBalance = stockBalance;
    }

}