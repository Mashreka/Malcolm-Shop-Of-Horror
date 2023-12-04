public class Store {
    double itemPrice;
    int itemPosition;
    int stockBalance;
    String itemName;

    Store(int itemPosition, String itemName, double itemPrice, int stockBalance) {

        this.itemPrice = itemPrice;
        this.itemPosition = itemPosition;
        this.stockBalance = stockBalance;
        this.itemName = itemName;

    }

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