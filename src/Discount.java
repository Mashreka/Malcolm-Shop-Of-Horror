class Discount extends Store {
    Discount(int itemPosition, String itemName, double itemPrice, int stockBalance) {
        super(itemPosition, itemName, itemPrice, stockBalance);
        setItemPrice(calculateDiscountedPrice());
    }
    //Renamed the method discountPrice() to calculateDiscountedPrice().
    // This new name better reflects the purpose of the method, which is to calculate the discounted price.
    //Made the calculateDiscountedPrice() method private.
    // Since this method is only used internally within the Discount class, it doesn't need to be accessible from outside.
    //Created a new local variable discountedPrice to store the calculated discounted price.
    //Instead of directly modifying the itemPrice property using the setItemPrice() method, we calculate the discounted price and return it
    private double calculateDiscountedPrice() {
        double discount = 0.8;
        double discountedPrice = getItemPrice() * discount;
        return discountedPrice;
    }
}
