class Discount extends Store {
    Discount(int itemPosition, String itemName, double itemPrice, int stockBalance) {
        super(itemPosition, itemName, itemPrice, stockBalance);
        setItemPrice(discountPrice());
    }

    double discountPrice() {
        double discount = 0.8;
        setItemPrice(getItemPrice() * discount);
        return getItemPrice();
    }
}
