class Discount extends Store {
    Discount(int itemPosition, String itemName, double itemPrice, int stockBalance) {
        super(itemPosition, itemName, itemPrice, stockBalance);
        setItemPrice(calculateDiscountedPrice());
    }
    //Renamed the method discountPrice() to calculateDiscountedPrice().
    //Made the calculateDiscountedPrice() method private.
    private double calculateDiscountedPrice() {
        double discount = 0.8;
        return getItemPrice() * discount;
    }
}
